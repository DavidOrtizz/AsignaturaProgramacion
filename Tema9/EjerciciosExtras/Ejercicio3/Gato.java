public class Gato extends Mascotas{
  private String color;
  private Boolean peloLargo;

  public Gato(String nombre, int edad, String estado, String fechaNacimiento) {
    super(nombre, edad, estado, fechaNacimiento);
  }


  public String getColor() {
    return color;
  }

  public void setColor(String color){
    this.color = color;
  }

  public Boolean getPeloLargo(){
    return peloLargo;
  }

  public void setPeloLargo(Boolean peloLargo){
    this.peloLargo = peloLargo;
  }

  public void muestra(){
    System.out.println(this.Gato);
  }

  public void habla(){
    System.out.println("Miau miau miau");
  }
}
