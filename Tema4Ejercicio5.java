import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que resuelva una ecuación de primer grado.
*/

public class Tema4Ejercicio5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double a;
    double x; // Solución ax + b = 0 --> x = algo
    double b;

    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    System.out.print("Por favor, introduzca el valor de a: ");
    a = s.nextInt();

    System.out.print("Ahora introduzca el valor de b: ");
    b = s.nextInt();

    x = -(b) / (a);
    System.out.println("La solución es: " + x);
  }
}
