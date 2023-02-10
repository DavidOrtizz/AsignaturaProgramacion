import java.util.Scanner;

public class PideRadio {
  /*
   * Pide el radio
   * 
   * @return el radio
   */
  public static double pideRadio() {
    Scanner s = new Scanner(System.in);
    double radio;
    System.out.print("Introduce el radio: ");
    radio = s.nextDouble();
    return radio;
  }
}
