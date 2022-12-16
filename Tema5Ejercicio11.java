import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.
*/

public class Tema5Ejercicio11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num;
    int cuadrado;
    int cubo;

    System.out.print("Introduce un número para hacerle el cuadrado y el cubo: ");
    num = s.nextInt();
    for (int cont = 1; cont <= 5; cont++) {
      cuadrado = num * cont;

      cubo = cuadrado * cont;
      System.out.println(num + " este numero elevado al cuadrado es: " + cuadrado + " y al cubo es: " + cubo);
      num = num + 1;
    }
  }
}
