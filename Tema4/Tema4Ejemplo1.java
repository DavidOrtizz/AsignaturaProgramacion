import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que diga si er cierto o no el color.
*/

public class Tema4Ejemplo1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String color = "azul";
    String respuesta;

    System.out.print("¿En que color estoy pensando? ");
    respuesta = s.nextLine(); // Lee la palabra escrita
    respuesta = respuesta.toLowerCase(); // Transforma la palaba en minuscula

    if (respuesta.equals(color)) {
      System.out.println("¡Es correcto!");
    } else {
      System.out.println("Lo siento, has fallado :(");
    }
  }
}
