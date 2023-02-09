/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Funciones matemáticas
*/

public class Rectangulo {
  /*
   * Hacer el perimetro de un rectangulo
   * 
   * @param ancho, alto son las medidas del rectangulo
   * 
   * @return perimetro la solución
   */
  public static double perimetroRectangulo(double ancho, double alto) {
    double perimetro;
    perimetro = 2 * (ancho + alto);
    return perimetro;
  }

  /*
   * Hacer el área de un rectangulo
   * 
   * @param ancho, alto son las medidas del rectangulo
   * 
   * @return area la solución
   */
  public static double areaRectangulo(double ancho, double alto) {
    double area;
    area = ancho * alto;
    return area;
  }
}
