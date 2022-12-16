import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que lea una lista de diez números y determine cuántos
*son positivos, y cuántos son negativos.
*/

public class Tema5Ejercicio13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int positivo;
    int negativo;
    int leer;
    int cont;

    cont = 1;
    positivo = 0;
    negativo = 0;

    System.out.print("Introduce 10 números positivos o negativos y te diré cuantos hay en total: ");
    while (cont <= 10) {
      leer = s.nextInt();

      if (leer < 0) {
        negativo = negativo + 1;
      }
      if (leer >= 0) {
        positivo = positivo + 1;
      }
      cont++;
    }
    System.out.println("De los números introducidos hay " + positivo + " positivos y " + negativo + " negativos");
  }
}
