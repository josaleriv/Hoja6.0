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
        NameFactory nfactory = new NameFactory(); // instanciar la Factory
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
                if (opcion2==1 || opcion2==2 || opcion2==3) { opcion=5; desarrolladores=nfactory.getClase(opcion2); }
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
                if (grupo.equals("1")){ java=1; web=0; celulares=0;  opcion = 5; desarrollador persona = new desarrollador(nombre, java, web, celulares); desarrolladores.add(persona); }
                else if (grupo.equals("2")){ java=0; web=1; celulares=0; opcion = 5; desarrollador persona = new desarrollador(nombre, java, web, celulares); desarrolladores.add(persona); }
                else if (grupo.equals("3")){ java=0; web=0; celulares=1;  opcion = 5; desarrollador persona = new desarrollador(nombre, java, web, celulares); desarrolladores.add(persona); }
                else if (grupo.equals("1,2")){ java=1; web=1; celulares=0; opcion = 5; desarrollador persona = new desarrollador(nombre, java, web, celulares); desarrolladores.add(persona); }
                else if (grupo.equals("1,3")){ java=1; web=0; celulares=1; opcion = 5; desarrollador persona = new desarrollador(nombre, java, web, celulares); desarrolladores.add(persona); }
                else if (grupo.equals("2,3")){ java=0; web=1; celulares=1; opcion = 5; desarrollador persona = new desarrollador(nombre, java, web, celulares); desarrolladores.add(persona); }
                else { System.out.println("La forma ingresada de los grupos no es correcta, por favor intente de nuevo. Recuerde que debe ingresar en orden los grupos y separados por coma(,)."); }
            }
            while (opcion==3){
                Iterator<desarrollador> nombres= desarrolladores.iterator();
                Iterator<desarrollador> javas= desarrolladores.iterator();
                Iterator<desarrollador> webs= desarrolladores.iterator();
                Iterator<desarrollador> celular= desarrolladores.iterator();
                cantjava=0;
                cantweb=0;
                cantcelulares=0;
                while (nombres.hasNext()) {
                    nombre = nombres.next().getNombre();
                    java = javas.next().getJava();
                    web = webs.next().getWeb();
                    celulares = celular.next().getCelulares();
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
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
            int eleccionSET;
            int eleccionLista;
            int eleccion2 = 0;
            System.out.println("");
            System.out.println("Seleccione por medio del numero la implementacion de SET que desea utilizar\n1). HashSet\n2). TreeSet\n3). LinkedHashSet");
            eleccionSET= scan.nextInt();
            if (eleccionSET == 3){
                System.out.println("Que tipo de lista?\n1.Simplemente Encadenada\n2.Doblemente Encadenada\n3.Circular");
                eleccionLista=scan.nextInt();
                //se modifica el valor de eleccion dependiendo del tipo de lista
                if (eleccionLista==1){
                    eleccion2=1;
                }
                if (eleccionLista==2){
                    eleccion2=2;
                }
                if (eleccionLista==3){
                    eleccion2=3;
                }
            }
            /*
            eleccion = 1 es un ArrayList
            eleccion = 2 es un vector
            eleccion = 3 es una singly linked list
            eleccion = 4 es una double linked list
            eleccion = 5 es una circular list
            */
             //se instancia la clase factory
            SETFactory factorySet = new SETFactory();
            //se obtiene un stack de Int de acuerdo a la implementacio deseada
            Stack stackInt= factorySet.implementacion(eleccionSET);
    }
}
