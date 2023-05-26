package uno2_examen;

/**
 * Clase Fichero: maneja el fichero Top5.csv para leer y almacenar la lista de mejores jugadores del juego
 * Contiene los métodos necesarios para leer el fichero, guardar la lista en atributos de clase, y escribirlo de nuevo
 * si la puntuación del jugador debe insertarse en la lista.
 * Dependencias: Clase Carta (instancias y estático)
 *  
 * Examen DAM DAW del 25/05/2023
 * Pendiente pasar a ArrayList la lista de cartas, en atributos y todos los métodos.
 * 
 * @Author Pablo Carmona
 * @version 25/05/2023
 */


public class Fichero {
  
  static String[] nombres = new String[5];         // Contiene los 5 nombres del top5
  static int[] puntos = new int[5];                // Contiene las 5 puntuaciones del top5
  static final String NOMBRE_FICHERO = "Top5.csv"; // Fichero que contiene la lista

  public static String[] getNombres() {
    return nombres;
  }

  public static int[] getPuntos() {
    return puntos;
  }

  // leerTop5
  // Lee el fichero Top5.csv (5 líneas con formato "nombre;puntos")
  // Guarda los valores (los 5 nombres en nombres, y las 5 puntuaciones em puntos, 
  // ambas arrays de 5 elementos, String e int respectivamente)
  // SIMULADO, por implementar!
  //---------------------------------------------------------------------------------------------------------------
  public static void leerTop5() {
    nombres[0] = "Antonio";           // Esto hay que borrarlo e implementarlo con los jugadores reales
    puntos[0] = 12;
    nombres[1] = "Bárbara";
    puntos[1] = 10;
    nombres[2] = "César";
    puntos[2] = 7;
    nombres[3] = "Diana";
    puntos[3] = 5;
    nombres[4] = "Eduardo";
    puntos[4] = 2;
  }

  // escribirTop5
  // Si el ganador se cuela en el Top5 (su puntuación es mayor que la menor de la lista)
  // Se elimina el nombre con menor puntuación
  // Y se reescribe la lista con el nuevo nombre, ordenada por puntos, en el fichero Top5.csv
  // Por implementar!
  //---------------------------------------------------------------------------------------------------------------
  public static void escribirTop5(String nombre, int puntos) {
    
  }


}
