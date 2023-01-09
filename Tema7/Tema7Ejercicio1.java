/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que defina un array de 12 números enteros con nombre num y asigna los valores
*según la tabla que se muestra. Muestra el contenido de todos los elementos del array. 
*¿Qué sucede con los valores de los elementos que no han sido inicializados?
*/

public class Tema7Ejercicio1 {
  public static void main(String[] args) {
    int[] num = new int[12];
    num[0] = 39;
    num[1] = -1;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;

    for (int cont = 0; cont <= 11; cont++) {
      System.out.println("En la posición " + cont + " se encuentra: " + num[cont]);
    }
    System.out.println("Los elementos que no han sido inicializados se rellenan con un 0");
  }
}
