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
public String maulla() {
return "<div\"><img src=\"" + imagen + "\" width=\"80\"><div\">&nbsp;Miauuuuuuuu&nbsp;</div></div>";
}
public String come(String comida) {
return "<div\"><img src=\"" + imagen + "\" width=\"80\"><div\">&nbsp;Estoy comiendo " + comida + "&nbsp;</div></div>";
}
public String frasesGatos() {
    int num;
    num = (int) (Math.random() * 6);
    switch(num){
    case 0:
        return "<div><img src=\"" + imagen + "\" width=\"80\"><div\">&nbsp;Me gusta el pescadooooo&nbsp;</div></div>";
    case 1:
        return "<div><img src=\"" + imagen + "\" width=\"80\"><div\">&nbsp;Tengo ganas de jugar&nbsp;</div></div>";
    case 2:
        return "<div><img src=\"" + imagen + "\" width=\"80\"><div\">&nbsp;¡¡¡Un ratón!!!!&nbsp;</div></div>";
    case 3:
        return "<div><img src=\"" + imagen + "\" width=\"80\"><div\">&nbsp;Que sueño&nbsp;</div></div>";
    case 4:
        return "<div><img src=\"" + imagen + "\" width=\"80\"><div\">&nbsp;Zzz Zzz&nbsp;</div></div>";
    case 5:
        return "<div><img src=\"" + imagen + "\" width=\"80\"><div\">&nbsp;Tengo mucha sed&nbsp;</div></div>";
    default:
        return "<div><img src=\"" + imagen + "\" width=\"80\"><div\">&nbsp;Gato error&nbsp;</div></div>";
        }
    }
}
