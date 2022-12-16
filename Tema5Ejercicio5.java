/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que muestra los números 
*del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while.
*/

public class Tema5Ejercicio5 {
  public static void main(String[] args) {
    int cont;

    cont = 320;
    while (cont >= 160) {
      System.out.println(cont);
      cont = cont - 20;
    }
  }
}
