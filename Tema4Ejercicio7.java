import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que calcule la media de tres notas.
*/

public class Tema4Ejercicio7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double x;
    double y;
    double z;
    double total;

    System.out.print("Introduce la primera nota: ");
    x = s.nextDouble();
    System.out.print("Introduce la segunda nota: ");
    y = s.nextDouble();
    System.out.print("Introduce la tercera nota: ");
    z = s.nextDouble();

    total = (x + y + z) / 3;
    System.out.println("La media de tu nota es de: " + total);
  }
}
