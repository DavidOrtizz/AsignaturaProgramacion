/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Definir el programa anterior de tal forma que los números que se introducen
*en el array se generen de forma aleatoria (valores entre 100 y 999).
*/

public class Tema7Ejercicio3Bi {
  public static void main(String[] args) {
    int fila = 4;
    int columna = 5;
    int suma = 0;
    int aux = 0;
    int total = 0;
    int[][] num = new int[fila][columna];

    for (int cont = 0; cont < fila; cont++) { // Se guardan los números generados automaticamente
      for (int cont2 = 0; cont2 < columna; cont2++) {
        num[cont][cont2] = (int) (Math.random() * 900 + 100);
      }
    }

    for (int cont = 0; cont < fila; cont++) {
      for (int cont2 = 0; cont2 < columna; cont2++) {
        System.out.printf("%18s", num[cont][cont2]);
        suma += num[cont][cont2];
      }
      System.out.printf("%18s", "Fila " + cont + " = " + suma);
      aux += suma; // Suma total de la columna
      suma = 0;
      System.out.println();
    }
    for (int y = 0; y < columna; y++) {
      for (int x = 0; x < fila; x++) {
        suma += num[x][y];
      }
      System.out.printf("%18s", "Columna " + y + " = " + suma);
      aux += suma;
      suma = 0;
    }
    total = aux;
    System.out.printf("%18s", "Total = " + total);
  }
}
