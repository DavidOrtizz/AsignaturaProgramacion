/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que calcule y muestre por pantalla 
*la suma y el producto de los 10 primeros números naturales.
*/

public class Tema5Ejercicio3Moodle {
  public static void main(String[] args) {
    int suma;
    int producto;
    for (int i = 1; i <= 10; i++) { // i es el contador
      suma = i + i;
      producto = i * i;
      System.out.println(i + " + " + i + " = " + suma);
      System.out.println(i + " * " + i + " = " + producto);
    }
  }
}
