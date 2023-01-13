import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos 
*entre 0 y 500 (ambos incluidos). A continuación el programa mostrará el array y preguntará si el usuario quiere destacar el
*máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo el número destacado entre dobles asteriscos.
*/

public class Tema7Ejercicio13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int tam = 100;
    int[] num = new int[tam];
    int min = 0;
    int max = 0;
    int menu;

    for (int cont = 0; cont < tam; cont++) { // Genera los números aleatorios y los muestra
      num[cont] = (int) (Math.random() * 501);
      System.out.print(num[cont] + " ");
      if (cont == 0) { // Igualamos el número para la primera vez
        min = num[cont];
        max = num[cont];
      }
      if (num[cont] < min) {
        min = num[cont];
      }
      if (num[cont] > max) {
        max = num[cont];
      }
    }

    System.out.println(); // Salto de linea
    System.out.print("¿Qué números quiere resaltar? (1 - El mínimo , 2 - El máximo): ");
    menu = s.nextInt();

    switch (menu) {
      case 1: // El mínimo
        for (int cont = 0; cont < tam; cont++) {
          if (num[cont] == min) {
            System.out.print("[" + num[cont] + "] ");
          } else {
            System.out.print(num[cont] + " ");
          }
        }
        break;

      case 2: // El máximo
        for (int cont = 0; cont < tam; cont++) {
          if (num[cont] == max) {
            System.out.print("[" + num[cont] + "] ");
          } else {
            System.out.print(num[cont] + " ");
          }
        }
        break;

      default:
        System.out.println("No has introducido el número correcto");
    }
  }
}
