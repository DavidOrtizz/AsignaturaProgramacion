import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que nos diga el horóscopo a partir del día y el mes de
*nacimiento.
*/

public class Tema4Ejercicio10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int dia;
    int mes;

    System.out.print("Dime el día de tu nacimiento: ");
    dia = s.nextInt();
    System.out.print("Dime el mes de nacimiento: ");
    mes = s.nextInt();

    switch (mes) {
      case 1: // Enero
        if (20 <= dia) { // Capricornio
          System.out.println("Tu signo es capricornio");
        }
        if (dia >= 21 && dia <= 31) { // Acuario
          System.out.println("Tu signo es acuario");
        }
        break;

      case 2: // Febrero
        if (dia <= 19) { // Acuario
          System.out.println("Tu signo es acuario");
        }
        if (dia >= 20 && dia <= 31) { // Piscis
          System.out.println("Tu signo es piscis");
        }
        break;

      case 3: // Marzo
        if (dia <= 20) { // Piscis
          System.out.println("Tu signo es piscis");
        }
        if (dia >= 21 && dia <= 31) { // Aries
          System.out.println("Tu signo es aries");
        }
        break;

      case 4: // Abril
        if (dia <= 19) { // Aries
          System.out.println("Tu signo es aries");
        }
        if (dia >= 20 && dia <= 31) { // Tauro
          System.out.println("Tu signo es tauro");
        }
        break;

      case 5: // Mayo
        if (dia <= 20) { // Tauro
          System.out.println("Tu signo es tauro");
        }
        if (dia >= 21 && dia <= 31) { // Geminis
          System.out.println("Tu signo es geminis");
        }
        break;

      case 6: // Junio
        if (dia <= 20) { // Geminis
          System.out.println("Tu signo es geminis");
        }
        if (dia >= 21 && dia <= 31) { // Cancer
          System.out.println("Tu signo es cancer");
        }
        break;

      case 7: // Julio
        if (dia <= 22) { // Cancer
          System.out.println("Tu signo es cancer");
        }
        if (dia >= 23 && dia <= 31) { // Leo
          System.out.println("Tu signo es leo");
        }
        break;

      case 8: // Agosto
        if (dia <= 22) { // Leo
          System.out.println("Tu signo es tauro");
        }
        if (dia >= 23 && dia <= 31) { // Virgo
          System.out.println("Tu signo es virgo");
        }
        break;

      case 9: // Septiembre
        if (dia <= 22) { // Virgo
          System.out.println("Tu signo es tauro");
        }
        if (dia >= 23 && dia <= 31) { // Libra
          System.out.println("Tu signo es libra");
        }
        break;

      case 10: // Octubre
        if (dia <= 22) { // Libra
          System.out.println("Tu signo es tauro");
        }
        if (dia >= 23 && dia <= 31) { // Escorpio
          System.out.println("Tu signo es escorpio");
        }
        break;

      case 11: // Noviembre
        if (dia <= 21) { // Escorpio
          System.out.println("Tu signo es escorpio");
        }
        if (dia >= 22 && dia <= 31) { // Sagitario
          System.out.println("Tu signo es sagitario");
        }
        break;

      case 12: // Diciembre
        if (dia <= 21) { // Sagitario
          System.out.println("Tu signo es sagitario");
        }
        if (dia >= 22 && dia <= 31) { // Capricornio
          System.out.println("Tu signo es capricornio");
        }
        break;

      default:
        System.out.println("Has puesto mal el mes");
    }
  }
}
