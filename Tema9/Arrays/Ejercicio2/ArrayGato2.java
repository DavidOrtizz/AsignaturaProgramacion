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
        if (comida != 0) {
          System.out.print("miau "); // Por cada comida que haya comido hace el sonido miau
        } else {
          System.out.println(" ya no hay comida"); // Cuando comida es 0
        }
      }
      System.out.println(); // Salto de linea
    }
  }
}
