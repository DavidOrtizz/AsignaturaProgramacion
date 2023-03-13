public class Lagarto extends Animal {

  public Lagarto() {
  }

  public Lagarto(Sexo s) {
    super(s);
  }

  public void descansar() {
    System.out.println("Me voy a tomar un descansito bajo esta roca");
  }

  public void caminar() {
    System.out.println("Me voy a mover un poquito que tengo calor");
  }

  public void comer() {
    System.out.println("Tengo hambre, voy a comerme esta hormiguita");
  }
}
