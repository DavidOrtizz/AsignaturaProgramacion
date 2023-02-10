import java.util.Scanner;
import misFunciones.EsPrimo;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que nos pida número enteros hasta que se introduzca el 0, diciéndonos,
*para cada número introducido si es primo o no. Hay que recordar que un número es primo si es
*divisible por sí mismo y por 1. El 1 no es primo por convenio. Se debe crear una función que
*pasándole un número entero devuelva si es primo o no.
*/

public class Tema8Ejercicio17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num;

    System.out.println("Este programa te va a decir si los números introducidos son primos, para detenerlo pon un 0");
    do {
      System.out.print("Introduce un número: ");
      num = s.nextInt();

      if (num == 0) {
        System.out.println("Se ha terminado el programa");
      } else if (EsPrimo.esPrimo(num) == true) {
        System.out.println("El número introducido es primo");
      } else {
        System.out.println("El número introducido no es primo");
      }
    } while (num != 0);
  }
}
