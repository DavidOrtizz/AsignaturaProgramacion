import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar el
 * control de los artículos de un almacén.
 * De cada artículo se debe saber el código, la descripción, el precio de
 * compra, el precio de venta y el stock (número de unidades).
 * El menú del programa debe tener, al menos, las siguientes opciones:
 *
 * 1. Listado
 * 2. Alta
 * 3. Baja
 * 4. Modificación
 * 5. Entrada de mercancía
 * 6. Salida de mercancía
 * 7. Salir
 * 
 * La entrada y salida de mercancía supone respectivamente el incremento y
 * decremento de stock de un determinado artículo.
 * Hay que controlar que no se pueda sacar más mercancía de la que hay en el
 * almacén
 * 
 * @author David Ortiz Corchero
 * 
 * @curso 1ºDAM Tarde
 */

public class Tema10Ejercicio5_Tema9Ejercicio5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String opcion;
    int menu;
    int primeraLibre;
    int i;
    int stockIntroducido;
    double precioDeCompraIntroducido;
    double precioDeVentaIntroducido;
    String codigo;
    String codigoIntroducido = "";
    String descripcionIntroducida;
    String precioDeCompraIntroducidoString;
    String precioDeVentaIntroducidoString;
    String stockIntroducidoString;
    boolean existeCodigo;

    // Crea el array de artículos
    ArrayList<Articulo> articulo = new ArrayList<Articulo>();

    // Menu
    do {
      System.out.println("G E S T I S I M A L");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificación");
      System.out.println("5. Entrada de mercancía");
      System.out.println("6. Salida de mercancía");
      System.out.println("7. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = s.nextLine();

      try { // Comprobamos que no meta una letra en el menu
        menu = Integer.parseInt(opcion);
      } catch (Exception e) {
        System.out.println("Por favor utiliza una opcion del menu");
      }

      switch (opcion) {
        /////////////////////////////////////////////////////////////////////////////
        // LISTADO //////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////
        case 1:
          System.out.println("LISTADO");
          System.out.println("=======");
          for (i = 0; i < articulo.size(); i++) {
            if (!articulo.get(i).getCodigo().equals("LIBRE")) {
              System.out.println(articulo);
            }
          }
          break;
        /////////////////////////////////////////////////////////////////////////////
        // ALTA /////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////
        case 2:
          System.out.println("NUEVO ARTÍCULO");
          System.out.println("==============");
          // Busca la primera posición libre del array
          primeraLibre = 0;
          codigo = articulo.getCodigo(primeraLibre);
          while ((primeraLibre < articulo.size()) && (!(codigo.equals("LIBRE")))) {
            primeraLibre++;
            if (primeraLibre < articulo.size()) {
              codigo = articulo.getCodigo(primeraLibre);
            }
          }
          if (primeraLibre == articulo.size()) {
            System.out.println("Lo siento, a base de datos está llena.");
          } else {
            // Introducción de datos
            System.out.println("Por favor, introduzca los datos del artículo.");
            System.out.print("Código: ");
            // Comprueba que el código introducido no se repita
            existeCodigo = true;
            while (existeCodigo) {
              existeCodigo = false;
              codigoIntroducido = s.next();
              for (i = 0; i < articulo.size(); i++) {
                if (codigoIntroducido.equals(articulo.get(i).getCodigo())) {
                  existeCodigo = true;
                }
              }
              if (existeCodigo) {
                System.out.println("Ese código ya existe en la base de datos.");
                System.out.print("Introduzca otro código: ");
              }
            } // while (existeCodigo)
            articulo.get(primeraLibre).setCodigo(codigoIntroducido);
            System.out.print("Descripcion: ");
            descripcionIntroducida = s.next();
            articulo.get(primeraLibre).setDescripcion(descripcionIntroducida);
            System.out.print("Precio de compra: ");
            precioDeCompraIntroducido = Double.parseDouble(s.next());
            articulo.get(primeraLibre).setPrecioDeCompra(precioDeCompraIntroducido);
            System.out.print("Precio de venta: ");
            precioDeVentaIntroducido = Double.parseDouble(s.next());
            articulo.get(primeraLibre).setPrecioDeVenta(precioDeVentaIntroducido);
            System.out.print("Stock: ");
            stockIntroducido = Integer.parseInt(s.next());
            articulo.get(primeraLibre).setStock(stockIntroducido);
          }
          break;
        /////////////////////////////////////////////////////////////////////////////
        // BAJA /////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////
        case 3:
          System.out.println("BAJA");
          System.out.println("====");
          System.out.print("Por favor, introduzca el código del artículo que desea dar de baja: ");
          codigoIntroducido = s.next();
          i = -1;
          codigo = "";
          do {
            i++;
            if (i < articulo.size()) {
              codigo = articulo.get(i).getCodigo();
            }
          } while (!(codigo.equals(codigoIntroducido)) && (i < articulo.size()));
          if (i == N) {
            System.out.println("Lo siento, el código introducido no existe.");
          } else {
            articulo.get(i).setCodigo("LIBRE");
            System.out.println("articulo borrado.");
          }
          break;
        /////////////////////////////////////////////////////////////////////////////
        // MODIFICACIÓN /////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////
        case 4:
          System.out.println("MODIFICACIÓN");
          System.out.println("============");
          System.out.print("Por favor, introduzca el código del artículo cuyos datos desea cambiar: ");
          codigoIntroducido = s.next();
          i = -1;
          do {
            i++;
          } while (!((articulo.get(i).getCodigo()).equals(codigoIntroducido)));
          System.out.println("Introduzca los nuevos datos del artículo o INTRO para dejarlos igual.");
          System.out.println("Código: " + articulo.get(i).getCodigo());
          System.out.print("Nuevo código: ");
          codigoIntroducido = s.next();
          if (!codigoIntroducido.equals("")) {
            articulo.get(i).setCodigo(codigoIntroducido);
          }
          System.out.println("Descripción: " + articulo.get(i).getDescripcion());
          System.out.print("Nueva descripción: ");
          descripcionIntroducida = s.next();
          if (!descripcionIntroducida.equals("")) {
            articulo.get(i).setDescripcion(descripcionIntroducida);
          }
          System.out.println("Precio de compra: " + articulo.get(i).getPrecioDeCompra());
          System.out.print("Nuevo precio de compra: ");
          precioDeCompraIntroducidoString = s.next();
          if (!precioDeCompraIntroducidoString.equals("")) {
            articulo.get(i).setPrecioDeCompra(Double.parseDouble(precioDeCompraIntroducidoString));
          }
          System.out.println("Precio de venta: " + articulo.get(i).getPrecioDeVenta());
          System.out.print("Nuevo precio de venta: ");
          precioDeVentaIntroducidoString = s.next();
          if (!precioDeVentaIntroducidoString.equals("")) {
            articulo.get(i).setPrecioDeVenta(Double.parseDouble(precioDeVentaIntroducidoString));
          }
          System.out.println("Stock: " + articulo.get(i).getStock());
          System.out.print("Nuevo stock: ");
          stockIntroducidoString = s.next();
          if (!stockIntroducidoString.equals("")) {
            articulo.get(i).setStock(Integer.parseInt(stockIntroducidoString));
          }
          break;
        /////////////////////////////////////////////////////////////////////////////
        // ENTRADA DE MERCANCÍA /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////
        case 5:
          System.out.println("ENTRADA DE MERCANCÍA");
          System.out.println("====================");
          System.out.print("Por favor, introduzca el código del artículo: ");
          codigoIntroducido = s.next();
          i = -1;
          codigo = "";
          do {
            i++;
            if (i < articulo.size()) {
              codigo = articulo.get(i).getCodigo();
            }
          } while (!(codigo.equals(codigoIntroducido)) && (i < articulo.size()));
          if (i == N) {
            System.out.println("Lo siento, el código introducido no existe.");
          } else {
            System.out.println("Entrada de mercancía del siguiente artículo: ");
            System.out.println(articulo.get(i));
            System.out.print("Introduzca el número de unidades que entran al almacén: ");
            stockIntroducidoString = s.next();
            articulo.get(i).setStock(Integer.parseInt(stockIntroducidoString) + articulo.get(i).getStock());
            System.out.println("La mercancía ha entrado en el almacén.");
          }
          break;
        /////////////////////////////////////////////////////////////////////////////
        // SALIDA DE MERCANCÍA //////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////
        case 6:
          System.out.println("SALIDA DE MERCANCÍA");
          System.out.println("===================");
          System.out.print("Por favor, introduzca el código del artículo: ");
          codigoIntroducido = s.next();
          i = -1;
          codigo = "";
          do {
            i++;
            if (i < articulo.size()) {
              codigo = articulo.get(i).getCodigo();
            }
          } while (!(codigo.equals(codigoIntroducido)) && (i < articulo.size()));
          if (i == articulo.size()) {
            System.out.println("Lo siento, el código introducido no existe.");
          } else {
            System.out.println("Salida de mercancía del siguiente artículo: ");
            System.out.println(articulo.get(i));
            System.out.print("Introduzca el número de unidades que desea sacar del almacén: ");
            stockIntroducido = Integer.parseInt(s.next());
            if (articulo.get(i).getStock() - stockIntroducido > 0) {
              articulo.get(i).setStock(articulo.get(i).getStock() - stockIntroducido);
              System.out.println("La mercancía ha salido del almacén.");
            } else {
              System.out.println("Lo siento, no se pueden sacar tantas unidades.");
            }
          }
          break;
      }
    } while (opcion != 7); // switch
  }
}
