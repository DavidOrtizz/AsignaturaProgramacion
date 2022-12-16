import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
*hay dentro de un número. Se recomienda usar long en lugar de int ya que el
*primero admite números más largos.
*/

public class Tema5Ejercicio41 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    long numero;
    long original;
    int par;
    int impar;
    long resto;

    par = 0;
    impar = 0;
    System.out.print("Introduce un número para saber cuantos digitos pares e impares hay: ");
    numero = s.nextInt();
    original = numero;

    while (numero > 0) {
      resto = numero % 10;
      if (resto % 2 == 0) {
        par++;
      } else {
        impar++;
      }
      numero = numero / 10;
    }
    System.out.println("El número " + original + " contiene " + par + " números pares y " + impar + " números impares");
  }
}
