import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que diga si un número introducido por teclado es par y/o
*divisible entre 5.
*/

public class Tema4Ejercicio14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero;
    int par;
    int divisible;

    System.out.print("Introduce un número: ");
    numero = s.nextInt();

    par = numero % 2; // Comprueba si es par
    if (par == 0) {
      System.out.print("El número introducido es par");
    }
    if (par != 0) {
      System.out.print("El número introducido no es par");
    }

    divisible = numero % 5; // Comprueba si es divisible por 5
    if (divisible == 0) {
      System.out.print(" y es divisible por 5");
    }
    if (divisible != 0) {
      System.out.print(" y no es divisible por 5");
    }
  }
}
