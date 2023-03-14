/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Las amebas son seres unicelulares de forma cambiante ya que carecen de pared celular. 
* Fagocitan cualquier cosa que se les pone por delante. 
* Crea la clase Ameba con el atributo peso, un número entero que indica los microgramos que pesa el bicho.
* Al tratarse de una unidad tan pequeña, no se tienen en cuenta los decimales, será un dato entero. 
* Cuando Dios crea una ameba de la nada – new Ameba() – su peso es de 3 microgramos. 
* Al comer, va incrementando su peso; gasta un microgramo en el proceso de fagocitar y el resto hace que aumente de peso. 
* Por ejemplo, si come una partícula de 6 microgramos – por ej. miAmeba.come(6) – engordaría 5 microgramos. 
* Una ameba se puede comer a otra ameba. En este caso, sucede lo mismo que anteriormente, se gasta un microgramo en el proceso de fagocitado
*  y el resto lo engorda la ameba que come. 
* Por ejemplo, si una ameba de 7 microgramos se come a una de 4, acaba pesando 10 microgramos. 
* La ameba comida no se destruye sino que se quedaría con un peso de 0 microgramos, una pena de ameba vamos.
* Posteriormente, una ameba comida podría recuperarse si ella misma come algo. Nótese que el método come está sobrecargado.
*/

public class Ejercicio10 {
  public static void main(String[] args) {
    Ameba Patricio = new Ameba();

    Patricio.come(2);
    System.out.println(Patricio);

    Ameba Arenita = new Ameba();

    Arenita.come(4);
    System.out.println(Arenita);
    Patricio.come(Arenita);
    System.out.println(Patricio);
    System.out.println(Arenita);
    Arenita.come(3);
    System.out.println(Arenita);
  }
}
