import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
*muestre por pantalla separados por espacios. El programa pedirá entonces por teclado dos valores y a continuación 
*cambiará todas las ocurrencias del primer valor por el segundo en la lista generada anteriormente. 
*Los números que se han cambiado deben aparecer entrecomillados.
*/

public class Tema7Ejercicio7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int valor1 = 0;
    int valor2 = 0;
    int resto1;
    int resto2;
    int[] numero = new int[100];
    int[] numero2 = new int[100];
    for (int cont = 0; cont < 100; cont++) { // Genera los numeros aleatorios
      numero[cont] = (int) (Math.random() * 21);
      numero2[cont] = numero[cont]; // Guardo el array
      System.out.print(numero[cont] + " ");
    }
    System.out.println();
    System.out.print("Introduce el numero que quieres cambiar: ");
    valor1 = s.nextInt();
    System.out.print("Introduce por cual número quieres cambiarlo: ");
    valor2 = s.nextInt();

    for (int cont = 0; cont < 100; cont++) {
      if (numero2[cont] < 10) { // Si el numero es de un dígito
        if (numero2[cont] == valor1) {
          numero2[cont] = valor2;
          System.out.print("'" + numero2[cont] + "'" + " ");
        } else { // Falla a partir de aqui
          resto1 = numero2[cont] / 10;
          resto2 = numero2[cont] % 10;
          if (resto1 == valor1) {
            resto1 = valor2;
          }
          if (resto2 == valor1) {
            resto2 = valor2;
          }
          numero2[cont] = (resto1 * 10) + resto2;
          System.out.print(numero[cont] + " ");
        }
      }
    }
  }
}
