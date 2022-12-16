/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que calcule y muestre por pantalla,
*independientemente la suma de los números pares y la suma de impares de los números
*comprendidos entre 100 y 200.
*/

public class Tema5Ejercicio4Moodle {
  public static void main(String[] args) {
    int par;
    int impar;

    par = 0;
    impar = 0;
    for (int i = 102; i <= 200; i = i + 2) { // i es el contador de los números pares
      par = i + par;
      System.out.println("La suma del número par es " + par);
    }
    for (int f = 101; f <= 200; f = f + 2) { // f es el contador de los números impares
      impar = f + impar;
      System.out.println("La suma del número impar es " + impar);
    }
  }
}
