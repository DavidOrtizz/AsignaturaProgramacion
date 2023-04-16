import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Realiza un programa que genere una excepción de forma aleatoria de entre
 * las siguientes excepciones: NumberFormatException, IOException,
 * FileNotFoundException, IndexOutOfBoundsException y ArithmeticException.
 * 
 * @author David Ortiz Corchero
 * 
 * @curso: 1ºDAM Tarde
 */
public class Tema14Ejercicio3 {
  public static void main(String[] args) {
    int num;

    System.out.println("Se va a generar una excepción de forma aleatoria");

    num = (int) (Math.random() * 5 + 1); // Generar numero aleatorio para la exepción
    switch (num) {
      case 1: // NumberFormatException
        try {
          throw new NumberFormatException();
        } catch (NumberFormatException e) {
          System.out.println("Acaba de ocurrir un error de tipo: " + e.getClass());
          System.out.println("Y nos da un mensaje: " + e.getMessage());
        }
        break;

      case 2: // IOException
        try {
          throw new IOException();
        } catch (IOException e) {
          System.out.println("Acaba de ocurrir un error de tipo: " + e.getClass());
          System.out.println("Y nos da un mensaje: " + e.getMessage());
        }
        break;

      case 3: // FileNotFoundException
        try {
          throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
          System.out.println("Acaba de ocurrir un error de tipo: " + e.getClass());
          System.out.println("Y nos da un mensaje: " + e.getMessage());
        }
        break;

      case 4: // IndexOutOfBoundsException
        try {
          throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException e) {
          System.out.println("Acaba de ocurrir un error de tipo: " + e.getClass());
          System.out.println("Y nos da un mensaje: " + e.getMessage());
        }
        break;

      case 5: // ArithmeticException
        try {
          throw new ArithmeticException();
        } catch (ArithmeticException e) {
          System.out.println("Acaba de ocurrir un error de tipo: " + e.getClass());
          System.out.println("Y nos da un mensaje: " + e.getMessage());
        }
        break;

      default:
        System.out.println("Vale esto no debería de aparecer, si sale esto es que algo va mal");
    }
  }
}
