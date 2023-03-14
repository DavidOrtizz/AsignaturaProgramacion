/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
*se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
*quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
*información sobre el número total de pizzas que se han pedido y que se
*han servido. Siempre que se crea una pizza nueva, su estado es “pedida”.
*/

public class PedidosPizza {
  public static void main(String[] args) {
    Pizza Jose = new Pizza("margarita", "mediana");
    Pizza Maria = new Pizza("funghi", "familiar");

    Maria.sirve();

    Pizza Carlos = new Pizza("cuatro quesos", "mediana");

    System.out.println(jose);
    System.out.println(Maria);
    System.out.println(Carlos);
    Maria.sirve();
    Carlos.valoracion();
    System.out.println("Se han pedido un total de: " + Pizza.getTotalPedidas() + " pizzas");
    System.out.println("Se han servido un total de: " + Pizza.getTotalServidas() + " pizzas");
  }
}
