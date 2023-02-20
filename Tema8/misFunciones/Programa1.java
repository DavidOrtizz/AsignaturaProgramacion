/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Funciones matemáticas
*/

public class Programa1 {
  /*
   * Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso
   * en caso contrario.
   * 
   * @param num que es el número que introducimos
   * 
   * @return true si es capicua y false si no lo es
   */
  public static boolean esCapicua(int num) {
    boolean bool;
    int volt = voltea(num);
    if (volt == num) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }

  /*
   * Devuelve verdadero si el número que se pasa como parámetro es primo y falso
   * en caso contrario.
   * 
   * @param num que es el número que introducimos
   * 
   * @return devuelve true si es primo y false si no lo es
   */
  public static boolean esPrimo(int num) {
    for (int cont = 2; cont < num; cont++) {
      if ((num % cont) == 0) {
        return false;
      }
    }
    return true;
  }

  /*
   * Devuelve el menor primo que es mayor al número que se pasa como parámetro.
   * 
   * @param num que es el número que introducimos
   * 
   * @return devuelve el siguiente número primo
   */
  public static int siguientePrimo(int num) {
    num++;

    while (!esPrimo(num)) {
      num++;
    }

    return num;
  }

  /*
   * Función digitos
   * Cuenta el número de dígitos de un número entero.
   */
  public static int digitos(int num) {
    int totalDigitos = 0;
    while (num > 0) {
      totalDigitos++;
      num /= 10;
    }
    return totalDigitos;
  }

  /*
   * Función voltea
   * Le da la vuelta a un número.
   */
  public static int voltea(int num) {
    int resto = 0;
    int alreves = 0;
    while (num > 0) {
      resto = num % 10;
      alreves = alreves * 10 + resto;
      num /= 10;
    }
    return alreves;
  }

  /*
   * Devuelve el dígito que está en la posición n de un número entero.
   * Se empieza contando por el 0 y de izquierda a derecha.
   * 
   * @param num, posicion num para el número que introducimos y posicion es donde
   * se encuentra
   * 
   * @return el digito que está en la posición indicada
   */
  public static int digitoN(int num, int posicion) {
    num = voltea(num);
    for (int cont = 0; cont < posicion; cont++) {
      num /= 10;
    }
    return (num % 10);
  }

  /*
   * Función posiciónDeDigito
   * Da la posición de la primera ocurrencia de un dígito dentro de un número
   * entero. Si no se encuentra, devuelve -1.
   */
  public static int posicionDeDigito(int num, int posicion) {
    int solucion = -1;
    int cont = 1;
    int aux = 0;
    int alreves = 0;
    while (num > 0) {
      alreves = (alreves * 10) + (num % 10);
      num /= 10;
    }
    while ((alreves > 0) && (solucion != cont)) {
      aux = alreves % 10;
      alreves /= 10;
      cont++;
      if (aux == posicion) {
        solucion = cont;
      }
    }
    return solucion;
  }

  /*
   * Función quitarPorDetras
   * Le quita a un número n dígitos por detrás (por la derecha).
   */
  public static int quitarPorDetras(int num, int quitar) {
    for (int cont = 0; cont < quitar; cont++) {
      num /= 10;
    }
    return num;
  }

  /*
   * Le quita a un número n dígitos por delante (por la izquierda).
   * 
   * @param num, quitar num es el número que introducimos y quitar es cuantos
   * digitos quieres quitar
   * 
   * @return el digito sin los números que tenia delante
   */
  public static int quitarPorDelante(int num, int quitar) {
    int alreves = 0;
    int derecho = 0;
    while (num > 0) {
      alreves = (alreves * 10) + (num % 10);
      num /= 10;
    }
    for (int i = 0; i < quitar; i++) {
      alreves /= 10;
    }
    while (alreves > 0) {
      derecho = (derecho * 10) + (alreves % 10);
      alreves /= 10;
    }
    return derecho;
  }

  /*
   * Añade un dígito a un número por detrás.
   * 
   * @param num, poner es el número que quieres añadir
   * 
   * @return el número con el número añadido
   */
  public static int pegaPorDetras(int num, int poner) {
    num = num * 10;
    num = num + poner;
    return num;
  }

  /*
   * Función pegarPorDelante
   * Añade un dígito a un número por delante.
   */
  public static int pegaPorDelante(int num, int poner) {
    int alreves = 0;
    int derecho = 0;
    while (num > 0) {
      alreves = (alreves * 10) + (num % 10);
      num /= 10;
    }
    alreves = alreves * 10;
    alreves = alreves + poner;
    while (alreves > 0) {
      derecho = (derecho * 10) + (alreves % 10);
      alreves /= 10;
    }
    return derecho;
  }

  /*
   * Función trozoDeNúmero
   * Toma como parámetros las posiciones inicial y final dentro de un número y
   * devuelve el trozo correspondiente.
   */
  public static int trozoDeNúmero(int num) {
    int inicial = 0;
    int ultimo = 0;
    int resto = 0;
    int alreves = 0;
    boolean primera = true;
    int solucion = 0;

    while (num > 0) {
      resto = num % 10;
      if (primera = true) {
        inicial = resto;
        primera = false;
      }
      alreves = alreves * 10 + resto;
      num /= 10;
      ultimo = resto;
    }
    solucion = inicial * 10 + ultimo;
    return solucion;
  }

  /*
   * Función juntaNumeros
   * Pega dos números para formar uno.
   */
  public static int juntaNumeros(int primerNumero, int segundoNumero) {
    int solucion = 0;
    int digito = 0;
    int multi = 1;
    int aux = segundoNumero;

    while (aux > 0) {
      digito++;
      aux /= 10;
    }
    for (int cont = 0; cont < digito; cont++) {
      multi *= 10;
    }
    solucion = primerNumero * multi + segundoNumero;
    return solucion;
  }

  // Programa principal
  public static void main(String[] args) {
    int num = 248;
    int base = 2;
    int exponente = 4;
    int posicion = 2;
    boolean primo;
    boolean capicua;
    int quitar = 2;
    int poner = 12;
    int unir = 8;
    int primerNumero = 27;
    int segundoNumero = 10;

    System.out.println("Prueba de esCapicua: " + esCapicua(num));
    System.out.println("Prueba de esPrimo: " + esPrimo(num));
    System.out.println("Prueba de siguientePrimo: " + siguientePrimo(num));
    System.out.println("Prueba de potencia: " + potencia(base, exponente));
    System.out.println("Prueba de digitos: " + digitos(num));
    System.out.println("Prueba de voltea: " + voltea(num));
    System.out.println("Prueba digitoN: " + digitoN(num));
    System.out.println("Prueba posicionDeDigito: " + posicionDeDigito(num, posicion));
    System.out.println("Prueba quitaPorDetras: " + quitarPorDetras(num, quitar));
    System.out.println("Prueba quitaPorDelante: " + quitarPorDelante(num, quitar));
    System.out.println("Prueba pegaPorDetras: " + pegaPorDetras(num, poner));
    System.out.println("Prueba pegaPorDelante: " + pegaPorDelante(num, poner));
    System.out.println("Prueba trozoDeNumero: " + trozoDeNúmero(num));
    System.out.println("Prueba juntaNumero: " + juntaNumeros(primerNumero, segundoNumero));
  }
}
