import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: El programa que se pide en la pizarra
*/

public class Tema7Pizarra1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int tamfila;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    // Se añade el tamaño de la fila
    System.out.print("\033[37m" + "Introduce el tamaño de la fila: ");
    tamfila = s.nextInt();
    int[] fila = new int[tamfila];
    int[] pares = new int[tamfila];
    int par = tamfila - 1;

    // Añade el número aleatorio dentro del array
    for (int cont = 0; cont < tamfila; cont++) {
      fila[cont] = (int) (Math.random() * 11 + 50);
      if (fila[cont] > max) { // El máximo
        max = fila[cont];
      }
      if (fila[cont] < min) {// El mínimo
        min = fila[cont];
      }
      // Añade los pares al final del array pares
      if (fila[cont] % 2 == 0) {
        pares[par--] = fila[cont];
      }
    }

    // Imprime los números indicando el menor y el mayor
    System.out.println("Array original: ");
    for (int cont = 0; cont < tamfila; cont++) {
      if (fila[cont] == max) { // El máximo se pone de color
        System.out.print("\033[36m" + fila[cont] + " ");
      }
      if (fila[cont] == min) {// El mínimo se pone de color
        System.out.print("\033[36m" + fila[cont] + " ");
      }
      if (fila[cont] != max && fila[cont] != min) {// Números normales (color blanco)
        System.out.print("\033[37m" + fila[cont] + " ");
      }
    }
    System.out.println(); // Salto de línea
    // Imprime los números guardando los pares de izquierda a derecha
    System.out.println("Array con los pares: ");
    for (int cont = 0; cont < tamfila; cont++) {
      System.out.print("\033[37m" + pares[cont] + " ");
    }
  }
}
