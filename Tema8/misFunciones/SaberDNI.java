public class SaberDNI {
  /*
   * Saber la letra del dni
   * 
   * @param dni es el número del DNI
   * 
   * @return letra es la letra que hay en el DNI
   */
  public static String saberDNI(long dni) {
    long valor = dni / 23;
    String letra = "";

    switch (valor) {
      case 0:
        letra = "T";
        return letra;
        break;

      case 1:
        letra = "R";
        return letra;
        break;

      case 2:
        letra = "W";
        return letra;
        break;

      case 3:
        letra = "A";
        return letra;
        break;

      case 4:
        letra = "G";
        return letra;
        break;

      case 5:
        letra = "M";
        return letra;
        break;

      case 6:
        letra = "Y";
        return letra;
        break;

      case 7:
        letra = "F";
        return letra;
        break;

      case 8:
        letra = "P";
        return letra;
        break;

      case 9:
        letra = "D";
        return letra;
        break;

      case 10:
        letra = "X";
        return letra;
        break;

      case 11:
        letra = "B";
        return letra;
        break;

      case 12:
        letra = "N";
        return letra;
        break;

      case 13:
        letra = "J";
        return letra;
        break;

      case 14:
        letra = "Z";
        return letra;
        break;

      case 15:
        letra = "S";
        return letra;
        break;

      case 16:
        letra = "Q";
        return letra;
        break;

      case 17:
        letra = "V";
        return letra;
        break;

      case 18:
        letra = "H";
        return letra;
        break;

      case 19:
        letra = "L";
        return letra;
        break;

      case 20:
        letra = "C";
        return letra;
        break;

      case 21:
        letra = "K";
        return letra;
        break;

      case 22:
        letra = "E";
        return letra;
        break;

      default:
        System.out.println("");
    }
    return letra;
  }
}
