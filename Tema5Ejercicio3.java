/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que muestra los números múltiplos 
*de 5 de 0 a 100 utilizando un bucle do-while.
*/

public class Tema5Ejercicio3 {
  public static void main(String[] args) {
    int cont;

    cont = 0;
    do {
      System.out.println(cont);
      cont = cont + 5;
    } while (cont <= 100);
  }
}
