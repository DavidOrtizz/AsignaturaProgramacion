import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que nos diga cuántos dígitos tiene un número introducido
*por teclado.
*/

public class Tema5Ejercicio9 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero;
    int digitos;

    numero = 0;
    digitos = 0;

    System.out.print("Introduce un número y podras saber cuantos dígitos tiene: ");
    numero = s.nextInt();

    while (numero != 0) {
      numero = (int) numero / 10;
      digitos = digitos + 1;
    }
    System.out.println("Tu número tiene " + digitos + " digitos");
  }
}
