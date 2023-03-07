public abstract class Vehiculo {
  private static int kmTotales = 0;
  private static int vehiculosCreados = 0;
  private int kmRecorridos;

  public Vehiculo() {
    this.kmRecorridos = 0;
  }

  public int getKmRecorridos() {
    return kmRecorridos;
  }

  public static int getKmTotales() {
    return Vehiculo.getkmTotales;
  }

  public void recorre(int km) {
    this.kmRecorridos += km;
    Vehiculo.kmTotales += km;
  }
}
