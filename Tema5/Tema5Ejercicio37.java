import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que realize un conversor del sistema 
*decimal al sistema de “palotes”
*/

public class Tema5Ejercicio37 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero;
    int resto;
    int alreves;

    resto = 0;
    alreves = 0;
    System.out.print("Introduce un numero para combertirlo en el sistema de palotes: ");
    numero = s.nextInt();

    while (numero > 0) {// Primero le doy la vuelta el número
      resto = numero % 10;
      alreves = alreves * 10 + resto;
      numero /= 10;
    }

    while (alreves != 0) {
      resto = alreves % 10;
      if (resto != 0) { // Comprueba el numero
        for (int cont = 1; cont <= resto; cont++) { // Saber cuantos | tiene que colocar
          System.out.print("| ");
        }
      }
      alreves = alreves / 10;
      if (alreves != 0) { // Para que al final no coloque una -
        System.out.print("- ");
      }
    }
  }
}
