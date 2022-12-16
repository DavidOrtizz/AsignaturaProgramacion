import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que realize el control de acceso a una caja fuerte. 
*La combinación será un número de 4 cifras. El programa nos pedirá la combinación para abrirla.
*Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
*y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
*Tendremos cuatro oportunidades para abrir la caja fuerte.
*/

public class Tema5Ejercicio7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int intentos;
    int usuario;

    intentos = 3;
    usuario = 0;

    do {
      System.out.print("Introduce el código de la caja fuerte, tienes " + intentos + " intentos: ");
      usuario = s.nextInt();
      if (usuario == 1234) { // Código de la caja fuerte
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
      } else {
        System.out.println("Lo siento, esa no es la combinación");
        intentos = intentos - 1;
      }
      if (intentos == 0) { // Comprobar que te has quedados sin intentos
        System.out.println("Y te has quedado sin intentos");
      }
    } while (usuario != 1234 && intentos != 0);
  }
}
