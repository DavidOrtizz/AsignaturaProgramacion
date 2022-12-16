import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que calcule el salario semanal de un
*trabajador teniendo en cuenta que las horas ordinarias
*/

public class Tema4Ejercicio4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int total;
    int horas;

    System.out.print("Introduce las horas total: ");
    horas = s.nextInt();

    if (horas <= 40) {
      total = horas * 12;
      System.out.println("En total te van a pagar: " + total);
    }
    if (horas > 40) {
      horas = horas - 40;
      total = horas * 16 + (40 * 12);
      System.out.println("En total te van a pagar: " + total);
    }
  }
}
