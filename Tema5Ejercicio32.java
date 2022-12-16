import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que, dado un número entero positivo, diga cuáles son y
*cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
*izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir números largos.
*/

public class Tema5Ejercicio32 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    long numero;
    long resto;
    long alreves;
    long par;

    numero = 0;
    resto = 0;
    alreves = 0;
    par = 0;

    System.out.print("Introduzca un número entero positivo: ");
    numero = s.nextLong();

    System.out.print("Los números pares son: ");
    while (numero > 0) {// Primero le doy la vuelta el número para que me haga en orden los número pares
      resto = numero % 10;
      alreves = alreves * 10 + resto;
      numero /= 10;
    }
    while (alreves > 0) { // Aqui buscamos cuales son numeros pares
      resto = alreves % 10;
      if (resto % 2 == 0) {
        System.out.print(resto + " ");
        par += resto;
      }
      alreves /= 10;
    }
    System.out.println("");
    System.out.println("La suma de todos los numeros pares es de " + par);
  }
}
