import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que ordene tres números enteros introducidos por teclado.
*/

public class Tema4Ejercicio13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int primer;
    int segun;
    int tercer;

    System.out.println("Voy a ordenar los tres números introducidos");
    System.out.print("Introduce el primer número: ");
    primer = s.nextInt();

    System.out.print("Introduce el segundo número: ");
    segun = s.nextInt();

    System.out.print("Introduce el tercer número: ");
    tercer = s.nextInt();

    if (primer < segun) { // Si el primero es mas pequeño que el segundo
      if (segun < tercer) { // Si el segundo es mas pequeño que el tercero
        System.out.println("El orden de mayor a menor es " + tercer + " > " + segun + " > " + primer);
      }
      if (segun > tercer) {// Si el segun es mayor que el tercero
        System.out.println("El orden de mayor a menor es " + segun + " > " + tercer + " > " + primer);
      }
    }
    if (primer > segun) { // Si el primero es mayor que el segundo
      if (primer < tercer) { // Si el primer es mas pequeño que el tercer
        System.out.println("El orden de mayor a menor es " + tercer + " > " + primer + " > " + segun);
      }
      if (primer > tercer) { // Si el primero es mayor que el tercero
        System.out.println("El orden de mayor a menor es " + primer + " > " + segun + " > " + tercer);
      }
    }
  }
}
