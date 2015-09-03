/*
Universidad del Valle de Guatemala
Algoritmos y Estructuras de Datos
Hoja de Trabajo 6
Jose Alejandro Rivera, 14213
Marcos Benedict, 14368
*/
package hoja6;
import java.util.*;

/**
 *
 * @author joserivera
 */
public class SETComparador implements Comparator<SETDesarrollador>{
    
    public int compare(SETDesarrollador primero, SETDesarrollador segundo){
        return primero.getNombre().compareTo(segundo.getNombre());
    }
}
