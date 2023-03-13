public class Perro extends Mamifero {

  public Perro(Sexo s) {
    super(s);
  }

  public Perro() {
    super(Sexo.HEMBRA);
  }

  public void ladrar() {
    System.out.println("Guau guau");
  }

  public void jugar() {
    System.out.println("Tirame una pelota que tengo ganas de jugar");
  }

  public void dormir() {
    System.out.println("Zzz Zzz");
  }
}
