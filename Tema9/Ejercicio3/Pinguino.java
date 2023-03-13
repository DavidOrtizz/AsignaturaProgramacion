public class Pinguino extends Ave {

  public Pinguino() {
  }

  public Pinguino(Sexo s) {
    super(s);
  }

  public void pescar() {
    System.out.println("Tengo hambre, voy a buscar algun pez");
  }

  public void nadar() {
    System.out.println("Tengo ganas de nadar");
  }

  public void deslizarse() {
    System.out.println("Hagamos una carrera deslizandonos");
  }
}
