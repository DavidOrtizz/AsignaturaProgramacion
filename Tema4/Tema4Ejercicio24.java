import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Escribe un programa que genere la nómina (bien desglosada) de un empleado
*según las siguientes condiciones:
*• Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
*de proyecto), los días que ha estado de viaje visitando clientes durante el
*mes y su estado civil (1 - Soltero, 2 - Casado).
*• El sueldo base según el cargo es de 950, 1200 y 1600 euros según
*si se trata de un prog. junior, un prog. senior o un jefe de proyecto
*respectivamente.
*• Por cada día de viaje visitando clientes se pagan 30 euros extra en
*concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
*un 25% en caso de estar soltero y un 20% en caso de estar casado.
*/

public class Tema4Ejercicio24 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int menuTipo;
    int menuEstado;
    double sueldoEmpleado;
    double estadoCivil;
    int tiempoVisita;
    double dietas;
    sueldoEmpleado = 0;
    estadoCivil = 0;

    System.out.println("1. Prog. junior");
    System.out.println("2. Prog. senior");
    System.out.println("3. Jefe de proyecto");
    System.out.print("Indica tu cargo de empleado: ");
    menuTipo = s.nextInt();
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
    tiempoVisita = s.nextInt();
    System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
    menuEstado = s.nextInt();

    switch (menuTipo) {
      case 1:
        sueldoEmpleado = 950;
        break;

      case 2:
        sueldoEmpleado = 1200;
        break;

      case 3:
        sueldoEmpleado = 1600;
        break;

      default:
        System.out.println("No has seleccionado un cargo correcto.");
    }

    dietas = tiempoVisita * 30;

    switch (menuEstado) {
      case 1:
        estadoCivil = 25;
        break;

      case 2:
        estadoCivil = 20;
        break;

      default:
        System.out.println("No has seleccionado un estado civil correcto");
    }

    double sueldobruto = sueldoEmpleado + dietas;
    double retencion = sueldobruto * (estadoCivil / 100);
    double neto = sueldobruto - retencion;
    System.out.println("o----------------------------------o");
    System.out.println("| Sueldo base           " + sueldoEmpleado);
    System.out.println("| Dietas (" + tiempoVisita + " viajes)      " + dietas);
    System.out.println("|----------------------------------|");
    System.out.println("| Sueldo bruto           " + sueldobruto);
    System.out.println("| Retención IRPM (" + estadoCivil + "%) " + retencion);
    System.out.println("|----------------------------------|");
    System.out.println("| Sueldo neto            " + neto);
    System.out.println("o----------------------------------o");
  }
}
