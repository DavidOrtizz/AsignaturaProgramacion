/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que muestre la tirada de tres dados. Se debe mostrar
*también la suma total (los puntos que suman entre los tres dados).
*/

public class Ejercicio1 {
  public statTema7Ejercicio1in(String[] args) {
    int suma;
    int numero;

    suma = 0;
    System.out.println("Vas a hacer una tirada de un dado tres veces");
    System.out.print("Has sacado un: ");

    for (int cont = 1; cont <= 3; cont++) {
      numero = ((int) (Math.random() * 6) + 1);
      suma += numero; // La suma de los puntos
      System.out.print(numero + " "); // Te muestra los numeros que has sacado
    }
    System.out.println();
    System.out.println("Tus puntos totales son " + suma); // Muestra del total de los puntos
  }
}
