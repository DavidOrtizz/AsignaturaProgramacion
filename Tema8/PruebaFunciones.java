import misFunciones.Multiplicacion;
import misFunciones.Minimo;
import misFunciones.DimeSigno;
import misFunciones.Rectangulo;
import misFunciones.ValorN;

public class PruebaFunciones {
  public static void main(String[] args) {
    double a = 12;
    double b = 4;
    int c = -3;
    int n = 8;

    Multiplicacion.multiplica(a, b);
    Minimo.minimo((int) a, (int) b);
    System.out.println("El signo que tiene es: " + DimeSigno.dimeSigno(c));
    System.out.println("El área del rectangulo es: " + Rectangulo.areaRectangulo(a, b));
    System.out.println("El perímetro del rectangulo es: " + Rectangulo.perimetroRectangulo(a, b));
    System.out.println("El valor total de la suma de n es: " + ValorN.suma1aN(n));
    System.out.println("El valor factorial de n es: " + ValorN.producto1aN(n));
    System.out.println("El valor intermedio de n es: " + ValorN.intermedio1aN(n));
  }
}
