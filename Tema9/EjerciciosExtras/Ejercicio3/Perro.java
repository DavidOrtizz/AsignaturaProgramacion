public class Perro extends Mascotas{
  private String raza;
  private int pulgas;

  public Perro(){

  }

  public String getRaza(){
    return raza;
  }

  public void setRaza(String raza){
    this.raza = raza;
  }

  public int getPulgas(){
    return pulgas;
  }

  public void setPulgas(int pulgas){
    this.pulgas = pulgas;
  }

  public void muestra(){
    System.out.println(this.Perro);
  }

  public void habla(){
    System.out.println("Guau guau guau");
  }
}
