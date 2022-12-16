import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que pida una hora por teclado y que muestre luego buenos
*días, buenas tardes o buenas noches según la hora.
*/

public class Tema4Ejercicio2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int hora;

    System.out.print("¿Que hora es? ");
    hora = s.nextInt();

    if (hora <= 0 || hora >= 23) {
      System.out.println("La hora que ha introducido no es valido, tiene que ser un número dentro del 0 al 23");
      System.out.print("No pasa nada introducelo de nuevo: ");
      hora = s.nextInt();
    }

    if (hora >= 6 && hora <= 12) {
      System.out.println("Buenos días");
    }
    if (hora >= 13 && hora <= 20) {
      System.out.println("Buenas tardes");
    }
    if (hora >= 21 || hora <= 5) {
      System.out.println("Buenas noches");
    }
  }
}
