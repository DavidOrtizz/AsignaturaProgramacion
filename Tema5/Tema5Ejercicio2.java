/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que muestra los números múltiplos
*de 5 a 100 utilizando un bucle while.
*/

public class Tema5Ejercicio2 {
  public static void main(String[] args) {
    int cont;

    cont = 0;
    while (cont <= 100) {
      System.out.println(cont);
      cont = cont + 5;
    }
  }
}
