import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que programa que pida una base y un exponente (entero positivo) y que
*calcule la potencia.
*/

public class Tema5Ejercicio14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int base;
    int exponente;
    int cont;
    int resultado;

    cont = 2;

    System.out.print("Introduce la base: ");
    base = s.nextInt();
    System.out.print("Introduce el exponente: ");
    exponente = s.nextInt();

    resultado = base;
    while (cont <= exponente) {
      if (cont == 1) {
        resultado = base;
      } else {
        resultado *= base;
      }
      cont++;
    }
    if (exponente == 0) {
      System.out.println("La solución es: 1");
    } else {
      System.out.println("La solución es: " + resultado);
    }
  }
}
