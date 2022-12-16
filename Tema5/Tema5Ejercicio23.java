import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que permita ir introduciendo una serie indeterminada
*de números mientras su suma no supere el valor 10000. Cuando esto último ocurra, 
*se debe mostrar el total acumulado, el contador de los números introducidos y la media.
*/

public class Tema5Ejercicio23 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double numero;
    double suma;
    double total;
    double media;
    int cont;

    suma = 0;
    cont = 0;
    total = 0;
    System.out.println("Introduce todos los números que quieras hasta que la suma de todos ellos sea 1000");
    do {
      System.out.print("Introduce un número: ");
      numero = s.nextDouble();
      suma += numero;
      total++;
      cont++;
    } while (suma <= 1000);
    media = suma / cont;

    System.out.println("Se ha acumulado un total de " + suma);
    System.out.println("Se han introducido un total de " + total + " números");
    System.out.println("La media es de " + media);
  }
}
