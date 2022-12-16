/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que muestre 15 números aleatorios entre 50 y 60 (sin decimales)
*/

public class Tema6Ejemplo4 {
  public static void main(String[] args) {
    System.out.println("15 números aleatorios entre 50 y 60 (sin decimales):");

    for (int i = 1; i <= 20; i++) {
      System.out.print(((int) (Math.random() * 11) + 50) + " ");
    }
    System.out.println();
  }
}
