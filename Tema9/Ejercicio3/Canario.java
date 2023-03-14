public class Canario extends Ave {

  public Canario() {
  }

  public Canario(Sexo s) {
    super(s);
  }

  public void ruido() {
    System.out.println("Pio pio");
  }

  public void volar() {
    System.out.println("¡Este canario se pone a volar!");
  }

  public void nido() {
    System.out.println("Tengo que volver al nido, me están esperando");
  }
}
