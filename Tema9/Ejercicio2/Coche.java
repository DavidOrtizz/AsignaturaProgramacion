public class Coche extends Vehiculo {
  private int cilindrada;

  public Coche(int c) {
    super();
    this.cilindrada = c;
  }

  public void quemarRueda() {
    System.out.println("¡Tus ruedas estan que echan humo!");
  }
}
