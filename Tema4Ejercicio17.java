import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que diga cuál es la última cifra de un número entero
*introducido por teclado.
*/

public class Tema4Ejercicio17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero;

    System.out.print("Introduce un número: ");
    numero = s.nextInt();

    System.out.println("La ultima cifra es " + (numero % 15));
  }
}
