/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Definir un array de números enteros de 3 filas por 6 columnas con nombre num
*y asigna los valores según la siguiente tabla. Muestra el contenido de todos
*los elementos del array dispuestos en forma de tabla como se muestra en la figura.
*/

public class Tema7Ejercicio1Bi {
  public static void main(String[] args) {
    int fila = 3;
    int columna = 6;
    int[][] num = new int[fila][columna];

    num[0][0] = 0;
    num[0][1] = 30;
    num[0][2] = 2;
    num[0][5] = 5;
    num[1][0] = 75;
    num[1][4] = 0;
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] = 11;

    System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s", "Array num", "Columna 0", "Columna 1", "Columna 2",
        "Columna 3", "Columna 4", "Columna 5");
    System.out.println();
    System.out.println(
        "\t   |----------------|---------------|---------------|---------------|---------------|---------------|");
    for (int cont = 0; cont < fila; cont++) {
      for (int cont2 = 0; cont2 < columna; cont2++) {
        System.out.printf("\t          %-5s", num[cont][cont2]);
      }
      System.out.println();
    }
  }
}
