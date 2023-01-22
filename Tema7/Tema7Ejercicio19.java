import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Definir un programa que sea capaz de insertar un número en una posición concreta de un array. 
*En primer lugar, el programa generará un array de 12 números enteros aleatorios entre 0 y 200 ambos incluidos. 
*A continuación se debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente el programa preguntará por el 
*número que se quiere insertar y por la posición donde será insertado. Los números del array se desplazan a la derecha para
*dejar sitio al nuevo. El último número (el que se encuentra en la posición 11) siempre se perderá.
*/

public class Tema7Ejercicio19 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int tam = 12;
    int[] num = new int[tam];
    int[] aux = new int[tam];

    System.out.println("Tabla original:");
    System.out.printf("%7s", "Indice");
    for (int cont = 0; cont < tam; cont++) {
      System.out.printf("%7s", cont);
    }
    System.out.println();
    // Generar el número aleatorio y lo guarda
    System.out.printf("%7s", "valor");
    for (int cont = 0; cont < tam; cont++) {
      num[cont] = (int) (Math.random() * 201);
      aux[cont] = num[cont];
      System.out.printf("%7s", num[cont]);
    }

    System.out.println();
    System.out.print("Introduce el indice que quieras cambiar: ");
    int indice = s.nextInt();
    System.out.print("Introduce el número para cambiarlo: ");
    int valor = s.nextInt();

    // Pasa un número a la derecha
    for (int cont = (tam - 1); cont > indice; cont--) {
      num[cont] = aux[cont - 1];
    }
    num[indice] = valor;

    // Muestra la nueva tabla
    System.out.println("Tabla modificada:");
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
