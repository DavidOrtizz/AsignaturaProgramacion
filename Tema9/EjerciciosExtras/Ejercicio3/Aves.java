public abstract class Aves extends Mascotas {
  private String pico;
  private int vuela;

  public Aves(String nombre, int edad, String estado, String fechaNacimiento) {
    super(nombre, edad, estado, fechaNacimiento);
  }

  public String getPico() {
    return pico;
  }

  public void setPico(String pico) {
    this.pico = pico;
  }

  public int getVuela() {
    return vuela;
  }

  public void setVuela(int vuela) {
    this.vuela = vuela;
  }

  public void volar(int volar) { // Se le suma mas distancia de vuelo
    this.volar += volar;
  }
}
