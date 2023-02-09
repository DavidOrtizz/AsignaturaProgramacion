import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: El programa que se pide en la pizarra (Bidimensionales)
*/

public class Tema7Pizarra2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int tamx = 0;
    int tamy = 0;
    int par = 0;
    boolean encontrado = false;

    // Se guarda la cantidad de columnas y filas
    System.out.print("Introduce la cantidad de columnas: ");
    tamy = s.nextInt();
    System.out.print("Introduce la cantidad de filas: ");
    tamx = s.nextInt();
    int[][] tabla = new int[tamx][tamy];
    int[] multiplo3 = new int[tamx];

    // Se rellena el array tabla
    for (int x = 0; x < tamx; x++) {
      for (int y = 0; y < tamy; y++) {
        tabla[x][y] = par;
        par += 2;
        if (tabla[x][y] % 7 == 0 && encontrado == false && tabla[x][y] != 0) {
          System.out.printf("\033[36m" + "%4d ", tabla[x][y]); // Se imprime la tabla con color
          encontrado = true;
        } else if (tabla[x][y] % 3 == 0) {
          multiplo3[y] = tabla[x][y];
        } else {
          System.out.printf("\033[37m" + "%4d ", tabla[x][y]); // Se imprime la tabla
        }
      }
      System.out.println();// Salto de línea
    }
    System.out.println("Los que son multiplos de 3 son:");
    for (int y = 0; y < tamy; y++) {
      System.out.printf("\033[37m" + "%4d ", multiplo3[y]); // Se imprime la tabla
    }
  }
}
