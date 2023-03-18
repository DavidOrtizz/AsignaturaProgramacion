public class ArrayGato2 {
  private String color;
  private int comida = 10;

  public GatoArray(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void come(int comida) {
    if (comida != 0) {
      this.comida += 1;
      comida -= 1;
      for (int i = 0; i <= this.comida; i++) {
        System.out.print("miau "); // Por cada comida que haya comido hace el sonido miau
      }
      System.out.println(); // Salto de linea
    } else {
      System.out.println("Ya no hay comida"); // Cuando comida es 0
    }
  }
}
