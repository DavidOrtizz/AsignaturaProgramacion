import java.util.Scanner;
import misFunciones.Menu;
import misFunciones.PideRadio;
import misFunciones.Circunferencia;
import misFunciones.Area;
/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un programa que muestre un menú con 2 opciones: “1.Circunferencia” y “2.Área”.
En ambas se le pedirá al usuario que introduzca un radio y luego se le mostrará el cálculo
oportuno.
*/

public class Tema8Ejercicio21 {
  public static void main(String[] args) {
    int seleccionado = Menu.menu();
    double radio;
    if (seleccionado == 1) {
      radio = PideRadio.pideRadio();
      System.out.println("La circunferencia es: " + Circunferencia.circunferencia(radio));
    }
    if (seleccionado == 2) {
      radio = PideRadio.pideRadio();
      System.out.println("El área es: " + Area.area(radio));
    }
  }
}
