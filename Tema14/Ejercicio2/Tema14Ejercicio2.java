import java.util.Scanner;

public class Tema14Ejercicio2 {
  /*
   * Comprobar si hay alguna letra dentro del string
   * 
   * @param str String del que queramos comprobar
   * 
   * @return str
   */
  private static boolean isNumeric(String str) {
    return str != null && str.matches("[0-9.]+");
  }

  /*
   * @author: David Ortiz Corchero
   * 
   * @curso: 1ºDAM Tarde
   * 
   * @descripcion: Crea la clase Vehiculo, así como las clases Bicicleta y Coche
   * como subclases de la primera.
   * Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
   * kilometrosTotales, así como el atributo de instancia kilometrosRecorridos.
   * Crea también algún método específico para cada una de las subclases.
   * Prueba las clases creadas mediante un programa con un menú como el que se
   * muestra a continuación:
   * VEHÍCULOS
   * =========
   * 1. Anda con la bicicleta
   * 2. Haz el caballito con la bicicleta
   * 3. Anda con el coche
   * 4. Quema rueda con el coche
   * 5. Ver kilometraje de la bicicleta
   * 6. Ver kilometraje del coche
   * 7. Ver kilometraje total
   * 8. Salir
   * Elige una opción (1-8):
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String opcion = "";
    int menu = 1;
    int num;

    Coche toledo = new Coche(1595);
    Bicicleta bmx = new Bicicleta(16);

    while (menu != 8) {
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
      opcion = s.nextLine();

      if (isNumeric(opcion)) {
        menu = Integer.parseInt(opcion); // Combierte el contenido del string en int
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
        } // Salida switch
      } else { // Si se introduce una opción no valida saldrá este mensaje
        System.out.println("Error, has introducido un caracter no deseado");
      } // Salida else
    } // Salida while
  }
}
