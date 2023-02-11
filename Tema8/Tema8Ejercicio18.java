import java.util.Scanner;
import misFunciones.SaberDNI;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa  en el que el NIF (o letra asociada a un DNI) se obtiene de la siguiente manera: 
*Se divide el número de DNI entre 23 y el resto es codificado por una letra según la siguiente equivalencia:
* 0: "T", 1: "R", 2: "W", 3: "A", 4: "G", 5: "M", 6: "Y", 7: "F", 8: "P", 9: "D",10:"X", 11: "B", 12: "N",
* 13: "J", 14: "Z", 15: "S", 16: "Q", 17: "V", 18: "H", 19: "L", 20: "C", 21: "K", 22: "E".
*Escribe un programa que pida el DNI y muestre por pantalla la letra asociada. 
*Para ello se deberá crear una función a la que se le pase el número y devuelva la letra.
*/

public class Tema8Ejercicio18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int dni;
    String letra = "";

    System.out.print("Introduce tu número de DNI para saber la letra: ");
    dni = s.nextInt();

    letra = SaberDNI.saberDNI(dni);

    if (letra == "") {
      System.out.println("No has introducido un número de DNI correcto");
    } else {
      System.out.println("La letra de tu DNI es: " + letra);
      System.out.println(dni + letra);
    }
  }
}
