import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que diga si un número entero positivo introducido por
*teclado es capicúa. Se permiten números de hasta 5 cifras.
*/

public class Tema4Ejercicio20 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero;
    boolean capicua;
    capicua = false;

    System.out.print("Introduce un número de máximo 5 cifras para decir si el numero es capicúa: ");
    numero = s.nextInt();

    if (numero < 10) { // Número de una cifra
      capicua = true; // Como al tener una sola cifra se lee igual por los dos lados es positivo
    }
    if (numero >= 10 && numero < 100) { // Número de dos cifras
      if ((numero / 10) == (numero % 10)) { // 22 --> numero/10 = 2 == numero%10 = 2
        capicua = true;
      }
    }
    if (numero >= 100 && numero < 1000) { // Número de tres cifras
      if ((numero / 100) == (numero % 10)) { // 121 --> numero/100 = 1 == numero%10 = 1
        capicua = true;
      }
    }
    if (numero >= 1000 && numero < 10000) { // Número de cuatro cifras
      if ((numero / 1000) == (numero % 10) && (numero / 100) == (numero % 10)) {
        capicua = true;
      }
    }
    if (numero >= 10000) { // Número de cinco cifras
      if ((numero / 10000) == (numero % 10) && (numero / 1000) == (numero % 10) && (numero / 100) == (numero % 10)) {
        capicua = true;
      }
    }
    if (capicua == true) {
      System.out.println("El número " + numero + " es capicúa");
    }
    if (capicua == false) {
      System.out.println("El número " + numero + " no es capicúa");
    }
  }
}
