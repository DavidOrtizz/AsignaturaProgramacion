import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Realiza un programa que calcule el precio de unas entradas de cine en función
*del número de personas y del día de la semana. El precio base de una entrada
*son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los
*jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
*Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
*grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
*que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
*1 individual que son 41 euros (33 + 8).
*/

public class Tema4Ejercicio26 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String dia;
    int personas;
    int entradas;
    int precioEntrada;
    final int tarjeta;
    String tenerTarjeta;
    int contador;

    tarjeta = 10;
    precioEntrada = 8;

    System.out.println("Venta de entradas CineCampa");
    System.out.print("Numero de entradas: ");
    entradas = s.nextInt(); // Número de entradas
    System.out.print("Día de la semana: ");
    dia = s.next();
    dia = dia.toLowerCase();
    System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
    tenerTarjeta = s.next();
    tenerTarjeta = tenerTarjeta.toLowerCase();
    System.out.println("");

    contador = entradas;
    switch (dia) {
      case "lunes":
      case "martes":
      case "viernes":
      case "sabado": // sin tilde
      case "sábado": // con tilde
      case "domingo":
        break;

      case "miercoles": // sin tilde
      case "miércoles": // con tilde
        precioEntrada = 5; // El precio de la entrada en este día es de 5€
        break;

      case "jueves": // día de la pareja
        break;

      default:
        System.out.println("No has seleccionado ningun día");
    }

    System.out.println("Aquí tiene sus entradas. Gracias por su compra.");

  }
}
