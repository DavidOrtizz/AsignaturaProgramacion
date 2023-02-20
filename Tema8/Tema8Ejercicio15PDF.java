import misFunciones.Programa1;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Muestra los números primos que hay entre 1 y 1000.
*/

public class Tema8Ejercicio15PDF {
  public static void main(String[] args) {
    int tam = 1000;
    System.out.print("Los números primos comprendidos entre 1 y 1000 son: ");
    for (int i = 1; i <= 1000; i++) {
      if (Programa1.esPrimo(i) == true) {
        System.out.print(i + " ");
      }
    }
  }
}
