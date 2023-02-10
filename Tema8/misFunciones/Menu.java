import java.util.Scanner;

public class Menu {
  /*
   * Menu para escoger opciones
   * 
   * @return menu devuelve el seleccionado
   */
  public static int menu() {
    Scanner s = new Scanner(System.in);
    int menu;

    System.out.println("1 - Circunferencia");
    System.out.println("2 - Área");
    System.out.print("Selecciona de estas opciones: ");
    menu = s.nextInt();
    return menu;
  }
}
