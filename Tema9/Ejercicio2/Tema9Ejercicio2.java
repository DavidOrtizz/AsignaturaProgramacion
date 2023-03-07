import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
*la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
*kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
*también algún método específico para cada una de las subclases. Prueba las
*clases creadas mediante un programa con un menú como el que se muestra a
*continuación:
*VEHÍCULOS
*=========
*1. Anda con la bicicleta
*2. Haz el caballito con la bicicleta
*3. Anda con el coche
*4. Quema rueda con el coche
*5. Ver kilometraje de la bicicleta
*6. Ver kilometraje del coche
*7. Ver kilometraje total
*8. Salir
*Elige una opción (1-8):
*/

public class Tema9Ejercicio2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int menu = 1;
    int num;

    Coche toledo = new Coche(1595);
    Bicicleta bmx = new Bicicleta(16);

    while (menu != 8 || menu < 1 || menu > 8) {
      System.out.println("VEHÍCULOS");
      System.out.println("=========");
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.print("Elige una opción (1-8): ");
      menu = s.nextInt();

      switch (menu) {
        case 1:
          System.out.print("¿Qué distancia vas a recorrer?(En kilometros): ");
          num = s.nextInt();
          bmx.recorre(num);
          break;

        case 2:
          bmx.hazCaballito();
          break;

        case 3:
          System.out.print("¿Qué distancia vas a recorrer?(En kilometros): ");
          num = s.nextInt();
          toledo.recorre(num);
          break;

        case 4:
          toledo.quemarRueda();
          break;

        case 5:
          System.out.println("Has recorrido con la bicicleta " + bmx.getKmRecorridos() + " km");
          break;

        case 6:
          System.out.println("Has recorrido con la bicicleta " + toledo.getKmRecorridos() + " km");
          break;

        case 7:
          System.out.println("Has recorrido con los vehiculos " + Vehiculo.getKmTotales() + " km");
          break;

        case 8:
          break;
        default:
          System.out.println("No has introducido un número correcto del menú");
      }
    }
  }
}
