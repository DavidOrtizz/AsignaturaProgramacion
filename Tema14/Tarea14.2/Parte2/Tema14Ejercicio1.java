import java.util.Scanner;

/**
 * Realiza un programa que pida 6 números por teclado y nos diga cuál es el
 * máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
 * entero) el programa debe indicarlo y debe pedir de nuevo el número.
 * 
 * @author David Ortiz Corchero
 * 
 * @curso: 1ºDAM Tarde
 */

public class Tema14Ejercicio1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int tam = 6; // Tamaño del array
    int[] num = new int[tam];
    int cont = 0;
    String seleccion;
    int max = Integer.MIN_VALUE;

    while (cont != tam) {
      System.out.print("Introduce el número " + (cont + 1) + " : ");
      seleccion = s.nextLine();
      try {
        num[cont] = Integer.parseInt(seleccion);
        if (num[cont] > max) { // Comprobamos que el numero introducido es mayor que el máximo
          max = num[cont];
        }
        cont++;
      } catch (Exception e) {
        System.out.println("Has introducido una letra, repitelo");
      }
    }
    System.out.println("El número máximo dado es: " + max);
  }
}
