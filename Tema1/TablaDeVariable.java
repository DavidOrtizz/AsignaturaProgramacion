/*Este programa está echo por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*/


public class TablaDeVariable {
	
	public static void main (String[] args) {
		int a, b, c;
		a = 1;
		b = 2;
		c = 3;
		
		a = b;
		System.out.println("a = b --> " +a);
		c = a;
		System.out.println("c = a --> " +c);
		b = (a + b + c)/2;
		System.out.println("b = (a+b+c)/2 --> " +b);
		a = a + c * 2;
		System.out.println("a = a + c * 2 --> " +a);
		c = b - a;
		System.out.println("c = b - a --> " +c);
		a = b * c;
		System.out.println("a = b * c --> " +a);
		b = a + b * 2;
		System.out.println("b = a + b * 2 --> " +b);
		c = c - 2;
		System.out.println("c = c - 2 --> " +c);
		a = b;
		System.out.println("a = b --> " +a);
		c = a/b;
		System.out.println("c = a/b --> " +c);
	}
}

