/*@Autor: David Ortiz Corchero
*
*@Curso: 1ºDAM Tarde
*
*@Descripción: Cambia el programa anterior de tal forma que los datos de los gatos se introduzcan directamente en el código de 
* la forma gatito[2].setColor("marrón") o bien mediante el constructor, de la forma gatito[3] = new Gato("Garfield", "naranja", "macho"). 
* Muestra a continuación los datos de todos los gatos utilizando un bucle. Pag 225
*/

public class Tema9Ejercicio2Array {
  public static void main(String[] args) {

    final int tam = 4; // Tamaño máximo
    ArrayGato2[] gato = new ArrayGato2[tam];

    gato[0] = new ArrayGato2("Marron");
    gato[1] = new ArrayGato2("Blanco");
    gato[2] = new ArrayGato2("Naranja");
    gato[3] = new ArrayGato2("Negro");

    System.out.println("Los datos de los gatos son");
    for (int i = 0; i < tam; i++) {
      System.out.println("El gato nº" + i + " es de color " + gato[i].getColor());
    }

    gato[1].come(4);
    gato[3].come(3);
    gato[2].come(2);
    gato[0].come(2);
    gato[1].come(8);
  }
}
