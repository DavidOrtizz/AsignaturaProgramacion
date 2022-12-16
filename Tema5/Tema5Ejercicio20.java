import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que es igual que el ejercicio 
*anterior pero esta vez se debe pintar una pirámide hueca.
*/

public class Tema5Ejercicio20 {
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
        if (inicio == altura) { // Base de la piramide
          System.out.print(caracter); // Este se ocupa de pintar la base de la pirámide sin hueco en medio
        } else if (cont == 1 || cont == largo) { // Este se ocupa de dibujarle espacio en el interior
          System.out.print(caracter);
        } else { // Este se ocupa de los espacios de fuera
          System.out.print(" ");
        }
      }
      System.out.println(""); // Esto se ocupa del salto de línea
      inicio++;
      espacio--;
      largo += 2;
    }
  }
}
