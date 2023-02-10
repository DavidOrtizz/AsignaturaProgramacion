/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que cree un array de tamaño 100 con los primeros 100 números naturales. 
*Luego muestra la suma total y la media. Implementa una función que calcule la suma de un array y otra que calcule la media de un array.
*/

public class OperacionesArray {
  /*
   * Suma de un array lo que va a hacer es sumar todo los números dentro del array
   * 
   * @param num[] es el contenido del array
   * 
   * @return total la suma total del array
   */
  public static int sumaArray(int[] num) {
    int total = 0;
    for (int i = num.length - 1; i >= 0; i--) {
      total += num[i];
    }
    return total;
  }

  /*
   * Calcular la media de un array
   * 
   * @param total es el total de la función anterior
   * 
   * @return media es la media del array
   */
  public static double mediaArray(int[] num) {
    int total = 0;
    int media = 0;
    for (int i = num.length - 1; i >= 0; i--) {
      total += num[i];
    }
    media = total / 2;
    return media;
  }
}
