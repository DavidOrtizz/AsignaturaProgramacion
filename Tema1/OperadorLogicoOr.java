/*Este programa está echo por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*/


public class OperadorLogicoOr {
	
	public static void main (String[] args) {
		boolean a, b, c, d;
		
		a = true;
		b = true;
		c = false;
		d = false;
		
		System.out.println("True y True = " +(a || b));
		System.out.println("True y False = "+(a || c));
		System.out.println("False y True = "+(c || b));
		System.out.println("False y false = "+(c || d));
	}
}

