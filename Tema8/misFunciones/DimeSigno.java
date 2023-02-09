/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Funciones matemáticas
*/

public class DimeSigno {
  /*
   * pida un número entero por teclado y muestre por pantalla si es
   * positivo, negativo o cero.
   * 
   * @param a es el número introducido
   * 
   * @retun signo es el signo que tiene el número
   */
  public static int dimeSigno(int a) {
    int signo = 0;
    if (a < 0) {
      signo = -1;
      return signo;
    }
    if (a == 0) {
      signo = 0;
      return signo;
    }
    if (a > 0) {
      signo = 1;
      return signo;
    }
    return signo;
  }
}
