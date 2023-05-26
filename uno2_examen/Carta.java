package uno2_examen;
/**
 * Clase Carta para el juego Uno v2
 * CLASE COMPLETA, NO TOCAR!!
 * 
 * @author Pablo Carmona 
 */

import java.util.Scanner;

public class Carta {
  
  static final String ROJO = "\033[1;101m";
  static final String VERDE = "\033[42m";           
  static final String AMARILLO = "\033[1;103m";
  static final String AZUL = "\033[0;104m";
  static final String PURPURA = "\033[1;105m";
  static final String GRIS = "\033[1;100m";
  static final String RESET = "\033[0m";
  static final int CARTA_ROBA2 = 7;

  int numero;      // Valores: 0 - 7
  String color;    // Valores: "\033[1;101m", "\033[1;102m", "\033[1;103m", "\033[0;104m", "\033[1;105m";
  static Carta cartaEnJuego;

  public Carta (int numero, String color) {
    this.numero = numero;
    this.color = color;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }
  public String getColor() {
    return this.color;
  }

  public void setColorRandom() {
    this.color = switch ((int)(Math.random()*4)) {
      case 0 -> ROJO;
      case 1 -> VERDE;
      case 2 -> AMARILLO;
      default -> AZUL;
    };
  }

  public void setColorElige() {
    int opcionNum = 0;
    Scanner s = new Scanner(System.in);
    while (opcionNum == 0) {
      System.out.print("Color? [" + ROJO + " 1 " + VERDE + " 2 " + AMARILLO + " 3 " + AZUL + " 4 " + RESET + "] : ");
      String opcionStr = s.nextLine();
      if (!opcionStr.matches("[1-4]")) {
        System.out.println("Introduce un número del 1 al 4"); // Que sea numérico
      } else {
        opcionNum = Integer.parseInt(opcionStr);
      }
    }
    this.color = switch (opcionNum) {
      case 1 -> ROJO;
      case 2 -> VERDE;
      case 3 -> AMARILLO;
      case 4 -> AZUL;
      default -> this.color;  // Se queda como está, si no es válido;
    };
  }

  public boolean esRoba2() {
    return (this.numero == CARTA_ROBA2);
  }

  public boolean esComodin() {
    return (this.numero == 0);
  }
  
  static void setCartaEnJuego(Carta carta) {
    cartaEnJuego = carta;
  }

  static Carta getCartaEnJuego() {
    return cartaEnJuego;
  }

  public void setUsada() {
    this.numero++;
  }

  // La carta es jugable si es del mismo color o número que la que hay en juego, o si es comodín (0).
  // Si la cartaEnJuego es comodín, sólo es universalmente compatible si es púrpura, porque después cambia de color.
  public boolean esJugable() {
    return ((this.color == cartaEnJuego.color) || (this.numero == cartaEnJuego.numero) || (this.numero == 0) || (cartaEnJuego.color == PURPURA));
  }

  @Override
  public String toString() {
    return this.color + " " + this.numero + " " + RESET;
  }

  // Imprime la carta en 3 partes (3 filas de altura)
  // Diferencia entre carta común, comodín y "Roba2"
  public String anversoFila(int fila) {
    if (this.color == PURPURA) {
      return switch (fila) {                                  
        case 1 -> (ROJO + "/ " + VERDE + "\\" + RESET);               
        case 2 -> (AZUL + " " + this.color + this.numero + VERDE + " " + RESET);   
        case 3 -> (AZUL + "\\"  + AMARILLO + " /" + RESET);                  
        default -> "";
      };
    } else if  ((this.numero == CARTA_ROBA2) || (this.numero == CARTA_ROBA2+1)) {
      return switch (fila) {
        case 1 -> (this.color + "/ \\" + RESET);
        case 2 -> (this.color + " + " + RESET);
        case 3 -> (this.color + "\\ /" + RESET);
        default -> "";
      };
     } else {
        return switch (fila) {
        case 1 -> (this.color + "/ \\" + RESET);
        case 2 -> (this.color + " " + this.numero + " " + RESET);
        case 3 -> (this.color + "\\" + ((this.numero == CARTA_ROBA2) || (this.numero == CARTA_ROBA2+1) ? "²" : " ") + "/" + RESET);
        default -> "";
      };
    }
  }

  public String reversoFila(int fila) {
      return switch (fila) {                                  
        case 1 -> (GRIS + "/ \\" + RESET);               
        case 2 -> (GRIS + " · " + RESET);   
        case 3 -> (GRIS + "\\ /" + RESET);                  
        default -> "";
      };
  }
}
