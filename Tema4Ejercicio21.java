import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que calcule la nota media de dos examenes 
*y que diga si es apto o no apto.
*/

public class Tema4Ejercicio21 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double nota1;
    double nota2;
    double media;
    String respuesta;
    String apto;
    String noApto;
    apto = "apto";
    noApto = "no apto";

    System.out.print("Introduce la nota de tu primer examen: ");
    nota1 = s.nextInt();
    System.out.print("Introduce la nota de tu segundo examen: ");
    nota2 = s.nextInt();

    media = (nota1 + nota2) / 2;
    if (media >= 5) {
      System.out.println("Tu nota media es " + media);
    } else if (media < 5) {
      System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto) ");
      respuesta = s.nextLine(); // Lee la palabra escrita
      respuesta = respuesta.toLowerCase(); // Transforma la palaba en minuscula

      if (respuesta.equalsIgnoreCase(apto)) {
        media = 5;
        System.out.println("Tu nota media es " + media);
      }
      if (respuesta.equalsIgnoreCase(noApto)) {
        System.out.println("Tu nota media es " + media);
      }
    }
  }
}
