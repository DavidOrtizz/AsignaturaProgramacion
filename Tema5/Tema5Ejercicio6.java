/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que muestra los números 
*del 320 al 160, contando de 20 en 20 utilizando un bucle do-while.
*/

public class Tema5Ejercicio6 {
  public static void main(String[] args) {
    int cont;

    cont = 160;
    do {
      System.out.println(cont);
      cont = cont + 20;
    } while (cont <= 320);
  }
}
