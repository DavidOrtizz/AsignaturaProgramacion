import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
*máxima calidad y nos ha pedido hacer un configurador que calcule el precio
*según el alto y el ancho. El precio base de una bandera es de un céntimo de
*euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
*se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
*son 3.25 €. El IVA ya está incluido en todas las tarifas.
*/

public class Tema4Ejercicio25 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int altura;
    int ancho;
    String bordado;
    double precioBordado;
    int tamaño;
    double precioTamaño;
    double gastoEnvio;
    double total;
    gastoEnvio = 3.25;
    precioBordado = 0;

    System.out.print("Introduzca la altura de la bandera en cm: ");
    altura = s.nextInt();
    System.out.print("Ahora introduzca la anchura: ");
    ancho = s.nextInt();
    System.out.print("¿Quiere escudo bordado? (s/n): ");
    bordado = s.next();
    bordado = bordado.toLowerCase();
    System.out.println("Gracias. Aquí tiene el desglose de su compra.");

    tamaño = ancho * altura;
    precioTamaño = tamaño * 0.01;

    switch (bordado) {
      case "s":
        precioBordado = 2.5;
        break;

      case "n":
        precioBordado = 0;
        break;

      default:
        System.out.println("No has introducido una respuesta correcta");
    }

    total = precioTamaño + precioBordado + gastoEnvio;

    System.out.printf("Bandera de " + tamaño + " cm2:   %6.2f\n", precioTamaño);
    System.out.printf("Con escudo:             %6.2f\n", precioBordado);
    System.out.printf("Gastos de envío:        %6.2f\n", gastoEnvio);
    System.out.printf("Total:                  %6.2f\n", total);
  }
}
