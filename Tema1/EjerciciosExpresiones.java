/*Este programa está echo por: David Ortiz Corchero
*Curso: 1ºDAM Tarde
*/

public class EjerciciosExpresiones {
	
	public static void main (String[] args) {
		int entero1, entero2;
		
		entero1 = 5;
		entero2 = 7;
		
		System.out.println("A) ((entero1 > 5) && (entero2 + 3 < 10)) --> "+((entero1 > 5) && (entero2 + 3 < 10)));
		System.out.println("B) (10 != entero1 + 5) || (20 > (entero2 + 5) * entero1 + 5)) --> "+((10 != entero1 + 5) || (20 > (entero2 + 5) * entero1 + 5)));
		System.out.println("C) entero1 * entero2 + 10 + 4 / 2 - 2 * 4 + 2 --> "+(entero1 * entero2 + 10 + 4 / 2 - 2 * 4 + 2));
		System.out.println("D) (10 / 2 - 1 = entero1) && (20 > entero2 + 13) --> "+((10 / 2 - 1 == entero1) && (20 > entero2 + 13)));
		System.out.println("E) 5 - 2 > 4 && 5 == NOT 25 / 5 --> "+(!(5 - 2 > 4 && 5 == 25 / 5)));
		System.out.println("F) 'J'=='J' || 'S' == 's' --> "+('J'=='J' || 'S' == 's'));
		System.out.println("G) 4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1 --> "+(4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1));
		System.out.println("H) 10 + 4 < 15 - 3 || 2 * 5 + 1 > 14 - 2 * 2 --> "+(10 + 4 < 15 - 3 || 2 * 5 + 1 > 14 - 2 * 2));
	}
}

