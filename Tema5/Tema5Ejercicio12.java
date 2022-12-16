import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que muestre los n primeros términos de la serie de
*Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
*el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
*términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
*introducir por teclado.
*/

public class Tema5Ejercicio12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int cont;
    int maximo;
    int primer;
    int segun;
    int resultado;
    primer = 0;
    segun = 1;
    cont = 1;

    System.out.print("Introduce hasta que número va a terminar la sucesion de Fibonacci: ");
    maximo = s.nextInt();
    while (cont <= maximo) {
      resultado = primer + segun;
      primer = segun;
      segun = resultado;
      cont++;
      System.out.print(resultado + " ");
    }
  }
}
