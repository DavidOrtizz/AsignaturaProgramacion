/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Definir el programa anterior de tal forma que las sumas parciales y la suma total aparezcan 
*en la pantalla con un pequeño retardo, dando la impresión de que el ordenador se queda “pensando” antes de mostrar los números.
*/

public class Tema7Ejercicio4Bi {
  public static void main(String[] args) throws InterruptedException { // Esta línea sirve para usar el sleep
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
        Thread.sleep(500); // retardo
      }
      System.out.printf("%18s", "Fila " + cont + " = " + suma);
      aux += suma; // Suma total de la columna
      suma = 0;
      Thread.sleep(500); // retardo
      System.out.println();
    }
    for (int y = 0; y < columna; y++) {
      for (int x = 0; x < fila; x++) {
        suma += num[x][y];
        Thread.sleep(500); // retardo
      }
      System.out.printf("%18s", "Columna " + y + " = " + suma);
      aux += suma;
      suma = 0;
      Thread.sleep(500); // retardo
    }
    total = aux;
    System.out.printf("%18s", "Total = " + total);
    Thread.sleep(500); // retardo
  }
}
