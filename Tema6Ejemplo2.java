/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que muestre 15 números aleatorios entre 0 y 9 (sin decimales)
*/

public class Tema6Ejemplo2 {
  public static void main(String[] args) {
    System.out.println("15 números aleatorios entre 0 y 9 (sin decimales):");

    for (int i = 1; i <= 15; i++) {
      System.out.print((int) (Math.random() * 10) + " ");
    }
    System.out.println();
  }
}
