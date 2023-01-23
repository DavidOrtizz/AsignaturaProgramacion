import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que sea el juego de las tres en raya
*/

public class Tema7Ejercicio10Bi {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num;
    String ficha = "";
    int tamfila = 4;
    int tamcolumnas = 4;
    int[][] posicion = new int[tamcolumnas][tamfila];

    System.out.println("Vamos a jugar al tres en raya");
    System.out.print("¿Que ficha quieres? O | X :"); // Cogemos la ficha del jugador
    ficha = s.next();
    ficha.toUpperCase();

    switch (ficha) { // Selección del la dicha del jugador y la máquina
      case "O":
      case "0":

        break;

      case "X":

        break;

    }
  }
}
