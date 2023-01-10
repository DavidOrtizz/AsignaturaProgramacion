/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que vaya generando números aleatorios pares entre 0
*y 100 y que no termine de generar números hasta que no saque el 24. 
*El programa deberá decir al final cuántos números se han generado.
*/

public class Tema6Ejercicio9 {
  public static void main(String[] args) {
    int numero = 0;
    int contador = 0;
    do { // Repetira numeros hasta que salga el 24
      numero = (int) (Math.random() * 101);
      System.out.print(numero + " ");
      contador++;
    } while (numero != 24);
    System.out.println();
    if (contador == 1) {
      System.out.println("¡Te salió en el primer intento!"); // Si el número 24 sale en el primer número
    } else {
      System.out.println("El total de números salidos hasta que ha dado el 24 es de: " + contador + " números.");
    }
  }
}
