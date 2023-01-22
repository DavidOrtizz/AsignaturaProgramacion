/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que rellene un array de 6 filas por 10 columnas con
*números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa 
*deberá dar la posición tanto del máximo como del mínimo.
*/

public class Tema7Ejercicio5Bi {
  public static void main(String[] args) {
    int tamfila = 6;
    int tamcolumna = 10;
    int max = 0;
    int maxX = 0;
    int maxY = 0;
    int min = 1001;
    int minX = 0;
    int minY = 0;
    int[][] num = new int[tamfila][tamcolumna];

    for (int x = 0; x < tamfila; x++) { // Se guardan los números generados automaticamente
      for (int y = 0; y < tamcolumna; y++) {
        num[x][y] = (int) (Math.random() * 1001);
        System.out.printf("%5s", num[x][y]);
        if (num[x][y] > max) {
          max = num[x][y];
          maxX = x;
          maxY = y;
        }
        if (num[x][y] < min) {
          min = num[x][y];
          minX = x;
          minY = y;
        }
      }
      System.out.println();
    }
    System.out.println("El número mínimo se encuentra en la posición [" + minX + "][" + minY + "] = " + min);
    System.out.println("El número máximo se encuentra en la posición [" + maxX + "][" + maxY + "] = " + max);

  }
}