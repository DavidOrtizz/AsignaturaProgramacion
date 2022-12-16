import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que calcule la media de un conjunto de números positivos
*introducidos por teclado. A priori, el programa no sabe cuántos números se
*introducirán. El usuario indicará que ha terminado de introducir los datos
*cuando meta un número negativo.
*/

public class Tema5Ejercicio10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double suma;
    double introducir;
    double cantidadexamenes;
    double media;

    cantidadexamenes = 0;
    introducir = 0;
    suma = 0;

    System.out.println("Para calcular tu media vas a introducir tus notas, para pararlo pon un número negativo");
    System.out.print("Introduce tu nota: ");
    while (introducir >= 0) {
      introducir = s.nextDouble();
      suma += introducir;
      cantidadexamenes++;
    }
    cantidadexamenes = cantidadexamenes - 1;
    suma = suma - introducir;
    media = suma / cantidadexamenes;
    System.out.print("La nota media que tienes es de " + media);
  }
}
