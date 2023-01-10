/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que pinte por pantalla diez líneas formadas por caracteres.
*El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes: *, -, =, ., |, @. 
*Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.
*/

public class Tema6Ejercicio10 {
  public static void main(String[] args) {
    int linea = 0;
    int letra;
    String simbolo = "";

    for (int cont = 1; cont <= 10; cont++) { // Las 10 lineas
      linea = (int) (Math.random() * 40 + 1); // Longitud entre 1 y 40

      for (int cont2 = 1; cont2 <= linea; cont2++) {
        letra = (int) (Math.random() * 6 + 1); // Aleatoriedad de letra
        switch (letra) {
          case 1:
            simbolo = "*";
            break;

          case 2:
            simbolo = "-";
            break;

          case 3:
            simbolo = "=";
            break;

          case 4:
            simbolo = ".";
            break;

          case 5:
            simbolo = "|";
            break;

          case 6:
            simbolo = "@";
            break;

          default:
            System.out.println("Letra no asignada");
        }
        System.out.print(simbolo);// Imprimir el simbolo
      }
      System.out.println();// Salto de linea
    }
  }
}
