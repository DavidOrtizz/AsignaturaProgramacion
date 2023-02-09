/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Funciones matemáticas
*/

public class Multiplicacion {

  /*
   * Multiplicacion de dos numeros y que muestre el resultado
   * 
   * @param a y b son los números que van a ser multiplicados
   * 
   * @return solucion el resultado de la multiplicación
   */
  public static double multiplica(double a, double b) {
    double solucion = 0;
    solucion = a * b;
    System.out.println("El resultado de la multiplicación es: " + solucion);
    return solucion;
  }
}
