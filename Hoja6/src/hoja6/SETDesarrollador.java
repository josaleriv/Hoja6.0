/*
Universidad del Valle de Guatemala
Algoritmos y Estructuras de Datos
Hoja de Trabajo 6
Jose Alejandro Rivera, 14213
Marcos Benedict, 14368
*/
package hoja6;
/**
 *
 * @author joserivera
 */
public class SETDesarrollador {
    String nombre;
    int[] conjuntos = new int[3];
    
    public SETDesarrollador(String nombre, int conjuntoJava, int conjuntoWeb, int conjuntoCelulares){
        this.nombre = nombre;
        conjuntos[0] = conjuntoJava;
        conjuntos[1] = conjuntoWeb;
        conjuntos[2] = conjuntoCelulares;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setConjuntos(int[] conjuntos){
        this.conjuntos = conjuntos;
    }
    public int getDesarrolladoresJava(){
        return conjuntos[0];
    }
    public int getDesarrolladoresWeb(){
        return conjuntos[1];
    }
    public int getDesarrolladoresCelulares(){
        return conjuntos[2];
    }
}
