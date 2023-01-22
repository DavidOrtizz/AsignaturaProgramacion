/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que muestre por pantalla un array de 10 filas por 10
*columnas relleno con números aleatorios entre 200 y 300. A continuación, el programa debe mostrar los números de 
*la diagonal que va desde la esquina superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
*y la media de los números que hay en esa diagonal.
*/

public class Tema7Ejercicio11Bi {
  public static void main(String[] args) {
    int tam = 10;
    int tamfila = tam;
    int tamcolumna = tam;
    int[][] num = new int[tamfila][tamcolumna];
    int total = 0;
    int media = 0;
    int max = 0;
    int min = 500;

    for (int x = 0; x < tamfila; x++) { // Se guardan los números generados automaticamente y se muestra
      for (int y = 0; y < tamcolumna; y++) {
        num[x][y] = (int) (Math.random() * 101 + 200);
        System.out.printf("%4s", num[x][y]);
        if (x == y) {
          total += num[x][y];
          media = total / tam;
          if (num[x][y] > max) {
            max = num[x][y];
          }
          if (num[x][y] < min) {
            min = num[x][y];
          }
        }
      }
      System.out.println();
    }
    System.out.println("El número máximo es " + max);
    System.out.println("El número mínimo es " + min);
    System.out.println("La media es " + media);
  }
}
