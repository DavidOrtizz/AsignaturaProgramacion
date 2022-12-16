import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que vaya pidiendo números hasta que se introduzca un
*numero negativo y nos diga cuantos números se han introducido, la media de
*los impares y el mayor de los pares. El número negativo sólo se utiliza para
*indicar el final de la introducción de datos pero no se incluye en el cómputo.
*/

public class Tema5Ejercicio21 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int introducido;
    int impar;
    int masAlto;
    int media;
    int numerosTotal;
    int totalImpar;

    numerosTotal = 1;
    impar = 0;
    masAlto = 0;
    totalImpar = 0;
    media = 0;

    System.out.println("Introduce varios números y para terminar introduce un número negativo");
    do {
      System.out.print("Introduce un número: ");
      introducido = s.nextInt();

      if (introducido % 2 == 0) { // Comprueba si es par
        if (introducido > masAlto) { // Si es par comprueba si es mas alto que el anterior
          masAlto = (int) introducido; // Si es mas alto se guarda
        }
      } else {
        impar += introducido; // Suma los impares
        totalImpar++;
        media = impar / totalImpar;
      }
      numerosTotal++;
    } while (introducido > -1);
    System.out.println("El número total introducido es " + numerosTotal);
    System.out.println("La media de los impares es " + media);
    System.out.println("El número mas alto par es " + masAlto);
  }
}
