/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
*y que los almacene en un array. El programa debe ser capaz de pasar todos
*los números pares a las primeras posiciones del array (del 0 en adelante) y
*todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es necesario.
*/

public class Tema7Ejercicio10 {
  public static void main(String[] args) {
    int tam = 20; // Tamaño del array
    int[] num = new int[tam];
    int[] par = new int[tam];
    int pares = 0;
    int[] impar = new int[tam];
    int impares = 0;

    for (int cont = 0; cont < tam; cont++) {
      num[cont] = (int) (Math.random() * 101); // Generamos el número y lo guardamos
      if (num[cont] % 2 == 0) {
        par[pares] = num[cont];
        pares++;
      } else {
        impar[impares] = num[cont];
        impares++;
      }
    }

    System.out.println("Array inicial:");
    for (int cont = 0; cont < tam; cont++) {
      System.out.print(num[cont] + " ");
    }
    System.out.println();
    for (int cont = 0; cont < pares; cont++) {
      num[cont] = par[cont];
    }
    for (int cont = pares; cont < tam; cont++) {
      num[cont] = impar[cont - pares];
    }

    System.out.println("Array con los pares al principio:");
    for (int cont = 0; cont < tam; cont++) {
      System.out.print(num[cont] + " ");
    }
  }
}
