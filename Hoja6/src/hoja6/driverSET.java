package hoja6;
import java.util.*;
/**
 *
 * @author joserivera
 */
public class driverSET {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        SETFactory factory = new SETFactory(); // instanciar la Factory
        AbstractSet tiposDesarrolladores = null;
        String nombre, grupo;
        int java, web, celulares, cantjava, cantweb, cantcelulares, opcionSET, opcionImplementacion;
        int x=0;
        
        System.out.print("\nBienvenido");
        while (x==0){
            System.out.println("\nPor medio del numero, escoja una opcion:\n\n1) Seleccionar tipo de implementacion.\n2) Ingreso de datos.\n3) Desplegar datos.\n4) Salir.");
            opcionSET = scan.nextInt();
            if (opcionSET == 1 || opcionSET == 2 || opcionSET == 3){}
            else if(opcionSET == 4){ 
                System.out.println("\nSaliendo del programa..."); 
                x = 1; 
            }
            else { 
                System.out.println("\nERROR. Ingresar una de las opciones."); 
            }
            while (opcionSET==1){ 
                System.out.println("\nPor medio del numero, escoja un tipo de implementacion de SET:\n\n1) HashSet.\n2) TreeSet.\n3) LinkedHashSet.");
                opcionImplementacion = scan.nextInt();
                if (opcionImplementacion==1 || opcionImplementacion==2 || opcionImplementacion==3) { 
                    opcionSET=5; 
                    tiposDesarrolladores = factory.implementacion(opcionImplementacion); 
                }
                else { 
                    System.out.println("\nERROR. Ingresar el numero de su eleccion."); 
                }
                /*
                    desarrollador persona= new desarrollador ("Marlon", 1, 0, 0);
                    desarrolladores.add(persona);
                    Iterator<desarrollador> nombres= desarrolladores.iterator();
                    nombre = nombres.next().getNombre();*/
            }
            while (opcionSET==2){ 
                System.out.println("\nIngrese el nombre y luego el grupo al que pertenece. Puede ingresar varios grupos, pero estos se deben ingresar en orden y separadas por coma(,)."); 
                System.out.println("\nNombre: Marlon\nGrupo: 2,3"); 
                System.out.print("\nNombre:"); 
                nombre = scan.next();
                System.out.print("\n\n1)Desarrolladores Java.\n2)Desarrolladores Web.\n3)Desarrolladores Celulares.\n"); 
                System.out.print("\nGrupo:");
                //se pone dos veces la instruccion para que se vacie el buffer 
                grupo = scan.nextLine();
                grupo = scan.nextLine();
                if (grupo.equals("1")){ java=1; web=0; celulares=0;  opcionSET = 5; SETDesarrollador persona = new SETDesarrollador(nombre, java, web, celulares); tiposDesarrolladores.add(persona); }
                else if (grupo.equals("2")){ java=0; web=1; celulares=0; opcionSET = 5; SETDesarrollador persona = new SETDesarrollador(nombre, java, web, celulares); tiposDesarrolladores.add(persona); }
                else if (grupo.equals("3")){ java=0; web=0; celulares=1;  opcionSET = 5; SETDesarrollador persona = new SETDesarrollador(nombre, java, web, celulares); tiposDesarrolladores.add(persona); }
                else if (grupo.equals("1,2")){ java=1; web=1; celulares=0; opcionSET = 5; SETDesarrollador persona = new SETDesarrollador(nombre, java, web, celulares); tiposDesarrolladores.add(persona); }
                else if (grupo.equals("1,3")){ java=1; web=0; celulares=1; opcionSET = 5; SETDesarrollador persona = new SETDesarrollador(nombre, java, web, celulares); tiposDesarrolladores.add(persona); }
                else if (grupo.equals("2,3")){ java=0; web=1; celulares=1; opcionSET = 5; SETDesarrollador persona = new SETDesarrollador(nombre, java, web, celulares); tiposDesarrolladores.add(persona); }
                else { System.out.println("La forma ingresada de los grupos no es correcta, por favor intente de nuevo. Recuerde que debe ingresar en orden los grupos y separados por coma(,)."); }
            }
            while (opcionSET==3){
                Iterator<SETDesarrollador> nombres= tiposDesarrolladores.iterator();
                Iterator<SETDesarrollador> javas= tiposDesarrolladores.iterator();
                Iterator<SETDesarrollador> webs= tiposDesarrolladores.iterator();
                Iterator<SETDesarrollador> celular= tiposDesarrolladores.iterator();
                cantjava=0;
                cantweb=0;
                cantcelulares=0;
                while (nombres.hasNext()) {
                    nombre = nombres.next().getNombre();
                    java = javas.next().getDesarrolladoresJava();
                    web = webs.next().getDesarrolladoresWeb();
                    celulares = celular.next().getDesarrolladoresCelulares();
                    System.out.println(nombre+"  "+java+"  "+web+"  "+celulares);
                    if (java==1){
                        cantjava = cantjava + 1;
                    }
                    if (web==1){
                        cantweb = cantweb + 1;
                    }
                    if (celulares==1){
                        cantcelulares = cantcelulares +1;
                    }

                }
                System.out.println(cantjava);
                System.out.println(cantweb);
                System.out.println(cantcelulares);
                break;
            }
            
        }
    }
}
