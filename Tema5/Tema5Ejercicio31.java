import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que pinte la letra L por pantalla hecha con asteriscos. El
*programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
*mitad (división entera entre 2) de la altura más uno.
*/

public class Tema5Ejercicio31 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int altura;
    int anchura;
    String letra;

    letra = "*";

    System.out.print("Introduce la altura para formar la L: ");
    altura = s.nextInt();

    for (int cont = 1; cont != altura; cont++) { // Contruye la altura
      System.out.println(letra);
    }
    anchura = (altura / 2) + 1;
    for (int cont = 0; cont != anchura; cont++) { // Construye el ancho
      System.out.print(letra + " ");
    }
  }
}
