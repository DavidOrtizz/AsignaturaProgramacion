package uno_examen;

public class Carta {
  static int numero;
  static String color;
  static Carta cartaEnJuego
  static final String ROJO = "\033[1;101m";
  static final String VERDE = "\033[42m";
  static final String AMARILLO = "\033[1;103m";
  static final String AZUL = "\033[0;104m";
  static final String PURPURA = "\033[1;105m";
  static final String GRIS = "\033[1;100m";
  static final String RESET = "\033[0m";

  public Carta(int numero, String color) {
    this.numero = numero;
    this.color = color;
  }

  public static String getColor() {
    return color;
  }

  public static int getNumero() {
    return numero;
  }

  /**
   * La carta será comodin si el color es púrpura o es el número 0
   * 
   * @return true si es comodin
   * @return false si no es comodin
   */
  public static boolean esComodin() {
    if (this.numero == 0 || this.color.equals("púrpura") || this.color.equals("purpura")) {
      return true;
    }
    return false;
  }

  public static void setCartaEnJuego(Carta carta) {
    cartaEnJuego = carta;
  }

  public static Carta getCartaEnJuego() {
    return this.cartaEnJuego;
  }

  /**
   * Una carta es jugable si es del mismo color o tiene el mismo número
   * 
   * @return true si es jugable
   * @return false si no es jugable
   */
  public static boolean esJugable() {
    if (this.color == color || this.numero == numero) {
      return true;
    }
    return false;
  }

  public String toString() {
    return numero + " " + color;
  }

  public static String dibujaFila(int fila) {
  
  }
}
