import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que pida un número entero positivo por teclado y que
*muestre a continuación los números desde el 1 al número introducido junto
*con su factorial.
*/

public class Tema5Ejercicio39 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero;
    long resultado;

    resultado = 1;
    System.out.print("Introduzca un numero positivo para calcular su factorial: ");
    numero = s.nextInt();

    for (int cont = 1; cont <= numero; cont++) {
      resultado = resultado * cont; // Formula calculo factorial
      System.out.println(cont + "! = " + resultado);
    }
  }
}
