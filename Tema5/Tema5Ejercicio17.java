import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que sume los 100 números siguientes a un número entero
*y positivo introducido por teclado. Se debe comprobar que el dato introducido
*es correcto (que es un número positivo).
*/

public class Tema5Ejercicio17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int introducido;
    long suma;
    int cont;

    cont = 1;
    suma = 0;

    System.out.print("Introduce un número y se le sumara los 100 sigientes: ");
    introducido = s.nextInt();
    while (cont <= 100) {
      suma += introducido;
      introducido = introducido + 1;
      cont++;
    }
    System.out.println("El número total es: " + suma);
  }
}
