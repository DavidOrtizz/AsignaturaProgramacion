import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Switch de los dias de la semana.
*/

public class Tema4EjemploSwitch {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String dia;
    int numero;

    System.out.print("Introduce el número del día de la semana: ");
    numero = s.nextInt();

    switch (numero) {
      case 1:
        dia = "Lunes";
        break;

      case 2:
        dia = "Martes";
        break;

      case 3:
        dia = "Miércoles";
        break;

      case 4:
        dia = "Jueves";
        break;

      case 5:
        dia = "Viernes";
        break;

      case 6:
        dia = "Sábado";
        break;

      case 7:
        dia = "Domingo";
        break;

      default:
        dia = "ese día no existe";
    }

    System.out.println("El número " + numero + " corresponde a " + dia);
  }
}
