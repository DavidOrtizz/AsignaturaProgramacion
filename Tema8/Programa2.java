/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Array de una dimensión
*/

public class Programa2 {
  /*
   * Generar un array de numeros aleatorios y de tamaño n
   * 
   * @param tam tamaño del array
   * 
   * @return num el contenido del array
   */
  public static int[] generaArrayInt(int num[], int min, int max) {
    for (int i = 0; i < num.length; i++) {
      num[i] = (int) (Math.random() * (max + 1) + min);
      System.out.print(num[i] + " ");
    }
    System.out.println();
    return num;
  }

  /*
   * Muestra el número mínimo del array
   * 
   * @param num[] el contenido del array
   * 
   * @return minimo el número mínimo del array
   */
  public static int minimoArrayInt(int num[]) {
    int minimo = Integer.MAX_VALUE;
    for (int i = 0; i < num.length; i++) {
      if (num[i] < minimo) {
        minimo = num[i];
      }
    }
    return minimo;
  }

  /*
   * Muestra el número maximo
   * 
   * @param num[] el contenido del array
   * 
   * @return maximo el número máximo del array
   */
  public static int maximoArrayInt(int num[]) {
    int maximo = Integer.MIN_VALUE;
    for (int i = 0; i < num.length; i++) {
      if (num[i] > maximo) {
        maximo = num[i];
      }
    }
    return maximo;
  }

  /*
   * Devuelve la media del array
   * 
   * @param num[], tam el contenido del array y el tamaño total del array
   * 
   * @return media devuelve la media del array
   */
  public static int mediaArrayInt(int num[], int tam) {
    int total = 0;
    int media = 0;
    for (int i = 0; i < num.length; i++) {
      total += num[i];
    }
    media = total / tam;
    return media;
  }

  /*
   * Busca si el número que pides está en el array
   * 
   * @param num[], buscar el contenido del array y el número que buscas
   * 
   * @return true si está o false si no está
   */
  public static boolean estaEnArray(int num[], int buscar) {
    for (int i = 0; i < num.length; i++) {
      if (num[i] == buscar) {
        return true;
      }
    }
    return false;
  }

  /*
   * Busca un número en el array y dice la posición en la que se encuentra
   * 
   * @param num[], buscar el contenido del array y el número que se busca
   * 
   * @return la posición donde se encuentra y si no se encuentra que no muestre
   * nada
   */
  public static int posicionEnArray(int num[], int buscar) {
    int conseguido = 0;
    for (int i = 0; i < num.length; i++) {
      if (num[i] == buscar) {
        conseguido = i;
      }
    }
    return conseguido;
  }

  /*
   * Voltear el array
   * 
   * @param num[] el contenido del array
   * 
   * @return volteada array dada la vuelta
   */
  public static int[] volteaArrayInt(int num[], int volteada[]) {
    int cont = 0;
    for (int i = num.length - 1; i >= 0; i--) {
      volteada[cont] = num[i];
      System.out.print(volteada[cont] + " ");
      cont++;
    }
    return volteada;
  }

  public static void main(String[] args) {
    int tam = 5;
    int minAleatorio = 0;
    int maxAleatorio = 10;
    int[] num = new int[tam];
    int buscar = 8;
    int[] volteada = new int[tam];

    System.out.print("El array generado es: ");
    generaArrayInt(num, minAleatorio, maxAleatorio);
    System.out.println("El número mínimo es " + minimoArrayInt(num));
    System.out.println("El número máximo es " + maximoArrayInt(num));
    System.out.println("La media del array es " + mediaArrayInt(num, tam));
    if (estaEnArray(num, buscar) == true) {
      System.out.println("El número que buscas está en el array");
      System.out.println("El número se encuentra en la posición " + posicionEnArray(num, buscar));
    } else {
      System.out.println("El número que buscas no está en el array");
    }
    System.out.print("El array dandole la vuelta: ");
    volteaArrayInt(num, volteada);
  }
}
