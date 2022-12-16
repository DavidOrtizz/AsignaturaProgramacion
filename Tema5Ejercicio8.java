import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que la tabla de 
*multiplicar de un número introducido por teclado.
*/

public class Tema5Ejercicio8 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero;
    int contador;
    int total;

    contador = 0;
    System.out.print("Introduce un número para multiplicarlo: ");
    numero = s.nextInt();

    while (contador <= 10) {
      total = numero * contador;
      System.out.println(numero + " * " + contador + " = " + total);
      contador++;
    }
  }
}
