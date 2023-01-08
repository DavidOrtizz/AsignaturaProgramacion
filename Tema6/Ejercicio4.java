/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separa dos por espacios.
*/

public class Ejercicio4 {
  public static void main(String[] args) {
    for (int cont = 1; cont <= 20; cont++) {
      System.out.print((int) ((Math.random() * 11)) + " ");
    }
  }
}
