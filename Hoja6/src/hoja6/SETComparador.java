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
