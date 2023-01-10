import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que piense un número al azar entre 0 y 100. 
*El usuario debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
*el programa dirá cuántas oportunidades quedan y si el número introducido es
*menor o mayor que el número secreto.
*/

public class Tema6Ejercicio6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero = 0;
    int introducido = 0;
    int oportunidades = 5;

    numero = (int) (Math.random() * 101);

    System.out.println("Adivina el número que estoy pensando del 0 al 100");
    do {
      System.out.println("Tienes quedan " + oportunidades + " oportunidades para lograrlo");
      System.out.print("Introduce el numero: ");
      introducido = s.nextInt();
      if (introducido != numero) { // Comprueba que el numero sea distinto
        if (introducido < numero) {
          System.out.println("El número es mayor al que has puesto");
        }
        if (introducido > numero) {
          System.out.println("El número es menor al que has introducido");
        }
      }
      System.out.println();
      oportunidades--;
    } while (numero != introducido && oportunidades != 0); // Comprueba el numero o te quedas sin oportunidades
    if (numero == introducido) {
      System.out.println("Enorabuena has adivinado el numero que era " + numero);
    }
    if (oportunidades == 0) {
      System.out.println("Que pena, te quedaste sin oportunidades el numero era " + numero);
    }
  }
}
