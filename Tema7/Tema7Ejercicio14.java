import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que pida 8 palabras y las almacene en un array. A continuación, las palabras correspondientes 
*a colores se deben almacenar al comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays auxiliares como quieras. 
*Los colores que conoce el programa deben estar en otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
*blanco y morado.
*/

public class Tema7Ejercicio14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String[] colores = { "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado" };
    int tam = 8;
    String[] palabras = new String[tam];
    String[] coloresEncontrados = new String[tam];
    String[] palabrasNoColores = new String[tam];
    int contadorColores = 0;
    int contadorPalabrasNoColores = 0;

    // Almacenar las palabras
    for (int cont = 0; cont < tam; cont++) {
      System.out.print("Introduce una palabra: ");
      palabras[cont] = s.next().toLowerCase();
    }

    // Buscar palabras que sean colores
    for (int i = 0; i < palabras.length; i++) {
      for (int j = 0; j < colores.length; j++) {
        if (palabras[i].equals(colores[j])) {
          coloresEncontrados[contadorColores] = palabras[i];
          contadorColores++;
          break;
        }
      }
    }

    // Buscar palabras que no sean colores
    for (int i = 0; i < palabras.length; i++) {
      boolean esColor = false;
      for (int j = 0; j < contadorColores; j++) {
        if (palabras[i].equals(coloresEncontrados[j])) {
          esColor = true;
          break;
        }
      }
      if (!esColor) {
        palabrasNoColores[contadorPalabrasNoColores] = palabras[i];
        contadorPalabrasNoColores++;
      }
    }

    // Imprimir primero los colores encontrados y luego los que no son colores
    System.out.print("Palabras ordenadas: ");
    for (int i = 0; i < contadorColores; i++) {
      System.out.print(coloresEncontrados[i] + " ");
    }
    for (int i = 0; i < contadorPalabrasNoColores; i++) {
      System.out.print(palabrasNoColores[i] + " ");
    }
  }
}
