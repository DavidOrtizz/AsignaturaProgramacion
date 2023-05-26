package uno2_examen;

/**
 * Prueba del juego UNO VERSIÓN 2
 * Partida jugable, entre una persona y el ordenador, que debe llamarse "HAL"
 * Si el jugador
 * 
 * @ Author Pablo Carmona
 * 
 * @param args
 */

public class Uno2 {

  // Atributos de clase. Variables globales. NO TOCAR!
  static final int NUM_CARTAS = 30; // 4 colores x 5 números, 4 (+) y 2 comodines
  static Jugador jugador1 = new Jugador("HAL"); // Intro, top5 y preguntar nombre de jugador,
  static Jugador jugador2 = new Jugador(Print.intro()); // Jugador del ordenador
  static Jugador jugadorTurno = jugador2; // El jugador que empieza

  // =======================================================================================================================================
  // MÉTODOS POR MODIFICAR!!
  // Sustituir Array de Carta por ArrayList de Carta
  // =======================================================================================================================================

  // Lista de cartas para el mazo. Cada una contiene color y número.
  static Carta[] cartas = crearCartas(NUM_CARTAS);

  // barajarCartas
  // Recorre la lista de cartas, desordenándolas aleatoriamente
  // -------------------------------------------------------------------------------------------------------------------------------------
  public static void barajarCartas() {
    for (int i = 0; i < cartas.length; i++) {
      int j = (int) (Math.random() * cartas.length);
      Carta aux = cartas[i];
      cartas[i] = cartas[j];
      cartas[j] = aux;
    }
  }

  // hayCartasEnMazo
  // Devuelve true si hay alguna carta en la lista que no sea null
  // -------------------------------------------------------------------------------------------------------------------------------------
  public static boolean hayCartasEnMazo() {
    boolean hay = false;
    for (Carta c : cartas) {
      if (c != null) {
        hay = true;
        break;
      }
    }
    return hay;
  }

  // Devuelve la primera carta del mazo que no es null, y su lugar en el array lo
  // pone a null, para eliminarla del mazo
  // En el array de cartas irán quedando null a la izquierda, y cartas a la
  // derecha
  // -------------------------------------------------------------------------------------------------------------------------------------
  public static Carta robaDelMazo() {
    Carta roba = null;
    for (int i = 0; i < cartas.length; i++) {
      if (cartas[i] != null) {
        roba = cartas[i];
        cartas[i] = null;
        break;
      }
    }
    return roba;
  }

  // crearCartas
  // Crea la baraja de cartas, del 1 al 7 de cada color (ROJO, VERDE, AMARILLO,
  // AZUL) + 2 comodines (0 PÚRPURA)
  // El 7 es la carta "Roba 2"
  // -------------------------------------------------------------------------------------------------------------------------------------

  public static Carta[] crearCartas(int NUM_CARTAS) {
    // Colores ANSI : Al imprimirse delante del texto lo cambia de color.
    // Hay que imprimir RESET detrás para volver a normal. NO TOCAR!
    final String ROJO = "\033[1;101m";
    final String VERDE = "\033[42m";
    final String AMARILLO = "\033[1;103m";
    final String AZUL = "\033[0;104m";
    final String PURPURA = "\033[1;105m";

    Carta[] cartas = new Carta[NUM_CARTAS];
    for (int i = 0; i <= 6; i++) {
      cartas[i * 4] = new Carta(i + 1, ROJO);
      cartas[i * 4 + 1] = new Carta(i + 1, VERDE);
      cartas[i * 4 + 2] = new Carta(i + 1, AMARILLO);
      cartas[i * 4 + 3] = new Carta(i + 1, AZUL);
    }
    cartas[28] = new Carta(0, PURPURA);
    cartas[29] = new Carta(0, PURPURA);
    return cartas;
  }

  // =======================================================================================================================================
  // MAIN COMPLETO
  // ¡¡NO TOCAR!!
  // =======================================================================================================================================
public static void main (String[] args) {

  // Preparar el juego
  //--------------------------------------------------------------------
  barajarCartas();
  Print.setJugadores(jugador1, jugador2);         // Los métodos de Print necesitan saber los jugadores
  for (int i = 0; i < 6; i++) {                   // Se reparten 6 cartas a cada jugador
    jugador1.cogeCarta(robaDelMazo());
    jugador2.cogeCarta(robaDelMazo());
  }
  Carta.setCartaEnJuego(robaDelMazo());           // La siguienteCarta con la que se empieza la partida
  if (Carta.cartaEnJuego.esRoba2()) {
    Carta.cartaEnJuego.setUsada();                // Para que no obligue a robar al siguiente jugador, si se sale con la carta "Roba2"
  }
  Print.imprimeMesa(1, "Empieza la partida...");

  // Ronda de jugadores hasta que no puedan jugar y no queden en el mazo, o hasta que alguno gane
  //-------------------------------------------------------------------- 
  while ((jugador1.puedeJugar() || jugador2.puedeJugar() || hayCartasEnMazo()) // Mientras alguno pueda jugar o queden cartas en el mazo
          && (jugador1.numCartas() > 0) && (jugador2.numCartas() > 0)) {       // Y mientras no haya ganado ninguno (no tenga cartas)

    if (jugadorTurno.getNombre().equals("HAL")) {                      // Es persona 
      juegaOrdenador(jugadorTurno);
    } else {   // Es el ordenador (puede jugar o hay cartas en el mazo)
      juegaPersona(jugadorTurno);
    }

      // Si es la carta [+] "Roba 2"... el siguiente jugador roba 2 y pasa turno
    if (Carta.cartaEnJuego.esRoba2()) { 
      roba2(jugadorTurno);                                 
    } else {
      jugadorTurno = (jugadorTurno == jugador1 ? jugador2 : jugador1);    // Cambio de jugador: Alterna jugadorTurno (jugador1 / jugador2)
    }
  }

  // Fin de la partida, gana quien tenga menos cartas
  //--------------------------------------------------------------------
  Print.mensajeFinal();

}

  // =======================================================================================================================================
  // MÉTODOS DEFINITIVOS
  // ¡¡No tocar!!
  // =======================================================================================================================================

  // juegaOrdenador
  // Turno de juego del ordenador, eligiendo carta
  // -------------------------------------------------------------------------------------------------------------------------------------
  private static void juegaOrdenador(Jugador jugadorTurno) {
    if (jugadorTurno.puedeJugar()) { // Si puede jugar, coloca una carta al azar
      jugadorTurno.juegaCartaAleatoria();
      Print.imprimeMesa(1, jugadorTurno.getNombre() + " coloca una carta");
    } else if (hayCartasEnMazo()) { // Si no puede jugar intenta robar del mazo
      jugadorTurno.cogeCarta(robaDelMazo());
      Print.imprimeMesa(1, jugadorTurno.getNombre() + " no puede jugar, coge carta");
    } else { // Si no puede jugar, y no quedan cartas en el mazo, no puede hacer nada
      Print.imprimeMesa(1, jugadorTurno.getNombre() + " no puede jugar, y no quedan cartas");
    }
  }

  // juegaPersona
  // Turno de juego de la persona, eligiendo carta
  // -------------------------------------------------------------------------------------------------------------------------------------
  private static void juegaPersona(Jugador jugadorTurno) {
    if (jugadorTurno.puedeJugar() || hayCartasEnMazo()) { // Y puede jugar o hay cartas en el mazo
      jugadorTurno.juegaCartaElige();
      Print.imprimeMesa(2, "");
    }
  }

  // roba2
  // Maneja las cartas del jugador que debe robar 2, cuando sale esa carta

  // -------------------------------------------------------------------------------------------------------------------------------------
  private static void roba2(Jugador jugadorTurno) {
    jugadorTurno = (jugadorTurno == jugador1 ? jugador2 : jugador1);
    Carta.cartaEnJuego.setUsada(); // Para que no se use 2 veces ni se coloque otra igual encima, le cambia el 7
                                   // por el 8 y deja de reconocerse como carta Roba2
    jugadorTurno.cogeCarta(robaDelMazo());
    Print.imprimeMesa(1, jugadorTurno.getNombre() + " roba 2 cartas");
    jugadorTurno.cogeCarta(robaDelMazo());
    Print.imprimeMesa(1, jugadorTurno.getNombre() + " roba 2 cartas");
  }

}
