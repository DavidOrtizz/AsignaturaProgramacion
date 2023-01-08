/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
*de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
*/

public class Ejercicio3 {
  public static void main(String[] args) {
    int cartaTocada;
    int categoriaTocada;
    String carta;
    String categoria;

    carta = "";
    categoria = "";
    cartaTocada = (int) ((Math.random() * 9) + 1);
    categoriaTocada = (int) ((Math.random() * 4) + 1);
    switch (cartaTocada) {
      case 1:
        carta = "As";
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
        carta = "sota";
        break;

      case 8:
        carta = "caballo";
        break;

      case 9:
        carta = "rey";
        break;

      default:
        System.out.println("Error se ha dado una carta no registrada"); // Este error no va a salir con el código actual
    }
    switch (categoriaTocada) {
      case 1: // Bastos
        if (cartaTocada == 1) { // Comprobar si es plural o singular
          categoria = "basto.";
        } else {
          categoria = "bastos.";
        }
        break;

      case 2: // Espadas
        if (cartaTocada == 1) { // Comprobar si es plural o singular
          categoria = "espada.";
        } else {
          categoria = "espadas.";
        }
        break;

      case 3: // Oro
        categoria = "oro.";
        break;

      case 4: // Copas
        if (cartaTocada == 1) { // Comprobar si es plural o singular
          categoria = "copa.";
        } else {
          categoria = "copas.";
        }
        break;

      default:
        System.out.println("Error se ha dado una categoría no registrada");
    }
    System.out.println("La carta que te ha tocado es el " + carta + " de " + categoria);
  }
}
