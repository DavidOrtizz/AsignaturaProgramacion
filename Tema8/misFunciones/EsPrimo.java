/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que nos pida número enteros hasta que se introduzca el 0, diciéndonos,
*para cada número introducido si es primo o no. Hay que recordar que un número es primo si es
*divisible por sí mismo y por 1. El 1 no es primo por convenio. Se debe crear una función que
*pasándole un número entero devuelva si es primo o no.
*/

public class EsPrimo {
  /*
   * Devuelve verdadero si el número que se pasa como parámetro es primo y falso
   * en caso contrario.
   * 
   * @param num que es el número que introducimos
   * 
   * @return devuelve true si es primo y false si no lo es
   */
  public static boolean esPrimo(int num) {
    for (int cont = 2; cont < num; cont++) {
      if ((num % cont) == 0) {
        return false;
      }
    }
    return true;
  }
}
