import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que pida un número por teclado y que luego muestre ese
*número al revés.
*/

public class Tema5Ejercicio25 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero;
    int alreves;
    int resto;

    resto = 0;
    alreves = 0;

    System.out.print("Introduce un número para mostrarlo al revés: ");
    numero = s.nextInt();

    while (numero > 0) {
      resto = numero % 10; // Aqui sacamos el resto del número
      alreves = alreves * 10 + resto; // Aqui el resto se coloca en primera posición
      numero /= 10;
    }
    System.out.println("Tu número al revés es: " + alreves);
  }
}
