public abstract class Mascotas {
  private String nombre;
  private int edad;
  private String estado;
  private String fechaNacimiento;

  public Mascotas(String nombre, int edad, String estado, String fechaNacimiento) {
    this.nombre = nombre;
    this.edad = edad;
    this.estado = estado;
    this.fechaNacimiento = fechaNacimiento;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public void muestra() {
    System.out.println(this.Mascotas);
  }

  public void morir() {
    System.out.println("Por desgracia este animal a muerto :(");
  }

  public void cumpleaños(String dia, String mes) {
    System.out.println("Mi cumpleaños es el día " + dia + " de " + mes);
  }

  public void habla() {
    System.out.println("Comprame!!!!! Que seré bueno");
  }
}
