/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Implementa la clase Terminal. Un terminal tiene asociado un número. 
* Los terminales se pueden llamar unos a otros y el tiempo de conversación corre para ambos. 
* A continuación se proporciona el contenido del main y el resultado que debe aparecer por pantalla.
 */

public class Tema9Ejercicio8 {
  public static void main(String[] args) {
    Terminal mario = new Terminal("665 21 78 12");
    Terminal david = new Terminal("624 97 56 15");
    Terminal marina = new Terminal("614 33 49 22");
    Terminal cristina = new Terminal("612 02 77 47");

    System.out.println(david);
    System.out.println(cristina);

    marina.llama(david, 520);
    mario.llama(cristina, 458);

    System.out.println(david);
    System.out.println(mario);
    cristina.mensaje();
    System.out.println(cristina);
  }
}
