import misFunciones.Programa1;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Muestra los números capicúa que hay entre 1 y 99999.
*/

public class Tema8Ejercicio16PDF {
  public static void main(String[] args) {
    long tam = 99999;
    System.out.print("Los números capicúa comprendidos entre 1 y 99999 son: ");
    for (int i = 1; i <= tam; i++) {
      if (Programa1.esCapicua(i) == true) {
        System.out.print(i + " ");
      }
    }
  }
}
