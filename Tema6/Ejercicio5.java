/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
*separados por espacios. Muestra también el máximo, el mínimo y la media
*de esos números.
*/

public class Ejercicio5 {
  public static void main(String[] args) {
    int max = 0;
    int min = 0;
    int total = 0;
    int media;
    int numero;

    for (int cont = 1; cont <= 50; cont++) {
      numero = 100 + (int) (Math.random() * 100);
      if (cont == 1) { // Coge el primer numero para que sea su referencia del numero mas pequeño.
        min = numero;
      }
      if (numero > max) { // Comprueba el numero por si es mas mayor.
        max = numero;
      }
      if (numero < min) { // Comprueba el numero por si es mas menor.
        min = numero;
      }
      total += numero; // Suma total de los números.

      System.out.print(numero + " ");

      if (cont == 50) { // Este if sirve para que sea la ultima información.
        System.out.println();
        System.out.println("El número máximo es: " + max);
        System.out.println("El número minimo es: " + min);
        media = total / 50;
        System.out.println("La media de todos los números es: " + media);
      }
    }
  }
}
