/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Hacer el programa que esta dibujado en la pizarra tabla pares
*/

public class Tema7Visual1 {
  public static void main(String[] args) {
    int num = 0;
    int tamfila = 5;
    int tamcolumnas = 10;
    int[][] posicion = new int[tamcolumnas][tamfila];

    for (int x = 0; x < tamcolumnas; x++) { // Rellenar el array
      for (int y = 0; y < tamfila; y++) {
        posicion[x][y] = num;
        num += 2;
      }
    }

    for (int y = 0; y < tamfila; y++) { // Contador para pasar por todas las filas
      for (int x = 0; x < tamcolumnas; x++) { // Contador para pasar pot todas las columnas
        System.out.print(posicion[x][y] + " ");
      }
      System.out.println();
    }
  }
}
