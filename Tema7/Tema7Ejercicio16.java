import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que rellene un array de 20 elementos con números enteros
*aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
*programa mostrará el array y preguntará si el usuario quiere resaltar los
*múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
*escribiendo los números que se quieren resaltar entre corchetes.
*/

public class Tema7Ejercicio16 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int tam = 20;
    int menu = 0;
    int[] num = new int[tam];

    for (int cont = 0; cont < tam; cont++) { // Genera los números aleatorios y los muestra
      num[cont] = (int) (Math.random() * 401);
      System.out.print(num[cont] + " ");
    }

    System.out.println();
    System.out.print("¿Qué números quiere resaltar? (1 - los múltiplos de 5, 2 - los múltiplos de 7): ");
    menu = s.nextInt();

    switch (menu) {
      case 1: // Multiplos de 5
        for (int cont = 0; cont < tam; cont++) {
          if (num[cont] % 5 == 0) {
            System.out.print("[" + num[cont] + "] ");
          } else {
            System.out.print(num[cont] + " ");
          }
        }
        break;

      case 2: // Multiplos de 7
        for (int cont = 0; cont < tam; cont++) {
          if (num[cont] % 7 == 0) {
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
