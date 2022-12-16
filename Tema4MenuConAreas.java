import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Switch menú con areas de:
* -Triangulo- -Rombo- -Romboide- -Trapecio-
*/

public class Tema4MenuConAreas {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int menu;

    System.out.println("o----------------------o");
    System.out.println("|   Cálculo de áreas   |");
    System.out.println("|----------------------|");
    System.out.println("| 1. Triangulo         |");
    System.out.println("| 2. Rombo             |");
    System.out.println("| 3. Romboide          |");
    System.out.println("| 4. Trapecio          |");
    System.out.println("o----------------------o");
    System.out.print("Escoge el número: ");
    menu = s.nextInt();

    switch (menu) { // Selección del menu
      case 1: // Selección del triangulo
        int base;
        int altura;
        int areaTriangulo;

        System.out.println("Has seleccionado cálculo del área del triangulo");
        System.out.print("Introduce la base: ");
        base = s.nextInt();
        System.out.print("Introduce la altura: ");
        altura = s.nextInt();

        areaTriangulo = (base * altura) / 2;
        System.out.println("El área del triangulo es " + areaTriangulo);
        break;

      case 2: // Selección del rombo
        int D;
        int d;
        int areaRombo;

        System.out.println("Has seleccionado cálculo del área del rombo");
        System.out.print("Introduce la diagonal mayor: ");
        D = s.nextInt();
        System.out.print("Introduce la diagonal menor: ");
        d = s.nextInt();

        areaRombo = (D * d) / 2;
        System.out.println("El área del rombo es " + areaRombo);
        break;

      case 3: // Selección del romboide
        int B;
        int h;
        int areaRomboide;

        System.out.println("Has seleccionado cálculo del área del romboide");
        System.out.print("Introduce la base: ");
        B = s.nextInt();
        System.out.print("Introduce la altura: ");
        h = s.nextInt();

        areaRomboide = B * h;
        System.out.println("El área del romboide es " + areaRomboide);
        break;

      case 4: // Selección del trapecio
        int BaseMayor;
        int BaseMenor;
        int Altura;
        int areaTrapecio;

        System.out.println("Has seleccionado cálculo del área del trapecio");
        System.out.print("Introduce base mayor: ");
        BaseMayor = s.nextInt();
        System.out.print("Introduce base menor: ");
        BaseMenor = s.nextInt();
        System.out.print("Introduce la altura: ");
        Altura = s.nextInt();

        areaTrapecio = ((BaseMayor + BaseMenor) / 2) * Altura;
        System.out.println("El área del trapecio es " + areaTrapecio);
        break;

      default:
        System.out.println("No has seleccionado ningun número del menú");
    }
  }
}
