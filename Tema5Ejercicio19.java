import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que pinte una pirámide por pantalla. La altura se debe
*pedir por teclado. El carácter con el que se pinta la pirámide también se debe pedir por teclado.
*/

public class Tema5Ejercicio19 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int altura;
    int largo;
    int espacio;
    String caracter;
    int inicio;

    System.out.print("Intoduce la altura de la pirámide: ");
    altura = s.nextInt();

    System.out.print("Introduce el caracter con el que se va a construir la pirámide: ");
    caracter = s.next();

    inicio = 1;
    largo = 1;
    espacio = altura - 1;
    while (inicio <= altura) {
      for (int cont = 1; cont <= espacio; cont++) { // Este contador se ocupa del espacio
        System.out.print(" ");
      }
      for (int cont = 1; cont <= largo; cont++) {// Este contador se ocupa de dibujar el caracter
        System.out.print(caracter);
      }
      System.out.println(""); // Esto se ocupa del salto de línea
      inicio++;
      espacio--;
      largo += 2;
    }
  }
}
