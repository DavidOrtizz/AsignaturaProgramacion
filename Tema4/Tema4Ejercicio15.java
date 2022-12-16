import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que pinte una pirámide rellena con un carácter introducido
*por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,etc.
*El programa debe permitir al usuario mediante un menú elegir si el vértice
*de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.
*/

public class Tema4Ejercicio15 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int menu;
    String relleno;

    System.out.println("o------------------------o");
    System.out.println("|   Elige la dirección   |");
    System.out.println("|------------------------|");
    System.out.println("| 1. Arriba              |");
    System.out.println("| 2. Abajo               |");
    System.out.println("| 3. Izquierda           |");
    System.out.println("| 4. Derecha             |");
    System.out.println("o------------------------o");
    System.out.print("Escoge la dirección: ");
    menu = s.nextInt();

    System.out.print("Introduce un caracter para que sea el relleno: ");
    relleno = s.next();

    switch (menu) {
      case 1: // Arriba
        System.out.println("  " + relleno + "  ");
        System.out.println(" " + relleno + relleno + relleno + " ");
        System.out.println("" + relleno + relleno + relleno + relleno + relleno);
        break;

      case 2: // Abajo
        System.out.println("" + relleno + relleno + relleno + relleno + relleno);
        System.out.println(" " + relleno + relleno + relleno + " ");
        System.out.println("  " + relleno + "  ");
        break;

      case 3: // Izquierda
        System.out.println("  " + relleno);
        System.out.println(" " + relleno + relleno);
        System.out.println(relleno + relleno + relleno);
        System.out.println(" " + relleno + relleno);
        System.out.println("  " + relleno);
        break;

      case 4: // Derecha
        System.out.println(relleno + "  ");
        System.out.println(relleno + relleno + " ");
        System.out.println(relleno + relleno + relleno);
        System.out.println(relleno + relleno + " ");
        System.out.println(relleno + "  ");
        break;

      default:
        System.out.println("No has introducido una direeción valida");
    }
  }
}
