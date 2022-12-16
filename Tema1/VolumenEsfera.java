/*Este programa está echo por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*/

public class VolumenEsfera {
	
	public static void main (String[] args) {
		
		final double radio = 8.75;
		final double pi = 3.14;
		double volumen;
		
		volumen = (4 / 3 * pi * radio * radio * radio);
		System.out.println("El volumen de la esfera es: "+volumen);
	}
}

