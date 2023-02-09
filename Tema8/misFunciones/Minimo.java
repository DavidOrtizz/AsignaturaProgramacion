/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Funciones matemáticas
*/

public class Minimo {
  /*
   * Indica cual de los dos números es el mínimo
   * 
   * param a, b son los números introducidos
   * 
   * return a, b indicando cual es el mínimo
   */
  public static int minimo(int a, int b) {
    if (a > b) {
      System.out.println("El número mínimo es: " + b);
      return b;
    } else {
      System.out.println("El número mínimo es: " + a);
      return a;
    }
  }
}
