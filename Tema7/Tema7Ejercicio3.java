import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que lea 10 números por teclado y que luego los muestre
*en orden inverso, es decir, el primero que se introduce es el último en mostrarse y viceversa.
*/

public class Tema7Ejercicio3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] numero = new int[10];

    System.out.println("Introduce 10 números para mostrarlo en el orden inverso");
    for (int cont = 0; cont <= 9; cont++) { // Guarda los numeros en cada array
      System.out.print("Introduce el número " + (cont + 1) + ": ");
      numero[cont] = s.nextInt();
    }
    for (int cont = 9; cont != -1; cont--) {// Muestra los numeros del array
      System.out.print(numero[cont] + " ");
    }
  }
}
