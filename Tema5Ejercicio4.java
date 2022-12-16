/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que muestre los números 
*del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle for.
*/

public class Tema5Ejercicio4 {
  public static void main(String[] args) {
    for (int cont = 320; cont >= 160; cont = cont - 20) {
      System.out.println(cont);
    }
  }
}
