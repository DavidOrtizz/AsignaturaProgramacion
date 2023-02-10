/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que escriba la tabla de multiplicar de un número introducido por teclado.
*/

public class TablaMultiplicar {
  /*
   * Que escriba la tabla de multiplicar y muestre todos los resultados por
   * pantalla
   * 
   * @param a, b Son los números introducidos
   * 
   * @return La impresion de la tabla de multiplicar
   */
  public static void tablaMultiplicar(double a, double b) {
    double solucion = 0;
    for (int i = 0; i <= b; i++) {
      solucion = a * i;
      System.out.println(a + "  *  " + i + "  =  " + solucion);
    }
  }
}
