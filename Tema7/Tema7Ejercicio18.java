/*Este programa está hecho por: David Ortiz Corchero (Corregido por Pablo)
*Curso: 1ºDAM Tarde
*Descripción del programa: Definir un programa que genere 10 números enteros aleatorios entre 0 y 200
*ambos incluidos y que los almacene en un array. A continuación, el programa debe mostrar el contenido 
*de ese array junto al índice (0 – 9). Seguidamente el programa debe colocar de forma alterna y en orden 
*los menores o iguales de 100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
*mayor… Cuando se acaben los menores o los mayores, se completará con los números que queden.
*/

public class Tema7Ejercicio18 {
  public static void main(String[] args) {
    final int tam = 10;
    int[] num = new int[tam];

    System.out.println("Array original");
    System.out.printf("%7s", "Indice");
    for (int cont = 0; cont < tam; cont++) {
      System.out.printf("%7s", cont);
    }
    System.out.println();
    System.out.printf("%7s", "valor");
    for (int cont = 0; cont < tam; cont++) {
      num[cont] = (int) (Math.random() * 201);
      System.out.printf("%7s", num[cont]);
    }

    int aux;
    int p = 0;

    for (int cont = 0; cont < tam; cont++) {
      if (num[cont] <= 100 && p < tam) {
        aux = num[cont];
        num[p] = num[cont];
        num[cont] = aux;
        p += 2;
      }
    }

    System.out.println();
    System.out.println("Array resultado");
    System.out.printf("%7s", "Indice");
    for (int cont = 0; cont < tam; cont++) {
      System.out.printf("%7s", cont);
    }
    System.out.println();
    System.out.printf("%7s", "valor");
    for (int cont = 0; cont < tam; cont++) {
      System.out.printf("%7s", num[cont]);
    }
  }
}
