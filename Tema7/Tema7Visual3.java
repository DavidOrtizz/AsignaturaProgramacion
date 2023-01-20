/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Hacer el programa que esta dibujado en la pizarra 
*/

public class Tema7Visual3 {
  public static void main(String[] args) {
    final int num = 2; //
    long resultado = 0;
    int tamfila = 7;
    int tamcolumnas = 5;
    long[][] posicion = new long[tamcolumnas][tamfila];

    for (int x = 0; x < tamcolumnas; x++) { // Rellenar el array
      for (int y = 0; y < tamfila; y++) {
        if (y == 0 && x == 0) { // La primera solucion siempre es 0
          resultado = 1;
          posicion[x][y] = resultado;
        } else { // Potencias
          resultado = resultado * num;
          posicion[x][y] = resultado;
        }
      }
    }

    for (int y = 0; y < tamfila; y++) { // Contador para pasar por todas las filas
      for (int x = 0; x < tamcolumnas; x++) { // Contador para pasar pot todas las columnas
        System.out.printf("%15s", posicion[x][y]);
      }
      System.out.println(); // Salto de linea
    }
  }
}
