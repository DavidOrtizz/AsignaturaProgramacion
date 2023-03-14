public class Pizza {
  // Atributo de instancia
  private String tipo;
  private String tamaño;
  private String estado;

  // Atributo de clase
  private static int totalPedidas = 0;
  private static int totalServidas = 0;

  public Pizza(String tipo, String tamaño) {
    this.tipo = tipo;
    this.tamaño = tamaño;
    this.estado = "pedida";
    Pizza.totalPedidas++;
  }

  public String toString() {
    return "La pizza " + this.tipo + " de tamaño " + this.tamaño + ", está " + this.estado;
  }

  public static int getTotalPedidas() {
    return totalPedidas;
  }

  public static int getTotalServidas() {
    return totalServidas;
  }

  public void sirve() {
    if (this.estado.equals("pedida")) {
      this.estado = "servida";
      Pizza.totalServidas++;
    } else {
      System.out.println("Esa pizza ya se ha servido");
    }
  }

  public void valoracion() {
    System.out.println("Estaba muy rica la pizza");
  }
}
