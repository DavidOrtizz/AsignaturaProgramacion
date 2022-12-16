import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Switch para formar un circuito.
*/

public class Tema4Circuito {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int menu;
    int menu2;

    System.out.println("o----------------------o");
    System.out.println("|     Localización     |");
    System.out.println("|----------------------|");
    System.out.println("| 1. Málaga            |");
    System.out.println("| 2. Sevilla           |");
    System.out.println("| 3. Granada           |");
    System.out.println("| 4. Córdoba           |");
    System.out.println("o----------------------o");
    System.out.print("Escoge el número de donde te encuentras: ");
    menu = s.nextInt();

    System.out.println("o----------------------o");
    System.out.println("|        Parada        |");
    System.out.println("|----------------------|");
    System.out.println("| 1. Primera parada    |");
    System.out.println("| 2. Segunda parada    |");
    System.out.println("| 3. Tercera parada    |");
    System.out.println("o----------------------o");
    System.out.print("Escoge el número de la parada en la que te encuentras: ");
    menu2 = s.nextInt();

    switch (menu) {
      case 1:
        System.out.print("Te encuentras en málaga");

        switch (menu2) {
          case 1: // Primera parada
            System.out.println(" y vas por la primera parada");
            break;

          case 2:
            System.out.println(" y has pasado por la primera y estas por la segunda parada");
            break;

          case 3:
            System.out.println(" y has pasado por la primera y segunda parada y te encuentras por la tercera parada");
            break;

          default:
            System.out.print(" esa parada no existe");
        }
        break;

      case 2: // Segunda parada
        System.out.print("Te encuentras en Sevilla y ya ha pasado por Málaga");

        switch (menu2) {
          case 1:
            System.out.println(" y te encuentras por la primera parada");
            break;

          case 2:
            System.out.println(", ya has pasado por la primera y estas por la segunda parada");
            break;

          case 3:
            System.out.println(", ya has pasado por la primera y segunda parada y te encuentras por la tercera parada");
            break;

          default:
            System.out.print(" esa parada no existe");
        }
        break;

      case 3: // Tercera parada
        System.out.print("Te encuentras en Granada y ya ha pasado por Málaga y Sevilla");

        switch (menu2) {
          case 1:
            System.out.println(", ahora vas por la primera parada");
            break;

          case 2:
            System.out.println(", ya has pasado por la primera y estas por la segunda parada");
            break;

          case 3:
            System.out.println(", ya has pasado por la primera y segunda parada y estas por la tercera parada");
            break;

          default:
            System.out.print(" esa parada no existe");
        }
        break;

      case 4: // Cuarta parada
        System.out.print("Te encuentras en Córdoba y ya ha pasado por Málaga, Sevilla y Granada");

        switch (menu2) {
          case 1:
            System.out.println(", ahora vas por la primera parada");
            break;

          case 2:
            System.out.println(", ya has pasado por la primera y estas por la segunda parada");
            break;

          case 3:
            System.out.println(", ya has pasado por la primera y segunda parada y te encuentras por la tercera parada");
            break;

          default:
            System.out.print(" esa parada no existe");
        }
        break;

      default:
        System.out.println("No has seleccionado ninguna localización");
    }
  }
}
