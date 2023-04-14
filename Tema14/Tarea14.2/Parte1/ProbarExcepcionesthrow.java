import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.annotation.processing.FilerException;

/**
 * Haz un menú con 5 opciones. Cada una de las opciones debe usar una de las 5
 * funciones:
 * - 1: Provoca un error "StackOverFlowError"
 * - 2: Provoca una excepción "NumberFormatException"
 * - 3: Provoca una excepción "ArrayIndexOutOfBoundsException"
 * - 4: Provoca una excepción "FileNotFoundException"
 * - 5: Provoca una excepción "ArithmeticException"
 *
 * Haz un bloque try-catch múltiple en el main, de forma que sea en el main
 * donde se capture la excepción, y no en la función.
 * Esto significa que cada función debe incluir un "thows" con el tipo de
 * excepción. Esto se explica en la página 316 del libro.
 * El error no se puede tratar, pero hay que hacer un catch -en el main- por
 * cada una de las 4 posibles excepciones, mostrando la clase y el mensaje de la
 * excepción.
 * 
 * @author David Ortiz Corchero
 * 
 * @curso: 1ºDAM Tarde
 */
public class ProbarExcepcionesthrow {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String opcion;
    int menu = 0;

    do {
      System.out.println("Escoge que error quiere que ocurra");
      System.out.println("---------------------------------------");
      System.out.println("1: Provocar un error 'StackOverFlowError'");
      System.out.println("2: Provocar una excepción 'NumberFormatException'");
      System.out.println("3: Provocar una excepción 'ArrayIndexOutOfBoundsException'");
      System.out.println("4: Provocar una excepción 'FileNotFoundException'");
      System.out.println("5: Provocar una excepción 'ArithmeticException'");
      System.out.println("6: Salir del menu");
      System.out.println("---------------------------------------");
      System.out.print("Selecciona: ");
      opcion = s.nextLine();
      try {
        menu = Integer.parseInt(opcion);
      } catch (Exception e) {
        System.out.println("¿Por qué pones una letra? Nope aquí solo números, venga ponlo bien :D");
      }

      switch (menu) {
        case 1: // Error StackOverFlowError
          try {
            throw new StackOverflowError();
          } catch (StackOverflowError e) {
            System.out.println("Acaba de ocurrir un error de tipo: " + e.getClass());
            System.out.println("Y nos da un mensaje: " + e.getMessage());
          }
          break;

        case 2: // Excepción NumberFormatException
          try {
            throw new NumberFormatException();
          } catch (NumberFormatException e) {
            System.out.println("Acaba de ocurrir un error de tipo: " + e.getClass());
            System.out.println("Y nos da un mensaje: " + e.getMessage());
          }
          break;

        case 3: // Excepción ArrayIndexOutOfBoundsException
          try {
            throw new ArrayIndexOutOfBoundsException();
          } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Acaba de ocurrir un error de tipo: " + e.getClass());
            System.out.println("Y nos da un mensaje: " + e.getMessage());
          }
          break;

        case 4: // Excepción FileNotFoundException
          try {
            throw new FileNotFoundException();
          } catch (FileNotFoundException e) {
            System.out.println("Acaba de ocurrir un error de tipo: " + e.getClass());
            System.out.println("Y nos da un mensaje: " + e.getMessage());
          }
          break;

        case 5: // Excepción ArithmeticException
          try {
            throw new ArithmeticException();
          } catch (ArithmeticException e) {
            System.out.println("Acaba de ocurrir un error de tipo: " + e.getClass());
            System.out.println("Y nos da un mensaje: " + e.getMessage());
          }
          break;

        default:
          System.out.println("No has seleccionado ningun número del menú");
      }
      System.out.println(); // Salto de linea
    } while (menu != 6);
  }
}
