import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Definir un programa que pida 20 números enteros. Estos números se deben
*introducir en un array de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y columnas 
*igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en la esquina inferior derecha.
*/

public class Tema7Ejercicio2Bi { // Mal creado
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int fila = 4;
    int columna = 5;
    int sumaX = 0;
    int sumaY = 0;
    int suma = 0;
    int totalSuma = 0;
    int[][] num = new int[fila][columna];

    System.out.println("Introduce 20 números enteros");
    for (int cont = 0; cont < fila; cont++) { // Se guardan los números
      for (int cont2 = 0; cont2 < columna; cont2++) {
        System.out.print("Introduce el número de la posición [" + cont + "] [" + cont2 + "] : ");
        num[cont][cont2] = s.nextInt();
      }
    }

    for (int cont = 0; cont < fila; cont++) {
      for (int cont2 = 0; cont2 < columna; cont2++) {
        System.out.printf("%4s", num[cont][cont2]);
        suma = +num[cont][cont2];
      }
      System.out.printf("\t %4s", "Fila " + cont + " = " + suma);
      totalSuma += suma; // Suma total de la columna
      suma = 0;
      System.out.println();
    }
    System.out.println();
  }
}
