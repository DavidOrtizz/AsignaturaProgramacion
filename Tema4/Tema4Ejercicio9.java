import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que que resuelva una ecuación de segundo grado.
*/

public class Tema4Ejercicio9 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a;
    int b;
    int c;
    double raiz;
    int totalpositivo; // ax^2 + bx + c = 0
    int totalnegativo;

    System.out.print("Introduce la a de la ecuación de segundo grado: ");
    a = s.nextInt();
    System.out.print("Introduce la b de la ecuación de segundo grado: ");
    b = s.nextInt();
    System.out.print("Introduce la c de la ecuación de segundo grado: ");
    c = s.nextInt();

    raiz = (b * b) - (4 * a * c);
    raiz = Math.sqrt(raiz);

    totalpositivo = (-(b) + (int) raiz) / (2 * a);
    totalnegativo = (-(b) - (int) raiz) / (2 * a);

    System.out.println("El resultado positivo es: " + totalpositivo);
    System.out.println("El resultado negativo es: " + totalnegativo);
  }
}
