import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que registre los sueldos de hombres y mujeres de una empresa para detectar si existe
*brecha salarial entre ambos.
*/

public class Tema7EjercicioC_05 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int tamColumnas;
    int tamFilas = 2;
    int cantidadH = 0;
    int cantidadM = 0;
    int totalH = 0;
    int totalM = 0;
    int mediaH = 0;
    int mediaM = 0;

    System.out.print("Introduce la cantidad de personas que hay en la empresa: ");
    tamColumnas = s.nextInt(); // Añadimos como queremos se sea de grande las columnas

    int[][] empresa = new int[tamFilas][tamColumnas];

    System.out.print("Si es hombre es 1 y si es mujer es 2, ");
    System.out.println("abajo saldran cuanto ganan cada uno.");
    for (int x = 0; x < tamFilas; x++) {
      for (int y = 0; y < tamColumnas; y++) {
        empresa[0][y] = (int) (Math.random() * 2 + 1);
        empresa[1][y] = (int) (Math.random() * 10000 + 20000);
      }
    }

    System.out.println("El sueldo medio es de: ");
    // Muestra la tabla como ha quedado
    for (int x = 0; x < tamFilas; x++) {
      for (int y = 0; y < tamColumnas; y++) {
        System.out.printf("%7s", empresa[x][y]);
        // Guardamos los datos de hombre y mujeres
        if (empresa[0][y] == 1) {
          cantidadH++;
          totalH += empresa[1][y];
          mediaH = totalH / cantidadH;
        }
        if (empresa[0][y] == 2) {
          cantidadM++;
          totalM += empresa[1][y];
          mediaM = totalM / cantidadM;
        }
      }
      System.out.println();
    }
    // Se muestra la media de los dos
    System.out.println("El sueldo medio del hombre es de " + mediaH);
    System.out.println("El sueldo medio de la mujer es de " + mediaM);
    // Se comprueba si hay brecha salarial
    if (mediaH > mediaM) {
      System.out.println("Las mujeres ganan menos que los hombres");
    } else {
      System.out.println("Los hombres ganan menos que las mujeres");
    }
  }
}
