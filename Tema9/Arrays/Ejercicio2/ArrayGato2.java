public class ArrayGato2 {
  private String color;
  private int comida = 10;
  private int comedero = comida; // Controlador de la comida

  public ArrayGato2(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void come(int come) {
    if (come < 10) {
      this.comida += come;
      for (int i = 1; i <= come; i++) {
        if (0 <= comedero) {
          System.out.print("miau "); // Por cada comida que haya comido hace el sonido miau
          comedero--;
        } else {
          System.out.print(" ya no hay comida :("); // Cuando la comida es 0
        }
      }
      System.out.println(); // Salto de linea
    }
  }
}
