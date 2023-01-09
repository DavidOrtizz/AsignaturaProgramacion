/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que defina tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
*y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben almacenar los cuadrados de los valores 
*que hay en el array numero. En el array cubo se deben almacenar los cubos de los valores que hay en numero. 
*A continuación, muestra el contenido de los tres arrays dispuesto en tres columnas.
*/

public class Tema7Ejercicio4 {
  public static void main(String[] args) {
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];

    for (int cont = 0; cont <= 19; cont++) { // Genera y guarda los números aleatorios
      numero[cont] = (int) (Math.random() * 101);
    }
    for (int cont = 0; cont <= 19; cont++) { // Dandole valor al cuadrado
      cuadrado[cont] = numero[cont] * numero[cont];
    }
    for (int cont = 0; cont <= 19; cont++) {// Dandole valor al cubo
      cubo[cont] = cuadrado[cont] * numero[cont];
    }
    for (int cont = 0; cont <= 19; cont++) {
      System.out.println("| " + numero[cont] + " | " + cuadrado[cont] + " | " + cubo[cont]);
    }
  }
}
