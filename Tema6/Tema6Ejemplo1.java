/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que muestre los 15 primeros numeros randoms
*/

public class Tema6Ejemplo1 {
  public static void main(String[] args) {
    System.out.println("Los 15 primeros numeros randoms son:");
    for (int cont = 1; cont <= 15; cont++) {
      System.out.println(Math.random());
    }
  }
}
