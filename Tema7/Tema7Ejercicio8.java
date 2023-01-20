import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que pida la temperatura media que ha hecho en cada mes
*de un determinado año y que muestre a continuación un diagrama de barras horizontales con esos datos. 
*Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro carácter.
*/

public class Tema7Ejercicio8 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] calor = new int[12];
    String[] mes = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre",
        "noviembre", "diciembre" };

    System.out.println("Introduce la temperatura que hay en cada mes para realizar un diagrama");
    for (int cont = 0; cont < 12; cont++) {
      System.out.print("En el mes de " + mes[cont] + " hay una temperatura de: ");
      calor[cont] = s.nextInt();
    }

    for (int cont = 0; cont < 12; cont++) {
      System.out.printf("%12s", mes[cont] + ": "); // Primero sale el mes
      for (int cont2 = 0; cont2 < calor[cont]; cont2++) { // Luego sale las barras con el máximo indicado
        System.out.print("#");
      }
      System.out.println();
    }
  }
}
