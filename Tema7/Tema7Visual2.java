/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Hacer el programa que esta dibujado en la pizarra tabla multiplicaciones
*/

public class Tema7Visual2 {
  public static void main(String[] args) {
    int num = 1;
    int tamfila = 11;
    int tamcolumnas = 10;
    int[][] posicion = new int[tamcolumnas][tamfila];

    for (int x = 1; x < tamcolumnas; x++) { // Rellenar el array
      for (int y = 1; y < tamfila; y++) {
        num = x * y;
        posicion[x][y] = num;
      }
    }

    for (int y = 1; y < tamfila; y++) { // Contador para pasar por todas las filas
      for (int x = 1; x < tamcolumnas; x++) { // Contador para pasar pot todas las columnas
        System.out.printf("%3s", posicion[x][y]);
      }
      System.out.println(); // Salto de linea
    }
  }
}
