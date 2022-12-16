import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que pinte la letra U por pantalla hecha con asteriscos. El
*programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
*dos asteriscos menos en la base para simular la curvatura de las esquinas inferiores.
*/

public class Tema5Ejercicio33 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int altura;

    System.out.print("introduce la altura de la letra U: ");
    altura = s.nextInt();
    for (int cont = 1; cont < altura; cont++) {
      System.out.print("* ");
      for (int y = 2; y < altura; y++) {
        System.out.print(" ");
      }
      System.out.println(" *");
    }
    System.out.print(" ");
    for (int cont = 2; cont < altura; cont++) {
      System.out.print("* ");
    }
  }
}
