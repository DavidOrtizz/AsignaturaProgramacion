import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que diga cuál es la primera cifra de un número entero
*introducido por teclado. Se permiten números de hasta 5 cifras.
*/

public class Tema4Ejercicio18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero;
    int primero;
    primero = 0;

    System.out.print("Introduce un número de máximo 5 cifras: ");
    numero = s.nextInt();

    if (numero < 10) {
      primero = numero;
    }
    if (numero >= 10 && numero < 100) {
      primero = numero / 10;
    }
    if (numero >= 100 && numero < 1000) {
      primero = numero / 100;
    }
    if (numero >= 1000 && numero < 10000) {
      primero = numero / 1000;
    }
    if (numero >= 10000) {
      primero = numero / 10000;
    }

    System.out.println("El primer numero es: " + primero);
  }
}
