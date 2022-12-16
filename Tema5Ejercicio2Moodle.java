import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que los números naturales hasta un valor introducido por teclado.
*/

public class Tema5Ejercicio2Moodle {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero;
    System.out.print("Introduce el número máximo: ");
    numero = s.nextInt();

    for (int i = 1; i <= numero; i++) { // i es el contador
      System.out.println(i);
    }
  }
}
