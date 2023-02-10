import java.util.Scanner;
import misFunciones.Minimo;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más elevado. 
*Implementalo creando únicamente una función a la que le pasemos dos valores (no tres) y nos devuelva el máximo de los dos valores.
*/

public class Tema8Ejercicio9 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = 0;
    int b = 0;
    int c = 0;
    int comprobador = 0;

    System.out.print("Introduce 3 número para saber cual es el mas grande: ");
    a = s.nextInt();
    System.out.print("Introduce el segundo número: ");
    b = s.nextInt();
    System.out.print("Introduce el ultimo número: ");
    c = s.nextInt();

    comprobador = Minimo.minimo(a, b);
    if (comprobador > c) {
      System.out.println("El número mínimo es: " + c);
    } else {
      System.out.println("El número minimo es: " + comprobador);
    }
  }
}
