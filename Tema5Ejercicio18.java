import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que obtenga los números enteros comprendidos entre dos
*números introducidos por teclado y validados como distintos, el programa debe
*empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
*/

public class Tema5Ejercicio18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero1;
    int numero2;

    System.out.print("Introduce dos números y sabras cuales son los comprendidos: ");
    numero1 = s.nextInt();
    System.out.print("Introduce el otro número: ");
    numero2 = s.nextInt();

    if (numero1 < numero2) {
      System.out.print("Los números comprendidos son:");
      while (numero1 <= numero2) {
        System.out.print(" " + numero1);
        numero1 = numero1 + 7;
      }
    } else {
      System.out.print("Los números comprendidos son:");
      while (numero2 <= numero1) {
        System.out.print(" " + numero2);
        numero2 = numero2 + 7;
      }
    }
  }
}
