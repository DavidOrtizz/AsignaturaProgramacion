public class Loro extends Aves {
  private String origen;
  private String habla;

  public Loro(String pico, int vuela) {
    super(pico, vuela);
  }

  public String getHabla() {
    return habla;
  }

  public void setHabla(String habla) {
    this.habla = habla;
  }

  public String getOrigen() {
    return origen;
  }

  public void setOrigen(String origen) {
    this.origen = origen;
  }

  public void muestra() {
    System.out.println(this.Loro);
  }

  public void Saluda() {
    System.out.println("Holaa soy un loro que habla muuuuy bien");
  }

  public void volar(int volar) {
    this.volar += volar;
  }
}
