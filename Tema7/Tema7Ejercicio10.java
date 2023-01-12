/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
*y que los almacene en un array. El programa debe ser capaz de pasar todos
*los números pares a las primeras posiciones del array (del 0 en adelante) y
*todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es necesario.
*/

public class Tema7Ejercicio10 {
  public static void main(String[] args) {
    int tam = 20; //Tamaño del array
    int[] numero = new int[tam];
    int[] copia = new int[tam];

    for (int cont = 0; cont < 20; cont++) { // Genera los 20 números aleatorios
      numero[cont] = (int) (Math.random() * 101);
      copia[cont] = numero[cont];
    }

    for(int cont=0; cont<20;cont++){
      if(){
        
      }
    }
  }
}
