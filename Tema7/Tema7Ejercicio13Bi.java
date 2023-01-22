/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que calcule la estatura media, mínima y máxima en centímetros de personas de diferentes países. 
*El array que contiene los nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”, “Australia”}. 
*Los datos sobre las estaturas se deben simular mediante un array de 4 filas por 10 columnas con números aleatorios generados al azar entre
*140 y 210. Los decimales de la media se pueden despreciar. Los nombres de los países se deben mostrar utilizando 
*el array de países (no se pueden escribir directamente).
*/

public class Tema7Ejercicio13Bi {
  public static void main(String[] args) {
    int tamPais = 4; // Cantidad de paises
    int tamfila = 4;
    int tamcolumna = 10;
    int total = 0;
    int media = 0;
    int max = 0;
    int min = 0;
    int[][] estatura = new int[tamfila][tamcolumna];
    String[] pais = { "España", "Rusia", "Japón", "Australia" };

    System.out.printf("%57s %7s %7s", "Med", "Min", "Max");
    System.out.println();
    for (int x = 0; x < tamfila; x++) {
      if (x < tamPais) {
        System.out.printf("%10s", pais[x]); // Muestra el pais que le toca sin superar el array
      }
      for (int y = 0; y < tamcolumna; y++) { // Genera los números y los guarda
        estatura[x][y] = (int) (Math.random() * 71 + 140);
        System.out.printf("%4s", estatura[x][y]); // Muestra los números
        // Minimos y máximos
        if (y == 0) {
          min = estatura[x][y];
          max = estatura[x][y];
        }
        if (estatura[x][y] > max) {
          max = estatura[x][y];
        }
        if (estatura[x][y] < min) {
          min = estatura[x][y];
        }
      }
      System.out.print(" | "); // Separación de los numeros generados de los calculos
      for (int cont = 0; cont < tamfila; cont++) { // Hacer los calculos
        for (int cont2 = 0; cont2 < tamcolumna; cont2++) {
          total += estatura[cont][cont2];
          media = total / tamfila;
        }
      }
      System.out.printf("%4s %7s %7s", media, min, max);
      System.out.println(); // Salto de línea
    }
  }
}
