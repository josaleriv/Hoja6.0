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
        SETFactory nfactory = new SETFactory(); // instanciar la Factory
        AbstractSet desarrolladores = null;
        String nombre;
        String grupo;
        int java;
        int web;
        int celulares;
        int cantjava;
        int cantweb;
        int cantcelulares;
        int opcion;
        int opcion2;
        int a=0;

        while (a==0){
            System.out.println("\nSeleccione una de las siguientes opciones:\n\n1)Tipo de implementacion SET.\n2)Ingresar persona.\n3)Mostrar resultados.\n4)Salir.");
            System.out.print("\nOpcion: ");
            opcion = scan.nextInt();
            if (opcion==1 || opcion==2 || opcion==3){ opcion = opcion; }
            else if(opcion==4){ System.out.println("\nGracias por utilizar nuestro programa."); a = 1; }
            else { System.out.println("\nERROR. La opcion ingresada no es valida, recuerde que solo puede ingresar numeros de 1 a 3."); }

            while (opcion==1){ 
                System.out.println("\nSeleccione una implementacion:\n\n1)HashSet.\n2)TreeSet.\n3)LinkedHashSet.");
                System.out.print("\nOpcion: ");
                opcion2 = scan.nextInt();
                if (opcion2==1 || opcion2==2 || opcion2==3) { opcion=5; desarrolladores=nfactory.implementacion(opcion2); }
                else { System.out.println("\nERROR. La opcion ingresada no es valida, recuerde que solo puede ingresar numeros de 1 a 3."); }
                /*
                    desarrollador persona= new desarrollador ("Marlon", 1, 0, 0);
                    desarrolladores.add(persona);
                    Iterator<desarrollador> nombres= desarrolladores.iterator();
                    nombre = nombres.next().getNombre();*/
                    
                
                
            }
            while (opcion==2){ 
                System.out.println("\nIngrese el nombre y luego el grupo al que pertenece. Puede ingresar varios grupos, pero estos se deben ingresar en orden y separadas por coma(,)."); 
                System.out.println("\nNombre: Marlon\nGrupo: 2,3"); 
                System.out.print("\nNombre:"); 
                nombre = scan.next();
                System.out.print("\n\n1)Desarrolladores Java.\n2)Desarrolladores Web.\n3)Desarrolladores Celulares.\n"); 
                System.out.print("\nGrupo:");
                //se pone dos veces la instruccion para que se vacie el buffer 
                grupo = scan.nextLine();
                grupo = scan.nextLine();
                if (grupo.equals("1")){ java=1; web=0; celulares=0;  opcion = 5; SETDesarrollador persona = new SETDesarrollador(nombre, java, web, celulares); desarrolladores.add(persona); }
                else if (grupo.equals("2")){ java=0; web=1; celulares=0; opcion = 5; SETDesarrollador persona = new SETDesarrollador(nombre, java, web, celulares); desarrolladores.add(persona); }
                else if (grupo.equals("3")){ java=0; web=0; celulares=1;  opcion = 5; SETDesarrollador persona = new SETDesarrollador(nombre, java, web, celulares); desarrolladores.add(persona); }
                else if (grupo.equals("1,2")){ java=1; web=1; celulares=0; opcion = 5; SETDesarrollador persona = new SETDesarrollador(nombre, java, web, celulares); desarrolladores.add(persona); }
                else if (grupo.equals("1,3")){ java=1; web=0; celulares=1; opcion = 5; SETDesarrollador persona = new SETDesarrollador(nombre, java, web, celulares); desarrolladores.add(persona); }
                else if (grupo.equals("2,3")){ java=0; web=1; celulares=1; opcion = 5; SETDesarrollador persona = new SETDesarrollador(nombre, java, web, celulares); desarrolladores.add(persona); }
                else { System.out.println("La forma ingresada de los grupos no es correcta, por favor intente de nuevo. Recuerde que debe ingresar en orden los grupos y separados por coma(,)."); }
            }
            while (opcion==3){
                Iterator<SETDesarrollador> nombres= desarrolladores.iterator();
                Iterator<SETDesarrollador> javas= desarrolladores.iterator();
                Iterator<SETDesarrollador> webs= desarrolladores.iterator();
                Iterator<SETDesarrollador> celular= desarrolladores.iterator();
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
