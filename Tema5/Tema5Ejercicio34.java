import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que pida dos números por teclado y que luego mezcle en
*dos números diferentes los dígitos pares y los impares. Se van comprobando los
*dígitos de la siguiente manera: primer dígito del primer número, primer dígito
*del segundo número, segundo dígito del primer número, segundo dígito del
*segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
*podemos suponer que el usuario introducirá dos números de la misma longitud
*y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
*int donde sea necesario para admitir números largos.
*/

public class Tema5Ejercicio34 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero1;
    int numero2;
    int par;
    int impar;
    int resto1;
    int resto2;
    int resto;
    int alrevesPar;
    int alrevesImpar;

    alrevesPar = 0;
    alrevesImpar = 0;
    resto1 = 0;
    resto2 = 0;
    par = 0;
    impar = 0;
    System.out.println("Introduce dos números para mezclar los números pares e impares");
    System.out.print("Introduce el primer número: ");
    numero1 = s.nextInt();
    System.out.print("Introduce el segundo número: ");
    numero2 = s.nextInt();

    do { // Este bucle separa los pares y losa impares
      resto1 = numero1 % 10;
      resto2 = numero2 % 10;
      if (resto1 != 0) {
        if (resto1 % 2 == 0) {
          par = par * 10 + resto1;
        } else {
          impar = impar * 10 + resto1;
        }
      }
      if (resto2 != 0) {
        if (resto2 % 2 == 0) {
          par = par * 10 + resto2;
        } else {
          impar = impar * 10 + resto2;
        }
      }
      numero1 = numero1 / 10;
      numero2 = numero2 / 10;
    } while (resto1 > 0 || resto2 > 0);

    while (par > 0) {// Le doy la vuelta el número
      resto = par % 10;
      alrevesPar = alrevesPar * 10 + resto;
      par /= 10;
    }
    while (impar > 0) {
      resto = impar % 10;
      alrevesImpar = alrevesImpar * 10 + resto;
      impar /= 10;
    }
    System.out.println("Los números pares son: " + alrevesPar);
    System.out.println("Los números impares son: " + alrevesImpar);
  }
}
