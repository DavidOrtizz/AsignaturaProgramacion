import java.util.Scanner;

/*@Autor: David Ortiz Corchero
*
*@Curso: 1ºDAM Tarde
*
*@Descripción: Utiliza la clase Gato para crear un array de cuatro gatos e introduce los datos de cada uno de ellos mediante un bucle. 
*Muestra a continuación los datos de todos los gatos utilizando también un bucle. Pag 225
*/

public class Tema9Ejercicio1Array {
  public static void main(String[] args) {

    final int tam = 4; // Tamaño máximo
    ArrayGato[] gato = new ArrayGato[tam];
    Scanner s = new Scanner(System.in);

    System.out.println("Vas a introducir el color de cada gato");
    for (int i = 0; i < tam; i++) {
      gato[i] = new ArrayGato(); // Se crea el objeto gato con el número correspondiente

      System.out.print("Introduce el color del gato nº" + i + " : ");
      gato[i].setColor(s.next());// Guardamos el color en el gato
    }

    System.out.println("Los datos de los gatos son");
    for (int i = 0; i < tam; i++) {
      System.out.println("El gato nº" + i + " es de color " + gato[i].getColor());
    }
  }
}
