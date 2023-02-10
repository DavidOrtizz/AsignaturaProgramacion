/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que muestre por pantalla un triángulo como el del ejemplo. 
*Deberá recibir dos parámetros: el carácter que se desea imprimir y el número de líneas del triángulo.
*/

public class ConstruirPiramide {
  /*
   * Mostrar una piramide con los valores dado
   * 
   * @param altura, caracter indica como de alto va a ser y con que caracter va a
   * ser construido
   * 
   * @return la impresión de la piramide
   */
  public static void construirPiramide(int altura, String caracter) {
    int largo = 1;
    int espacio = altura - 1;
    int inicio = 1;

    while (inicio <= altura) {
      for (int cont = 1; cont <= espacio; cont++) { // Este contador se ocupa del espacio
        System.out.print(" ");
      }
      for (int cont = 1; cont <= largo; cont++) {// Este contador se ocupa de dibujar el caracter
        System.out.print(caracter);
      }
      System.out.println(""); // Esto se ocupa del salto de línea
      inicio++;
      espacio--;
      largo += 2;
    }
  }
}
