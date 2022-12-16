import java.util.Scanner;

/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Un minicuestionario con 10 preguntas tipo test sobre las asignaturas
*que se imparten en el curso. Cada pregunta acertada sumará un punto. El
*programa mostrará al final la calificación obtenida.
*/

public class Tema4Ejercicio12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int punto;
    int menu;
    punto = 0;

    System.out.println("Bienvenido a este minicuestionario");
    System.out.println("");
    System.out.println("1. ¿Qué es una variable?");
    System.out.println("");
    System.out.println("1. Un contenedor de información que no cambia"); // Falso
    System.out.println("2. Un contenedor de información que si puede cambiar"); // Verdadero
    System.out.println("3. Las dos son falsas"); // Falso
    System.out.println("");
    System.out.print("Introduce el número de la opción correcta ");
    menu = s.nextInt();

    switch (menu) {
      case 1:
      case 3:
        break;

      case 2:
        punto = punto + 1;
        break;

      default:
        System.out.print("No has introducido ninguna de las tres opciones");
        System.out.println(", por lo tanto se tomará como pregunta no respondida");
    }
    System.out.println("");
    System.out.println("2. int se usa para");
    System.out.println("");
    System.out.println("1. contener números enteros"); // Verdadero
    System.out.println("2. contener letras"); // Falso
    System.out.println("3. contener decimales"); // Falso
    System.out.println("");
    System.out.print("Introduce el número de la opción correcta ");
    menu = s.nextInt();

    switch (menu) {
      case 2:
      case 3:
        break;

      case 1:
        punto = punto + 1;
        break;

      default:
        System.out.print("No has introducido ninguna de las tres opciones");
        System.out.println(", por lo tanto se tomará como pregunta no respondida");
    }
    System.out.println("");
    System.out.println("3. Donde se puede guardar esto: 15.67");
    System.out.println("");
    System.out.println("1. int"); // Falso
    System.out.println("2. String"); // Falso
    System.out.println("3. double"); // Verdadero
    System.out.println("");
    System.out.print("Introduce el número de la opción correcta ");
    menu = s.nextInt();

    switch (menu) {
      case 1:
      case 2:
        break;

      case 3:
        punto = punto + 1;
        break;

      default:
        System.out.print("No has introducido ninguna de las tres opciones");
        System.out.println(", por lo tanto se tomará como pregunta no respondida");
    }
    System.out.println("");
    System.out.println("4. ¿Qué significa &&?");
    System.out.println("");
    System.out.println("1. Al menos una de las condiciones que introduzcamos es verdadera"); // Falso
    System.out.println("2. La condición es falsa"); // Falso
    System.out.println("3. Que las dos condiciones que introduzcamos son verdaderas"); // Verdadero
    System.out.println("");
    System.out.print("Introduce el número de la opción correcta ");
    menu = s.nextInt();

    switch (menu) {
      case 1:
      case 2:
        break;

      case 3:
        punto = punto + 1;
        break;

      default:
        System.out.print("No has introducido ninguna de las tres opciones");
        System.out.println(", por lo tanto se tomará como pregunta no respondida");
    }
    System.out.println("");
    System.out.println("5. Para recoger un dato introducido por teclado usaremos");
    System.out.println("");
    System.out.println("1. swicht"); // Falso
    System.out.println("2. Scanner"); // Verdadero
    System.out.println("3. System.out.print"); // Falso
    System.out.println("");
    System.out.print("Introduce el número de la opción correcta ");
    menu = s.nextInt();

    switch (menu) {
      case 1:
      case 3:
        break;

      case 2:
        punto = punto + 1;
        break;

      default:
        System.out.print("No has introducido ninguna de las tres opciones");
        System.out.println(", por lo tanto se tomará como pregunta no respondida");
    }
    System.out.println("");
    System.out.println("6. Para mostrar por pantalla sin salto de linea usaremos");
    System.out.println("");
    System.out.println("1. System.out.print"); // Verdadero
    System.out.println("2. System.out.println"); // Falso
    System.out.println("3. System.print.noNextLine"); // Falso
    System.out.println("");
    System.out.print("Introduce el número de la opción correcta ");
    menu = s.nextInt();

    switch (menu) {
      case 2:
      case 3:
        break;

      case 1:
        punto = punto + 1;
        break;

      default:
        System.out.print("No has introducido ninguna de las tres opciones");
        System.out.println(", por lo tanto se tomará como pregunta no respondida");
    }
    System.out.println("");
    System.out.println("7. Selecciona la opción incorrecta");
    System.out.println("");
    System.out.println("1. String"); // Falso
    System.out.println("2. System"); // Falso
    System.out.println("3. Scanner s = new (System.in);"); // Verdadero
    System.out.println("");
    System.out.print("Introduce el número de la opción correcta ");
    menu = s.nextInt();

    switch (menu) {
      case 1:
      case 2:
        break;

      case 3:
        punto = punto + 1;
        break;

      default:
        System.out.print("No has introducido ninguna de las tres opciones");
        System.out.println(", por lo tanto se tomará como pregunta no respondida");
    }
    System.out.println("");
    System.out.println("8. ¿Que hace este operador? !=");
    System.out.println("");
    System.out.println("1. Ese operador no existe"); // Falso
    System.out.println("2. Significa que no tiene solución"); // Falso
    System.out.println("3. Significa distinto"); // Verdadero
    System.out.println("");
    System.out.print("Introduce el número de la opción correcta ");
    menu = s.nextInt();

    switch (menu) {
      case 1:
      case 2:
        break;

      case 3:
        punto = punto + 1;
        break;

      default:
        System.out.print("No has introducido ninguna de las tres opciones");
        System.out.println(", por lo tanto se tomará como pregunta no respondida");
    }
    System.out.println("");
    System.out.println("9. Para un contador usaremos una variable de tipo");
    System.out.println("");
    System.out.println("1. char"); // Falso
    System.out.println("2. int"); // Verdadero
    System.out.println("3. String"); // Falso
    System.out.println("");
    System.out.print("Introduce el número de la opción correcta ");
    menu = s.nextInt();

    switch (menu) {
      case 1:
      case 3:
        break;

      case 2:
        punto = punto + 1;
        break;

      default:
        System.out.print("No has introducido ninguna de las tres opciones");
        System.out.println(", por lo tanto se tomará como pregunta no respondida");
    }
    System.out.println("");
    System.out.println("10. Usaremos char para");
    System.out.println("");
    System.out.println("1. Un caracter suelto"); // Verdadero
    System.out.println("2. Varios caracteres"); // Falso
    System.out.println("3. Para guardar una frase"); // Falso
    System.out.println("");
    System.out.print("Introduce el número de la opción correcta ");
    menu = s.nextInt();

    switch (menu) {
      case 2:
      case 3:
        break;

      case 1:
        punto = punto + 1;
        break;

      default:
        System.out.print("No has introducido ninguna de las tres opciones");
        System.out.println(", por lo tanto se tomará como pregunta no respondida");
    }
    System.out.println("Has terminado el test y has sacado un " + punto);
  }
}
