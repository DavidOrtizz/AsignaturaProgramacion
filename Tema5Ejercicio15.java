import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que dados dos números, uno real (base) y un entero
*positivo (exponente), saque por pantalla todas las potencias con base el
*numero dado y exponentes entre uno y el exponente introducido.
*/

public class Tema5Ejercicio15 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int base;
    int exponente;
    int cont;
    int resultado;

    cont = 1;

    System.out.print("Introduce la base: ");
    base = s.nextInt();
    System.out.print("Introduce el exponente: ");
    exponente = s.nextInt();

    resultado = base;
    while (cont <= exponente) {
      if (cont == 1) {
        resultado = base;
        System.out.println(base + " ^ " + cont + " = " + resultado);
      } else {
        resultado *= base;
        System.out.println(base + " ^ " + cont + " = " + resultado);
      }
      cont++;
    }
  }
}
