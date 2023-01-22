import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Definir un programa que calcule la denominación ordinal de los reyes de una secuencia histórica.
*El programa solicitará la cantidad de reyes que se van a introducir, y a continuación recibirá los nombres de los reyes. Presentará
*por pantalla dichos nombres, pero colocándoles el ordinal correspondiente. Así, por ejemplo, si hay dos Felipes en los nombres de 
*los reyes, el primero debería aparecer como Felipe 1º y el segundo como Felipe 2º.
*/

public class Tema7Ejercicio20 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int tam;

    System.out.print("Introduzca la cantidad de reyes que se van a poner: ");
    tam = Integer.parseInt(s.nextLine());
    String[] nombre = new String[tam];

    for (int cont = 0; cont < tam; cont++) {
      System.out.print("Vaya introduciendo los nombres de los reyes: ");
      nombre[cont] = s.next();
    }
    for (int cont = 0; cont < tam; cont++) {
      int num = 1;
      for (int i = 0; i < cont; i++) {
        if (nombre[cont].equals(nombre[i])) {
          num++;
        }
      }
      System.out.println(nombre[cont] + " " + num + "º");
    }
  }
}
