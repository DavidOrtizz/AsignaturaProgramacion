import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que calcule la media de tres notas.
*/

public class Tema4Ejercicio8 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double x;
    double y;
    double z;
    int total;

    System.out.print("Introduce la primera nota: ");
    x = s.nextDouble();
    System.out.print("Introduce la segunda nota: ");
    y = s.nextDouble();
    System.out.print("Introduce la tercera nota: ");
    z = s.nextDouble();

    total = (int) (x + y + z) / 3;
    if (total >= 0 && total < 5) {
      System.out.println("La media de tu nota es de: " + total + ", es un insuficiente");
    }

    if (total >= 5 && total < 6) {
      System.out.println("La media de tu nota es de: " + total + ", es un bien");
    }

    if (total >= 6 && total < 9) {
      System.out.println("La media de tu nota es de: " + total + ", es un notable");
    }

    if (total >= 9 && total <= 10) {
      System.out.println("La media de tu nota es de: " + total + ", es un sobresaliente");
    }
  }
}
