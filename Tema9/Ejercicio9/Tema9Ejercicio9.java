/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Implementa la clase Movil como subclase de Terminal (la clase del ejercicio anterior que ya no hace falta modificar). 
* Cada móvil lleva asociada una tarifa que puede ser “rata”, “mono” o “bisonte”. 
* El coste por minuto es de 6, 12 y 30 céntimos respectivamente. Se tarifican los segundos exactos. Obviamente, cuando un móvil llama a otro, 
* se le cobra al que llama, no al que recibe la llamada. 
* A continuación se proporciona el contenido del main y el resultado que debe aparecer por pantalla. Para que el total tarificado aparezca con dos
* decimales, puedes utilizar DecimalFormat.
*/

public class Tema9Ejercicio9 {
  public static void main(String[] args) {
    Movil David = new Movil("654 45 82 22", "Simyo");
    Movil Marina = new Movil("624 06 09 05", "mono");
    Movil Oscar = new Movil("627 11 01 74", "bisonte");

    System.out.println(David);
    System.out.println(Marina);
    David.llama(Marina, 320);
    Oscar.llama(David, 200);
    Marina.llama(David, 550);
    System.out.println(David);
    System.out.println(Marina);
    System.out.println(Oscar);

    Oscar.videollamada();
    Marina.videollamada();
  }
}
