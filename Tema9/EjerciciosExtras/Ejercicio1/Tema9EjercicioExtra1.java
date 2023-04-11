import java.util.Scanner;

/*@author: David Ortiz Corchero
*
*@curso: 1ºDAM Tarde
*
*@descripción: Supongamos una clase Producto con dos atributos:
* • String nombre
* • int cantidad
* 
* Implementa esta clase con un constructor (con parámetros) además de los getters y setters de sus dos atributos. 
* No es necesario comprobar los datos introducidos. A continuación, en el programa principal haz lo siguiente:
* 1. Crea 5 instancias de la Clase Producto.
* 2. Crea un ArrayList.
* 3. Añade las 5 instancias de Producto al ArrayList.
* 4. Visualiza el contenido de ArrayList utilizando Iterator. 
* 5. Elimina dos elemento del ArrayList. 
* 6. Inserta un nuevo objeto producto en medio de la lista. 
* 7. Visualiza de nuevo el contenido de ArrayList utilizando Iterator. 
* 8. Elimina todos los valores del ArrayList.  
*/
public class Tema9EjercicioExtra1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int tam = 5; // Tamaño array
    boolean salir = false;
    String pregunta;
    String menu;
    int seleccion = 0;
    String nombre;
    int cantidad;

    Producto[] producto = new Producto[tam];
    Producto[] borrado = new Producto[1]; // Solo sirve para borrar el array producto

    for (int i = 0; i < tam; i++) { // Crea todos los productos
      producto[i] = new Producto();
    }
    borrado[0] = new Producto(); // Eliminador de productos

    do { // Menu
      System.out.println("º----------------Menu----------------º");
      System.out.println("1. Añadir producto");
      System.out.println("2. Visualizar los productos");
      System.out.println("3. Eliminar un producto");
      System.out.println("4. Insertar producto en medio de la lista");
      System.out.println("5. Eliminar todos los productos");
      System.out.println("6. Salir del menu");
      System.out.println("º------------------------------------º");
      System.out.print("Selecciona una opción del menu: ");
      menu = s.next();

      switch (menu) {
        case "1":
          System.out.println("Has seleccionado añadir producto");
          System.out.print("Introduce la posición del producto (0 - " + (tam - 1) + "): ");
          seleccion = s.nextInt(); // Guardamos la posición que vamos a modificar
          System.out.print("Introduce el nombre del producto: ");
          nombre = s.next(); // Guarda el nombre
          producto[seleccion].setNombre(nombre); // Guarda el nombre en el String
          System.out.print("Introduce la cantidad de producto que vas a añadir: ");
          cantidad = s.nextInt();
          producto[seleccion].setCantidad(cantidad);
          break;

        case "2":
          System.out.println("Has seleccionado visualizar los productos");
          for (int i = 0; i < tam; i++) {
            System.out.println("El producto guardado en la posición " + i);
            System.out.println("Nombre del producto: " + producto[i].getNombre()); // Mostramos el nombre
            System.out.println("Cantidad de producto: " + producto[i].getCantidad()); // Mostramos la cantidad
          }
          break;

        case "3":
          System.out.println("Has seleccionado eliminar un producto");
          System.out.print("Introduce la posición del producto que quieras eliminar (0 - " + (tam - 1) + "): ");
          seleccion = s.nextInt(); // Guardamos la posición que vamos a eliminar
          producto[seleccion] = borrado[0]; // Se elimina el producto
          System.out.println("Producto eliminado");
          break;

        case "4":
          System.out.println("Has seleccionado insertar un producto en medio de la lista");
          seleccion = tam / 2;
          System.out.print("Introduce el nombre del producto: ");
          nombre = s.next(); // Guarda el nombre
          producto[seleccion].setNombre(nombre); // Guarda el nombre en el String
          System.out.print("Introduce la cantidad de producto que vas a añadir: ");
          cantidad = s.nextInt();
          producto[seleccion].setCantidad(cantidad);
          break;

        case "5":
          System.out.println("Has seleccionado eliminar todos los producto");
          System.out.print("¿Estás seguro de que quieres borrar todos los productos? (Si estas seguro pon 'si') ");
          pregunta = s.next();
          pregunta = pregunta.toLowerCase();
          switch (pregunta) {
            case "si":
              System.out.println("Borrando todos los productos");
              for (int i = 0; i < tam; i++) {
                producto[i] = borrado[0]; // Igualamos al array vacio para eliminar todo lo añadido en el array producto
              }
              break;
            default:
              System.out.println("Se ha cancelado el borrado de todos productos");
          } // Cierre del switch
          break;

        case "6":
          salir = true;
          break;

        default:
          System.out.println("Por favor selecciona una opción del menu");
      } // Cierre del switch
    } while (salir != true); // Cierre del menu
  }
}
