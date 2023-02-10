import java.util.Scanner;
import misFunciones.TablaMultiplicar;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que escriba la tabla de multiplicar de un número introducido por teclado.
*Para ello implementa una función que reciba como parámetro un número entero y muestre por pantalla la tabla de multiplicar de dicho número.
*/

public class Tema8Ejercicio11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double a;
    double b;

    System.out.print("Introduce el número del factor: ");
    a = s.nextInt();
    System.out.print("Introduce el número de hasta donde quieres que llegue: ");
    b = s.nextInt();

    TablaMultiplicar.tablaMultiplicar(a, b);
  }
}
