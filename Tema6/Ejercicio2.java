/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que muestre al azar el nombre de una carta de la baraja
*francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
*y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
*numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 1). 
*Para convertir un número en una cadena de caracteres podemos usar String.valueOf(n).
*/

public class Ejercicio2 {
  public static void main(String[] args) {
    int cartaTocada;
    int categoriaTocada;
    String carta;
    String categoria;

    carta = "";
    categoria = "";
    cartaTocada = (int) ((Math.random() * 13) + 1);
    categoriaTocada = (int) ((Math.random() * 4) + 1);
    switch (cartaTocada) {
      case 1:
        carta = "A";
        break;

      case 2:
        carta = "1";
        break;

      case 3:
        carta = "3";
        break;

      case 4:
        carta = "4";
        break;

      case 5:
        carta = "5";
        break;

      case 6:
        carta = "6";
        break;

      case 7:
        carta = "7";
        break;

      case 8:
        carta = "8";
        break;

      case 9:
        carta = "9";
        break;

      case 10:
        carta = "10";
        break;

      case 11:
        carta = "J";
        break;

      case 12:
        carta = "Q";
        break;

      case 13:
        carta = "K";
        break;

      default:
        System.out.println("Error se ha dado una carta no registrada"); // Este error no va a salir con el código actual
    }
    switch (categoriaTocada) {
      case 1: // Picas
        if (cartaTocada == 1) { // Comprobar si es plural o singular
          categoria = "pica.";
        } else {
          categoria = "picas.";
        }
        break;

      case 2: // Corazones
        if (cartaTocada == 1) { // Comprobar si es plural o singular
          categoria = "corazon.";
        } else {
          categoria = "corazones.";
        }
        break;

      case 3: // Trebol
        if (cartaTocada == 1) { // Comprobar si es plural o singular
          categoria = "trebol.";
        } else {
          categoria = "treboles.";
        }
        break;

      case 4: // Diamantes
        if (cartaTocada == 1) { // Comprobar si es plural o singular
          categoria = "diamante.";
        } else {
          categoria = "diamantes.";
        }
        break;

      default:
        System.out.println("Error se ha dado una categoría no registrada");
    }
    System.out.println("La carta que te ha tocado es el " + carta + " de " + categoria);
  }
}
