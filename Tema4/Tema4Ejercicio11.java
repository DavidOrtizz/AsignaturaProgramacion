import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que dada una hora determinada (horas y minutos), calcule
*los segundos que faltan para llegar a la medianoche.
*/

public class Tema4Ejercicio11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int hora; // operación segundo = hora * 3600
    int minuto; // operación segundo = (60 - minuto) * 60 + segundo
    int segundo;

    System.out.print("Introduce la hora: ");
    hora = s.nextInt();
    System.out.print("Introduce los minutos: ");
    minuto = s.nextInt();
    if (hora > 24) {
      System.out.println("No existe la hora selecionada");
    }

    segundo = (24 - hora) * 3600;
    segundo = (60 - minuto) * 60 + segundo;

    System.out.println("Quedan " + segundo + " segundos para que sea medianoche.");
  }
}
