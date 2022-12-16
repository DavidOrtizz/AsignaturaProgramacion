import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que calcule el precio final de un producto según su
*base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
*reducido o superreducido) y el código promocional. Los tipos de IVA general,
*reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
*promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
*respectivamente que no se aplica promoción, el precio se reduce a la mitad,
*se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
*muestran los valores correctos, aunque los números no estén tabulados.
*/

public class Tema4Ejercicio23 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double baseImponible;
    String iva;
    double tipoIva;
    double precioIva;
    double totalIva;
    String promo;
    double tipoDescuento;
    double total;
    tipoIva = 0;
    tipoDescuento = 0;

    System.out.print("Introduzca la base imponible: ");
    baseImponible = s.nextDouble();
    System.out.print("Introduzca el tipo de iva (general, reducido o superreducido): ");
    iva = s.next();
    iva = iva.toLowerCase();
    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    promo = s.next();
    promo = promo.toLowerCase();

    switch (iva) {
      case "general": // 24%
        tipoIva = 0.24;
        break;

      case "reducido": // 10%
        tipoIva = 0.10;
        break;

      case "superreducido": // 4%
        tipoIva = 0.04;
        break;

      default:
        System.out.println(" (Error en el tipo de iva) ");
    }

    precioIva = baseImponible * tipoIva;
    totalIva = baseImponible + precioIva;

    switch (promo) {
      case "nopro": // Sin descuento
        tipoDescuento = 0;
        break;

      case "mitad": // Mitad de precio
        tipoDescuento = totalIva / 2;
        break;

      case "meno5": // -5€
        tipoDescuento = totalIva - 5;
        break;

      case "5porc": // - 5%
        tipoDescuento = totalIva * 0.05;

      default:
        System.out.println("No has introducido un código de descuento correcto");
    }
    total = totalIva - tipoDescuento;
    tipoIva = tipoIva * 100;

    System.out.printf("Base imponible       %6.2f\n", baseImponible);
    System.out.printf("IVA (" + iva + ")          %4.0f\n", tipoIva);
    System.out.printf("Precio con IVA       %6.2f\n", precioIva);
    System.out.printf("Cód. promo. (" + promo + ") -%6.2f\n", tipoDescuento);
    System.out.printf("TOTAL                %6.2f\n", total);
  }
}
