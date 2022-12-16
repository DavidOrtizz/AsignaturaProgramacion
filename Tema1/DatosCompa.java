/*Este programa está echo por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*/

public class DatosCompa {
	
	public static void main (String[] args) {
		
		final int pablo = 2002;
		final int david = 2003;
		char p,d;
		
		p = 'P';
		d = 'D';
		
		System.out.println("Pablo es el mayor de los dos: " +(pablo <= david));
		System.out.println("David es el mayor de los dos: " +(david <= pablo));
		System.out.println("La inicial de Pablo es mayor: " +(p <= d));
		System.out.println("La inicial de David es mayor: " +(d <= d));
	}
}

