/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que defina un array de 10 caracteres con nombre simbolo y asigna valores a los
*elementos según la tabla que se muestra. Muestra el contenido de todos los elementos del array. 
*¿Qué sucede con los valores de los elementos que no han sido inicializados?
*/

public class Tema7Ejercicio2 {
  public static void main(String[] args) {
    char[] letra = new char[10];
    letra[0] = 'a';
    letra[1] = 'x';
    letra[4] = '@';
    letra[6] = ' ';
    letra[7] = '+';
    letra[8] = 'Q';

    for (int cont = 0; cont <= 9; cont++) {
      System.out.println("En la posición " + cont + " se encuentra el caracter: " + letra[cont]);
    }
  }
}
