package uno2_examen;
import java.util.Scanner;

/**
 * Clase Jugador
 * Contiene los métodos necesarios para manejar las cartas del jugador desde el programa principal en "Uno".
 * Dependencias: Clase Carta (instancias y estático)
 * Instancia jugadores con nombre y cartas
 *  
 * Examen DAM DAW del 25/05/2023
 * Pendiente pasar a ArrayList la lista de cartas, en atributos y todos los métodos.
 * 
 * @author Pablo Carmona
 * @version 25/05/2023
 */


public class Jugador {
    
  // Atributos de clase
  static final int NUM_CARTAS = Uno2.NUM_CARTAS;
  static final String RESET = "\033[0m";

  // Atributos de instancia
  Carta[] cartas = new Carta[NUM_CARTAS];
  String nombre;



  // Constructor con nombre
  //-------------------------------------------------------------------------------------------------------------------------------------
  public Jugador (String nombre) {
    this.nombre = nombre;
  }

  // Getter de nombre
  // Devuelve el nombre del jugador
  //-------------------------------------------------------------------------------------------------------------------------------------
  public String getNombre() {
    return this.nombre;
  }

  // Getter de cartas
  // Devuelve un array con las cartas del jugador
  //-------------------------------------------------------------------------------------------------------------------------------------
  public Carta[] getCartas() {
    return this.cartas;
  }

  // cogeCarta
  // Toma la carta que se ha pasado por parámetro y la incorpora a su lista de cartas, en el primer hueco libre (null)
  //-------------------------------------------------------------------------------------------------------------------------------------
  public void cogeCarta(Carta carta) {
    for (int i = 0; i < cartas.length ; i++) {
      if (cartas[i] == null) {
        this.cartas[i] =  carta;
        break;
      }
    }
  }

  // puedeJugar
  // Devuelve true si el jugador tiene cartas compatibles con la carta en juego,
  // Usa Carta.esJugable
  //-------------------------------------------------------------------------------------------------------------------------------------
  public boolean puedeJugar() {
    boolean puede = false;
    for (Carta c : this.cartas ) {
      if (c != null) {
        if (c.esJugable()) { // Si alguna carta es jugable, puede jugar
          puede = true;
        }
      }
    }
    return puede;
  }

  // numCartas
  // Devuelve el número de cartas que tiene el jugador
  //-------------------------------------------------------------------------------------------------------------------------------------
  public int numCartas() {
    int cuenta = 0;
    for (Carta c: this.cartas) {
      if (c != null) {
        cuenta++;
      }
    }
    return cuenta;
  }

  // puntos
  // Devuelve la suma de los números de las cartas. El comodín (0) vale 10.
  //-------------------------------------------------------------------------------------------------------------------------------------
   public int puntos() {
    int totalPuntos = 0;
    for (Carta c: this.cartas) {
      if (c != null) {
        totalPuntos += (c.esComodin() ? 10 : c.getNumero());
      }
    }
    return totalPuntos;
  }


  // juegaCartaAleatoria
  // Devuelve una carta aleatoria que puede jugar el ordenador "HAL"
  // Usa Carta.esJugable, Carta.setCartaEnJuego, tapaHuecos
  //-------------------------------------------------------------------------------------------------------------------------------------
  public void juegaCartaAleatoria() {
    int r = (int)(Math.random()*cartas.length);  // El índice aleatorio divide el array en 2 partes
    Carta cartaElegida = null;
    for (int i = r; i < cartas.length; i++) {    //Recorre las cartas desde la posición aleatoria hasta el final de la lista
      if (cartas[i] != null) {
        if (cartas[i].esJugable()) {             // Si es jugable, nos quedamos con esta
          cartaElegida = cartas[i];
          Carta.setCartaEnJuego(cartas[i]);
          cartas[i] = null;         
          tapaHuecos();                          // Para que no queden huecos en el array, y todas las cartas se puedan ir añadiendo a la derecha
          break;
        }
      }
    }
    if (cartaElegida == null) {                  //Si no se encontró ninguna en el recorrido parcial anterior
      for (int i = 0; i < r; i++) {              //Recorre las cartas desde el principio de la lista hasta la posición aleatoria
        if (cartas[i] != null) {
          if (cartas[i].esJugable()) {           // Si es jugable, nos quedamos con esta
            cartaElegida = cartas[i];
            Carta.setCartaEnJuego(cartas[i]);
            cartas[i] = null;
            tapaHuecos();
            break;
          }
        }
      } 
    }
    if (cartaElegida.esComodin()) {
      Print.imprimeMesa(1, this.getNombre() + " elige color");
      Carta.getCartaEnJuego().setColorRandom();
    }
  }


  // juegaCartaAleatoria
  // Permite jugar una carta a la persona
  // Usa Carta.esJugable, Carta.setCartaEnJuego, Uno2.robaDelMazo, tapaHuecos
  //-------------------------------------------------------------------------------------------------------------------------------------
public void juegaCartaElige() {
  Scanner s = new Scanner(System.in);
  int opcion = -1;
  while (opcion == -1) {
    System.out.print("Carta? ");
    String opcionStr = s.nextLine();
    if (!opcionStr.matches("[0-9]+")) {
      System.out.println("Introduce un número del 0 al " + this.numCartas());  // Que sea numérico, si no da excepción
    } else {
      opcion = Integer.parseInt(opcionStr);
      if (opcion == 0) {                                                        // Coger carta
        if (Uno2.hayCartasEnMazo()) {
          this.cogeCarta(Uno2.robaDelMazo()); 
        }  else {
          System.out.println("No hay más cartas en el mazo" + this.numCartas()); // Que sea en el rango de las cartas
        }
      } else if (opcion > this.numCartas() ) {
          System.out.println("Introduce un número del 0 al " + this.numCartas()); // Que sea en el rango de las cartas
          opcion = -1;
      } else if (!cartas[opcion-1].esJugable()) {
        System.out.println("No se puede jugar con esa carta");                  // Que sea jugable
        opcion = -1;
        if (!this.puedeJugar()) {
          System.out.println("Debes coger una carta del mazo (0)");                  // Que sea jugable
        }
      } else {
        Carta.setCartaEnJuego(cartas[opcion-1]);                                  // Es jugable, pues se coloca
        cartas[opcion-1] = null;         
        tapaHuecos();                                 // Para que no queden huecos en el array, y todas las cartas se puedan ir añadiendo a la derecha
        if (Carta.getCartaEnJuego().esComodin()) {    //Si es comodín, se elige el color
          Print.imprimeMesa(0, "Jugado comodín.");
          Carta.getCartaEnJuego().setColorElige();
        }
      }
    }
  }
}

  // tapaHuecos
  // Tapa huecos en la lista de cartas (null), desplazando todas las que están a su derecha, 
  // para que las nuevas cartas se incorporen siempre a la derecha
  //-------------------------------------------------------------------------------------------------------------------------------------

  public void tapaHuecos() {
    for (int i = 0; i < cartas.length; i++) {
      if (cartas[i] == null) {
        for (int j = i; j < cartas.length-1; j++) {
          cartas[j] = cartas[j+1];
        }
        break;
      }
    }
  }

}
