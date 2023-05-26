package clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 */
public class Gato {
private String nombre;
private String imagen;
public Gato(String nombre, String imagen) {
this.nombre = nombre;
this.imagen = imagen;
}
public String getNombre() {
return this.nombre;
}
public String getImagen() {
return this.imagen;
}

@Override
public String toString() {
return "<div\"><img src=\"" + imagen + "\" width=\"80\"><div\">&nbsp;Hola, soy " + nombre + "&nbsp;</div></div>";
}

public String seleccionarMano() {
    String mano;
    int num;
    num = (int) (Math.random() * 3);
    switch(num){
    case 0:
        return mano = "piedra";
    case 1:
        return mano = "papel";
    case 2:
        return mano = "tijeras";
    default:
        return mano = "error";
        }// Cierre switch
}

public String frase(){
    int num;
    num = (int) (Math.random() * 3);
    switch(num){
    case 0:
        return "Te voy a ganar con este movimiento y por eso voy a sacar ";
    case 1:
        return "Eperate y veras mi siguiente movimiento te voy a sacar ";
    case 2:
        return "Haya voyyyyyyyyyyyy con ";
    default:
        return "error";
        }// Cierre switch
}

 public void piedraPapelTijeras(Gato principal, Gato otroGato, Gato arbitro) {
     int puntosG1 = 0;
     int puntosG2 = 0;
     
     while(puntosG1 != 5 || puntosG2 != 5){
        String eleccionGato1 = seleccionarMano();
        String eleccionGato2 = seleccionarMano();

        System.out.println("<div\"><img src=\"" + imagen + "\" width=\"80\"><div\">&nbsp;"+ frase() + eleccionGato1 + "&nbsp;</div></div>");
        System.out.println("<div\"><img src=\"" + otroGato.getImagen() + "\" width=\"80\"><div\">&nbsp;"+ frase() + eleccionGato1 + "&nbsp;</div></div>");

        if (eleccionGato1.equals(eleccionGato2)) {
            System.out.println("<div\"><img src=\"" + arbitro.getImagen() + "\" width=\"80\"><div\">&nbsp; Tenemos un empateeee &nbsp;</div></div>");
        } else if ((eleccionGato1.equals("piedra") && eleccionGato2.equals("tijeras")) ||
                   (eleccionGato1.equals("papel") && eleccionGato2.equals("piedra")) ||
                   (eleccionGato1.equals("tijeras") && eleccionGato2.equals("papel"))) {
            System.out.println("<div\"><img src=\"" + arbitro.getImagen() + "\" width=\"80\"><div\">&nbsp; Esta ronda a ganado... &nbsp;</div></div>");
            System.out.println("<div\"><img src=\"" + imagen + "\" width=\"80\"><div\">");
            puntosG1++;
        } else {
            System.out.println("<div\"><img src=\"" + arbitro.getImagen() + "\" width=\"80\"><div\">&nbsp; Esta ronda a ganado... &nbsp;</div></div>");
            System.out.println("<div\"><img src=\"" + otroGato.getImagen() + "\" width=\"80\"><div\">");
            puntosG2++;
        }
    }// Cierre while
        if(puntosG1 == 5){
           System.out.println("<div\"><img src=\"" + imagen + "\" width=\"80\"><div\">&nbsp;He ganadoooooooooo&nbsp;</div></div>");
        } else {
            System.out.println("<div\"><img src=\"" + otroGato.getImagen()+ "\" width=\"80\"><div\">&nbsp;He ganadoooooooooo&nbsp;</div></div>");
        }     
 }
}

