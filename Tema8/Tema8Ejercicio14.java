import java.util.Scanner;
import misFunciones.ConstruirPiramide;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que muestre por pantalla un triángulo como el del ejemplo. 
*Deberá recibir dos parámetros: el carácter que se desea imprimir y el número de líneas del triángulo.
*/

public class Tema8Ejercicio14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int lineas;
    String caracter;

    System.out.print("Introduce cuantas líneas quiere que sea de grande la piramide: ");
    lineas = s.nextInt();
    System.out.print("Introduce el caracter con el que va a ser construido: ");
    caracter = s.next();

    ConstruirPiramide.construirPiramide(lineas, caracter);
  }
}
