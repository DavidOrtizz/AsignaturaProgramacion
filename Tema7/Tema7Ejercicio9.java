import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que pida 8 números enteros y que luego muestre esos
*números junto con la palabra “par” o “impar” según proceda.
*/

public class Tema7Ejercicio9 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] numero = new int[8];

    System.out.println("Introduce 8 numeros y te diré si son par o impar");
    for (int cont = 0; cont < 8; cont++) {
      System.out.print("Introduce en el espacio " + (cont + 1) + " el número: ");
      numero[cont] = s.nextInt();
    }
    for (int cont = 0; cont < 8; cont++) {
      if (numero[cont] % 2 == 0) {
        System.out.println(numero[cont] + " es par");
      } else {
        System.out.println(numero[cont] + " es impar");
      }
    }
  }
}
