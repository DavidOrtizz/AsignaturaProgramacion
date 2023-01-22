/*Este programa está hecho por: David Ortiz Corchero (Corregido por Pablo)
*Curso: 1ºDAM Tarde
*Descripción del programa: Definir un programa  que rellene un array de 15 elementos con números enteros
*comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el array “cincuerizado”, según el siguiente criterio: 
*si el número que hay en una posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el
*siguiente múltiplo de 5 que exista a partir de él.
*/

public class Tema7Ejercicio21 {
  public static void main(String[] args) {
    int tam = 15;
    int[] num = new int[tam];
    int digito = 0;

    System.out.println("Array original:"); // Crea el arry con num aleatorios
    for (int cont = 0; cont < tam; cont++) {
      num[cont] = (int) (Math.random() * 501);
      System.out.print(num[cont] + " ");
    }

    System.out.println();
    System.out.println("Array cincuerizando:");
    for (int cont = 0; cont < tam; cont++) {
      if (num[cont] % 5 != 0) { // Cumprueba que el numero es divisible por 5
        digito = num[cont] % 10; // Saco el ultimo dígito
        if (digito != 5 && digito != 0) { // Si no es ni 5 ni 0
          num[cont] += 1; // Se le suma 1
          cont--;// Repetimos el número
        }
      } else {
        System.out.print(num[cont] + " ");
      }
    }
  }
}
