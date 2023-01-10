import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que pida 10 números por teclado y que luego muestre los
*números introducidos junto con las palabras “máximo” y “mínimo” al lado del
*máximo y del mínimo respectivamente.
*/

public class Tema7Ejercicio5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String maximo = " máximo";
    String minimo = " mínimo";
    int max = 0;
    int min = 0;
    int[] numero = new int[10];

    System.out.println("Introduce 10 números por teclado y te diré cual es el máximo y el mínimo");

    for (int cont = 0; cont < 10; cont++) {
      System.out.print("Introduce el número " + cont + " : ");
      numero[cont] = s.nextInt();

      if (cont == 0) { // Coge el primer numero para que sea el mínimo
        min = numero[cont];
        max = numero[cont];
      }
      if (numero[cont] > max) { // Añade el nuevo máximo
        max = numero[cont];
      }
      if (numero[cont] < min) { // Añade el nuevo mínimo
        min = numero[cont];
      }
    }
    for (int cont = 0; cont < 10; cont++) {
      if (numero[cont] == max) { // Mostramos la palabra máximo
        System.out.println("En la posición " + cont + " se guarda el número " + numero[cont] + " que es el " + maximo);
      }
      if (numero[cont] == min) { // Mostramos la palabra mínimo
        System.out.println("En la posición " + cont + " se guarda el número " + numero[cont] + " que es el " + minimo);
      }
      if (numero[cont] != min && numero[cont] != max) { // Mostramos sin ninguna palabra
        System.out.println("En la posición " + cont + " se guarda el número " + numero[cont]);
      }
    }
  }
}
