import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Realizar el ejemplo de la página 111 con:
* 1. Mostrar todos los elementos y posiciones.
* 2. Preguntar cual posición quiero mostrar y lo muestro.
* 3. Mostrar las posiciones pares y su suma.
*/

public class Tema7Ejemplo1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero;
    int sumaPar = 0;
    int[] x = new int[10];
    x[0] = 8;
    x[1] = 33;
    x[2] = 200;
    x[3] = 150;
    x[4] = 11;
    x[5] = 88;
    x[6] = x[2] * 10;
    x[7] = x[2] / 10;
    x[8] = x[0] + x[1] + x[2];
    x[9] = x[8];

    System.out.println("---------------------------------------------------------------");
    for (int cont = 0; cont <= 9; cont++) { // Mostrar todos los elementos y posiciones
      System.out.println("En la posición " + cont + " se encuentra: " + x[cont]);
    }

    System.out.println("---------------------------------------------------------------");
    System.out.print("¿Que posición quieres mostrar?(Del 0 al 9): "); // Mostrar la posición preguntada
    numero = s.nextInt();
    System.out.println("En la posición " + numero + " se encuentra: " + x[numero]);

    System.out.println("---------------------------------------------------------------");

    for (int cont = 0; cont <= 9; cont += 2) { // Mostrar los numeros pares y su suma
      System.out.println("En la posicón " + cont + " que es par, se encuentra: " + x[cont]);
      sumaPar += x[cont];
    }
    System.out.println("La suma total de los pares es: " + sumaPar);
    System.out.println("---------------------------------------------------------------");
  }
}
