import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que nos diga cuántos dígitos tiene un número entero que
puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
*/

public class Tema4Ejercicio19 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero;
    int digito;
    int negativo;
    digito = 0;
    negativo = 0;

    System.out.print("Introduce un número positivo o negativo para decirte cuantos digitos tiene: ");
    numero = s.nextInt();

    if (numero < 0) {
      negativo = numero; // Guardar numero negativo
      numero = -numero;
    }
    if (numero < 10) {
      digito = 1;
    }
    if (numero >= 10 && numero < 100) {
      digito = 2;
    }
    if (numero >= 100 && numero < 1000) {
      digito = 3;
    }
    if (numero >= 1000 && numero < 10000) {
      digito = 4;
    }
    if (numero >= 10000) {
      digito = 5;
    }
    if (negativo < 0) {
      System.out.println("El número " + negativo + " tiene " + digito + " digitos");
    } else {
      System.out.println("El número " + numero + " tiene " + digito + " digitos");
    }
  }
}
