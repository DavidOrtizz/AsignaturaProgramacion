/*Este programa está hecho por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*Descripción del programa: Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. 
*Crea, al menos, tres métodos específicos de cada clase y redefne el/los método/s cuando sea necesario. 
*Prueba las clases creadas en un programa en el que se instancien objetos y se les apliquen métodos.
*/

public class Tema9Ejercicio3 {
  public static void main(String[] args) {
    Canario piolin = new Canario(Sexo.MACHO);
    piolin.volar();
    piolin.ruido();
    piolin.nido();

    Perro pluto = new Perro(Sexo.HEMBRA);
    pluto.ladrar();
    pluto.dormir();
    pluto.jugar();

    Lagarto piti = new Lagarto(Sexo.MACHO);
    piti.descansar();
    piti.caminar();
    piti.comer();
  }
}
