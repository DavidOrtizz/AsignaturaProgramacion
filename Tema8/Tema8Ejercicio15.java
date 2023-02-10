import misFunciones.OperacionesArray;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que cree un array de tamaño 100 con los primeros 100 números naturales. 
*Luego muestra la suma total y la media. Implementa una función que calcule la suma de un array y otra que calcule la media de un array.
*/

public class Tema8Ejercicio15 {
  public static void main(String[] args) {
    int tam = 100;
    int[] num = new int[tam];

    for (int i = 0; i < tam; i++) {
      num[i] = i + 1;
    }

    System.out.println("La suma total del array es: " + OperacionesArray.sumaArray(num));
    System.out.println("La media del array es: " + OperacionesArray.mediaArray(num));
  }
}
