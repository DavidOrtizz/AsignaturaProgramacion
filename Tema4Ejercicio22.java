import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que dado un día de la semana (de lunes a viernes) y una
*hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
*Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
*por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
*a las 15:00h.
*/

public class Tema4Ejercicio22 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String dia;
    int menu;
    int fecha;
    int hora;
    int minuto;
    int total;
    boolean viernes;
    fecha = 0;
    viernes = false;

    System.out.println("o----------------------o");
    System.out.println("|   Día de la semana   |");
    System.out.println("|----------------------|");
    System.out.println("| 1. Lunes             |");
    System.out.println("| 2. Martes            |");
    System.out.println("| 3. Miercoles         |");
    System.out.println("| 4. Jueves            |");
    System.out.println("| 5. Viernes           |");
    System.out.println("o----------------------o");
    System.out.print("Introduce el número del día de la semana: ");
    menu = s.nextInt();

    switch (menu) {
      case 1:
        dia = "Lunes";
        fecha = 4;
        break;

      case 2:
        dia = "Martes";
        fecha = 3;
        break;

      case 3:
        dia = "Miércoles";
        fecha = 2;
        break;

      case 4:
        dia = "Jueves";
        fecha = 1;
        break;

      case 5:
        dia = "Viernes";
        fecha = 0;
        viernes = true;
        break;

      default:
        dia = "Ese día no se encuentra en el menú";
    }

    if (menu <= 5) {
      System.out.print("Introduce la hora: ");
      hora = s.nextInt();
      System.out.print("Introduce los minutos: ");
      minuto = s.nextInt();

      if (viernes == true) {
        if (hora == 14) {
          total = 60 - minuto;
          System.out.println("Quedan " + total + " minutos.");
        } else {
          hora = 14 - hora; // Las horas que quedan
          total = minuto + (hora * 60); // De horas a minutos
          System.out.println("Quedan " + total + " minutos.");
        }
      }
      if (viernes == false) {
        hora = hora + (fecha * 24); // De días a horas
        total = minuto + (hora * 60); // De horas a minutos
        System.out.println("Quedan " + total + " minutos.");
      }
    } else {
      System.out.println("" + dia);
    }
  }
}
