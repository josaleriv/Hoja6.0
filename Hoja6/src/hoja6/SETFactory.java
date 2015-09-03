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
public class SETFactory {
    public AbstractSet implementacion(int eleccionSET){
        AbstractSet implementacion = null;
        if(eleccionSET == 1){
            implementacion= new HashSet<SETDesarrollador>();
        }
        if(eleccionSET == 2){
            implementacion= new LinkedHashSet<SETDesarrollador>();
        }
        if(eleccionSET == 3){
            implementacion= new TreeSet<SETDesarrollador>(new SETComparador());
        }
        return implementacion;
    }
}
