import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Switch con las estaciones del año.
*/

public class Tema4EjemploEstaciones {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero;
    String estacion;

    System.out.print("Introduce el numero del mes: ");
    numero = s.nextInt();

    switch (numero) {
      case 12: // Diciembre
      case 1: // Enero
      case 2: // Febrero
        estacion = "Invierno";
        System.out.println("Te encuentras en " + estacion);
        break;

      case 3: // Marzo
      case 4: // Abril
      case 5: // Mayo
      case 6: // Junio
        estacion = "Primavera";
        System.out.println("Te encuentras en " + estacion);
        break;

      case 7: // Julio
      case 8: // Agostos
        estacion = "Verano";
        break;

      case 9: // Septiembre
      case 10: // Octubre
      case 11: // Noviembre
        estacion = "Otoño";
        System.out.println("Te encuentras en " + estacion);
        break;

      default:
        estacion = "Ese mes no existe";
    }
  }
}
