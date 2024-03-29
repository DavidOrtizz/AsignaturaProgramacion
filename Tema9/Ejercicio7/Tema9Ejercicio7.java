import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Queremos gestionar la venta de entradas (no numeradas) de Expocoches Campanillas que tiene 3 zonas, 
* la sala principal con 1000 entradas disponibles, la zona de compra-venta con 200 entradas disponibles y la zona vip con 25 entradas disponibles.
* Hay que controlar que existen entradas antes de venderlas.
* La clase Zona con sus atributos y métodos se proporciona al alumno.
* 
* El menú del programa debe ser el que se muestra a continuación.
* Cuando elegimos la opción 2, se nos debe preguntar para qué zona queremos las entradas y cuántas queremos.
* Lógicamente, el programa debe controlar que no se puedan vender más entradas de la cuenta.
* 
* 1. Mostrar número de entradas libres
* 2. Vender entradas
* 3. Salir
*/

public class Tema9Ejercicio7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    Zona principal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);
    int opcion = 0;
    int opcion2 = 0;
    int n = 0;

    do {
      System.out.println("EXPOCOCHES CAMPANILLAS");
      System.out.println("1. Mostrar número de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      System.out.print("Elige una opción: ");
      opcion = s.nextInt();

      if (opcion == 1) {
        System.out.println("En la zona principal hay " + principal.getEntradasPorVender());
        System.out.println("En la zona de compra venta hay " + compraVenta.getEntradasPorVender());
        System.out.println("En la zona vip hay " + vip.getEntradasPorVender());
      }

      if (opcion == 2) {
        System.out.println("1. Principal");
        System.out.println("2. Compra-venta");
        System.out.println("3. Vip");
        System.out.print("Elige la zona para la que quieres comprar las entradas: ");
        opcion2 = s.nextInt();
        System.out.print("¿Cuántas entradas quieres? ");
        n = s.nextInt();

        switch (opcion2) {
          case 1:
            principal.vender(n);
            break;
          case 2:
            compraVenta.vender(n);
            break;
          case 3:
            vip.vender(n);
            break;
          default:
        }
      }
    } while (opcion < 3 || opcion > 1); // menú principal
  }
}
