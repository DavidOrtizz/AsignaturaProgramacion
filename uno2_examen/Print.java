package uno2_examen;
/**
 * Clase Print
 * Contiene los métodos estáticos necesarios para imprimir en pantalla la partida de cartas del juego Uno2.
 * Dependencias: Clase Carta, Clase Jugador
 *  
 * Examen DAM DAW del 25/05/2023
 * Clase completa, ¡NO TOCAR!
 * 
 * @author Pablo Carmona
 * @version 25/05/2023
 */

import java.util.Scanner;

public class Print {
  
static final String RESET = "\033[0m";

static Jugador jugador1;
static Jugador jugador2;

public static void setJugadores(Jugador j1, Jugador j2){
  jugador1 = j1;
  jugador2 = j2;
}

  // intro
  // Imprime mensaje inicial con las instrucciones y pregunta el nombre del jugador.
  //--------------------------------------------------------------------
    public static String intro() {
    System.out.println("\n\n# Juego UNO Demo #\n");
    System.out.println("Cada jugador puede colocar una carta que coincida en color o número con la que hay en juego.");
    System.out.println("Si le quedan cartas, pero no tiene ninguna que pueda colocar, debe robar una del mazo.");
    System.out.println("El 0 es comodín, puede colocarse sobre cualquiera, y depués elegir un color para continuar.");
    System.out.println("El + es la carta \"Roba 2\", y quien la juega obliga al siguiente jugador a robar 2 cartas y saltar su turno.");
    System.out.println("Gana quien se quede antes sin cartas, o si se acaba el mazo, quien tenga menos.");
    System.out.println("Pulsa ENTER para continuar...");
    System.out.println();
    Print.Top5();
    System.out.println();
    System.out.println("Introduce tu nombre : ");
    Scanner s = new Scanner(System.in);
    String nombre = s.nextLine();
    System.out.println();
    return nombre;
  }

// printTop5
// Imprime el Top5.Usa las variable de clase Fichero.nombres y Fichero.puntos.
// Para que estas variables se inicialicen, hay que leer antes el fichero con Fichero.leerTop5().
//-------------------------------------------------------------------------------------------------------------------------------------
public static void Top5() {
  Fichero.leerTop5();
  String[] nombres = Fichero.getNombres();
  int[] puntos = Fichero.getPuntos();

  System.out.println("------< TOP 5 >------");
  for(int i = 0; i < 5; i++) {
    System.out.println(String.format("%-14s", nombres[i]) + "-> " + (String.format("%4s", puntos[i])));
  }
}

// Dibuja la mesa con todas las cartas
// Usa métodos Carta.toString(fila) con parámetros
//-------------------------------------------------------------------------------------------------------------------------------------
public static void imprimeMesa(int segundosPausa, String mensaje) {
  System.out.print("\n\n\n\n");                                              // 4  Saltos de línea
  System.out.print(imprimeCartas(jugador1));                                                  // Imprime las 3 líneas de cartas del jugador 1
  System.out.print("\n\n");                                                  // 2 Saltos de línea

                                                                               // Imprime el mazo y la carta en juego, en 3 líneas
  System.out.print(Uno2.hayCartasEnMazo() ? Carta.getCartaEnJuego().reversoFila(1) : "   ");          // Sólo dibuja el mazo si quedan cartas
  System.out.print("       " + Carta.getCartaEnJuego().anversoFila(1));      // Dibuja la carta en juego
  System.out.println(RESET);
  System.out.print(Uno2.hayCartasEnMazo() ? Carta.getCartaEnJuego().reversoFila(2) : "   ");
  System.out.print("       " + Carta.getCartaEnJuego().anversoFila(2));
  System.out.println(RESET);
  System.out.print(Uno2.hayCartasEnMazo() ? Carta.getCartaEnJuego().reversoFila(3) : "   ");
  System.out.print("       " + Carta.getCartaEnJuego().anversoFila(3));
  System.out.println(RESET);

  Carta[] cartas = jugador2.getCartas();
  System.out.print(Uno2.hayCartasEnMazo() ? " ^\n 0\n" : "\n\n");                              // Las flechitas de las cartas, indicando el número a introducir para escogerlas
  System.out.print(imprimeCartas(jugador2));                                                  // Imprime las 3 líneas de cartas del jugador 2 (humano)
  for (int i=1; i <= jugador2.numCartas(); i++) {
          System.out.print(cartas[i-1].esJugable() ? " ^  " : "    ");
  }
  System.out.println();
  for (int i=1; i <= jugador2.numCartas(); i++) {
    System.out.print(cartas[i-1].esJugable() ? (i < 10 ? " " + i + "  " : " " + i + " ") : "    ");
  }

  System.out.println("\n\n---------------------------------------");         // 2 Saltos de línea
  System.out.println(mensaje);   

  try {
    Thread.sleep(segundosPausa*1000);     // Pausa cada vez que se imprima la mesa. El tiempo se pasa por parámetro
  } catch (Exception e) {
    System.out.println(e);
  }
}


// cartasJugador
// Devuelve el dibujo a imprimir de las cartas de cada jugador, en 3 líneas
// Usa Carta.anversoFila, Carta.reversoFila, Jugador.getNombre, Jugador.getCartas 
//-------------------------------------------------------------------------------------------------------------------------------------
public static String imprimeCartas(Jugador jugador) {
  Carta[] cartas = jugador.getCartas();
  Boolean cartasVisibles = !jugador.getNombre().equals("HAL") || (jugador1.getNombre().equals(jugador2.getNombre()));
  String dibujoCartas = "";
  // fila 1 de las cartas
  for (Carta c : cartas) {
    if (c != null) {
      dibujoCartas += (cartasVisibles ? c.anversoFila(1) : c.reversoFila(1)) + " ";
    }
  }
  dibujoCartas +=  "\n";
  // fila 2 de las cartas
  for (Carta c : cartas) {
    if (c != null) {
      dibujoCartas += (cartasVisibles ? c.anversoFila(2) : c.reversoFila(2)) + " ";
    }
  }
  dibujoCartas +=  "\n";
  // fila 3 de las cartas
  for (Carta c : cartas) {
    if (c != null) {
      dibujoCartas += (cartasVisibles ? c.anversoFila(3) : c.reversoFila(3)) + " ";
    }
  }
  dibujoCartas +=  "\n";
  return dibujoCartas;
}



public static void mensajeFinal() {
  imprimeMesa(1, "Fin de partida...");
  System.out.println("***************************************");
  if (jugador1.numCartas() == jugador2.numCartas()) {
    System.out.println("   ¡EMPATE!");
  } else if (jugador1.numCartas() < jugador2.numCartas()) {
    System.out.println("   ¡Gana " + jugador1.getNombre() + " con " + jugador2.puntos() + " puntos!");
  } else {
    System.out.println("   ¡Gana " + jugador2.getNombre() + " con " + jugador1.puntos() + " puntos!");
  }
  System.out.println("***************************************");

}
}
