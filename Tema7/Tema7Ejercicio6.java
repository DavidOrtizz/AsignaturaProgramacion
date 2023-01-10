import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que lea 15 números por teclado y que los almacene en un array. 
*Rota los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1, el de la 1 a la 2, etc. 
*El número que se encuentra en la última posición debe pasar a la posición 0. Finalmente, muestra el contenido del array.
*/

public class Tema7Ejercicio6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] numero = new int[15];
    int[] numero2 = new int[15];

    System.out.print("Introduce 15 números para guardarlo en el array ");
    System.out.println("y voy a hacer que pase a la posicion siguiente");
    for (int cont = 0; cont < 15; cont++) {
      System.out.print("Introduce el número de la posición " + (cont) + " : ");
      numero[cont] = s.nextInt();
      if (cont == 14) {
        numero2[0] = numero[cont];
      } else {
        numero2[cont + 1] = numero[cont];
      }
    }
    for (int cont = 0; cont < 15; cont++) {
      System.out.println("En la posición " + cont + " se encuentra guardado el número: " + numero2[cont]);
    }
  }
}
