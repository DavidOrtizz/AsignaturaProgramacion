/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Funciones matemáticas
*/

public class ValorN {
  /*
   * Sumatorio desde 1 a N
   * 
   * @param n es el número máximo;
   * 
   * @retun suma devuelve la suma de enteros de 1 a n
   */
  public static int suma1aN(int n) {
    int suma = 0;
    for (int i = 0; i <= n; i++) {
      suma += i;
    }
    return suma;
  }

  /*
   * Factorial de 1 a N
   * 
   * @param n es el número máximo
   * 
   * @return factorial devuelve el producto de enteros de 1 a n
   */
  public static int producto1aN(int n) {
    int factorial = 1;
    while (n != 0) {
      factorial = factorial * n;
      n--;
    }
    return factorial;
  }

  /*
   * Valor intermedio entre 1 y n
   * 
   * @param n es el número máximo
   * 
   * @return inter es el valor intermedio de 1 y N
   */
  public static double intermedio1aN(int n) {
    int inter = 0;
    inter = n / 2;
    return inter;
  }
}
