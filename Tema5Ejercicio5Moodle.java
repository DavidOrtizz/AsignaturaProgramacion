import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que calcule y muestre por 
*pantalla de valor de A elevado a B (sin usar el operador potencia ni método de Math).
*Serán leidos por pantalla los números A y B.  
*/

public class Tema5Ejercicio5Moodle {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a;
    int b;
    int total;
    total = 1;

    System.out.print("Introduce el valor de A: ");
    a = s.nextInt();
    System.out.print("Introduce el valor de B: ");
    b = s.nextInt();

    for (int i = 1; i <= b; i++) { // i es el contador
      total = a * total;
      System.out.println(a + "^" + i + " = " + total);
    }
  }
}
