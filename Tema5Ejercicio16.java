import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que diga si un número introducido por teclado es o no
*primo. Un número primo es aquel que sólo es divisible entre él mismo y la unidad.
*/

public class Tema5Ejercicio16 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero;
    boolean Primo;

    Primo = true;
    System.out.print("Introduce un número para saber si es primo o no: ");
    numero = s.nextInt();

    for (int cont = 2; cont < numero; cont++) {
      if ((numero % cont) == 0) {
        Primo = false;
      }
    }
    if (Primo == true) {
      System.out.println("El número introducido es primo");
    } else {
      System.out.println("El número introducido no es primo");
    }
  }
}
