public class Canario extends Aves{
  private String color;
  private String canta;

  public Canario(String pico, int vuela) {
    super(pico, vuela);
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color){
    this.color = color;
  }

  public String getCanta(){
    return canta;
  }

  public void setCanta(String canta){
    this.canta = canta;
  }

  public void muestra() {
    System.out.println(this.Canario);
  }

  public void habla() {
    System.out.println("Pio pio pio");
  }

  public void volar(int volar) {
    this.volar += volar;
  }
}
