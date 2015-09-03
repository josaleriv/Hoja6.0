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
public class driverSET {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        SETFactory setfactory = new SETFactory(); // instanciar la Factory
        AbstractSet tiposDesarrolladores = null;
        String nombre, grupo;
        int grupoJava, grupoWeb, grupoCelulares, totalJava, totalWeb, totalCelulares, opcionSET, opcionImplementacion;
        int x=0;
        int contador = 0;
        ArrayList<String> listaJava = new ArrayList<String>();
        ArrayList<String> listaWeb = new ArrayList<String>();
        ArrayList<String> listaCelulares = new ArrayList<String>();
        ArrayList<String> listaTotal = new ArrayList<String>();
        ArrayList<String> listaWebCelulares = new ArrayList<String>();
        ArrayList<String> listaWebCelulares2 = new ArrayList<String>();
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
                System.out.println("\n\nPor medio del numero, escoja un tipo de implementacion de SET:\n\n1) HashSet.\n2) TreeSet.\n3) LinkedHashSet.");
                opcionImplementacion = scan.nextInt();
                if (opcionImplementacion==1 || opcionImplementacion==2 || opcionImplementacion==3) { 
                    opcionSET=5; 
                    tiposDesarrolladores = setfactory.implementacion(opcionImplementacion); 
                }
                else { 
                    System.out.println("\nERROR. Ingresar el numero de su eleccion."); 
                }
            }
            while (opcionSET==2){ 
                System.out.println("\nIngrese el nombre:");  
                nombre = scan.next();
                System.out.print("\n1)Desarrolladores Java.\n2)Desarrolladores Web.\n3)Desarrolladores Celulares.\n"); 
                System.out.print("\nIngrese uno o mas tipos de desarrolladores. \n(De ser mas de uno colocar todos los numeros en la misma linea, sin espacios y sin comas).\n");
                //se pone dos veces la instruccion para que se vacie el buffer 
                grupo = scan.nextLine();
                grupo = scan.nextLine();
                if (grupo.equals("1")){ 
                    grupoJava=1; 
                    grupoWeb=0; 
                    grupoCelulares=0;  
                    opcionSET = 5; 
                    SETDesarrollador persona = new SETDesarrollador(nombre, grupoJava, grupoWeb, grupoCelulares); 
                    tiposDesarrolladores.add(persona); 
                }
                else if (grupo.equals("2")){ 
                    grupoJava=0; 
                    grupoWeb=1; 
                    grupoCelulares=0; 
                    opcionSET = 5; 
                    SETDesarrollador persona = new SETDesarrollador(nombre, grupoJava, grupoWeb, grupoCelulares); 
                    tiposDesarrolladores.add(persona); 
                }
                else if (grupo.equals("3")){ 
                    grupoJava=0; 
                    grupoWeb=0; 
                    grupoCelulares=1;  
                    opcionSET = 5; 
                    SETDesarrollador persona = new SETDesarrollador(nombre, grupoJava, grupoWeb, grupoCelulares); 
                    tiposDesarrolladores.add(persona); 
                }
                else if (grupo.equals("12")||grupo.equals("21")){ 
                    grupoJava=1; 
                    grupoWeb=1; 
                    grupoCelulares=0; 
                    opcionSET = 5; 
                    SETDesarrollador persona = new SETDesarrollador(nombre, grupoJava, grupoWeb, grupoCelulares); 
                    tiposDesarrolladores.add(persona); 
                }
                else if (grupo.equals("13")||grupo.equals("31")){ 
                    grupoJava=1; 
                    grupoWeb=0; 
                    grupoCelulares=1; 
                    opcionSET = 5; 
                    SETDesarrollador persona = new SETDesarrollador(nombre, grupoJava, grupoWeb, grupoCelulares); 
                    tiposDesarrolladores.add(persona); 
                }
                else if (grupo.equals("23")||grupo.equals("32")){ 
                    grupoJava=0; 
                    grupoWeb=1; 
                    grupoCelulares=1; 
                    opcionSET = 5; 
                    SETDesarrollador persona = new SETDesarrollador(nombre, grupoJava, grupoWeb, grupoCelulares); 
                    tiposDesarrolladores.add(persona); 
                }
                else if (grupo.equals("123")||grupo.equals("132")||grupo.equals("312")||grupo.equals("321")||grupo.equals("213")||grupo.equals("231")){ 
                    grupoJava=1; 
                    grupoWeb=1; 
                    grupoCelulares=1; 
                    opcionSET = 5; 
                    SETDesarrollador persona = new SETDesarrollador(nombre, grupoJava, grupoWeb, grupoCelulares); 
                    tiposDesarrolladores.add(persona); 
                }
                else { 
                    System.out.println("ERROR. Ingrese alguna de las opciones, sin comas ni espacios."); 
                }
            }
            while (opcionSET==3){
                Iterator<SETDesarrollador> iteratorNombre= tiposDesarrolladores.iterator();
                Iterator<SETDesarrollador> iteratorJava= tiposDesarrolladores.iterator();
                Iterator<SETDesarrollador> iteratorWeb= tiposDesarrolladores.iterator();
                Iterator<SETDesarrollador> celular= tiposDesarrolladores.iterator();
                totalJava=0;
                totalWeb=0;
                totalCelulares=0;
                while (iteratorNombre.hasNext()) {
                    nombre = iteratorNombre.next().getNombre();
                    grupoJava = iteratorJava.next().getDesarrolladoresJava();
                    grupoWeb = iteratorWeb.next().getDesarrolladoresWeb();
                    grupoCelulares = celular.next().getDesarrolladoresCelulares();
                    listaTotal.add(nombre);
                    if (grupoJava==1){
                        totalJava = totalJava + 1;
                        listaJava.add(nombre);
                    }
                    if (grupoWeb==1){
                        totalWeb = totalWeb + 1;
                        listaWeb.add(nombre);
                    }
                    if (grupoCelulares==1){
                        totalCelulares = totalCelulares +1;
                        listaCelulares.add(nombre);
                    }
                    if ((grupoCelulares==1)&(grupoWeb==1)){
                        if(grupoJava==1){}
                        else{
                            listaWebCelulares.add(nombre);   
                        }
                    }
                    if ((grupoJava==1)&(grupoWeb==1)){
                        contador++;
                    }
                    if ((grupoCelulares==1)||(grupoWeb==1)){
                        listaWebCelulares2.add(nombre);
                    }
                }
                System.out.println("\na). Desarrolladores Java, Web y Celulares: ");
                for(int i = 0;i<listaTotal.size();i++){
                    System.out.print(listaTotal.get(i)+", ");
                }
                System.out.println("\n\nb). Desarrolladores Java: ");
                for(int i = 0;i<listaJava.size();i++){
                    System.out.print(listaJava.get(i)+", ");
                }
                System.out.println("\n\nc). Desarrolladores Web y Celulares: ");
                for(int i = 0;i<listaWebCelulares.size();i++){
                    System.out.print(listaWebCelulares.get(i)+", ");
                }
                System.out.println("\n\nd). Desarrolladores Web o Celulares: ");
                for(int i = 0;i<listaWebCelulares2.size();i++){
                    System.out.print(listaWebCelulares2.get(i)+", ");
                }
                if(contador==listaJava.size()){
                    System.out.println("\n\ne). El conjunto de desarrolladores de java SI es un subconjunto de desarrolladores Web");
                }
                else{
                    System.out.println("\n\ne). El conjunto de desarrolladores de java NO es un subconjunto de desarrolladores Web");
                }
                if(totalJava<totalWeb){
                    if(totalWeb>totalCelulares){
                        System.out.println("\nf). El mayor es el conjunto de desarrolladores Web: ");
                        for(int i = 0;i<listaWeb.size();i++){
                            System.out.print(listaWeb.get(i)+", ");
                        }
                        Collections.sort(listaWeb);
                        System.out.println("\ng). En orden ascendente: ");
                        for(int i = 0;i<listaWeb.size();i++){
                            System.out.print(listaWeb.get(i)+", ");
                        }
                    }
                    if(totalWeb<totalCelulares){
                        System.out.println("\nf). El mayor es el conjunto de desarrolladores de Celulares: ");
                        for(int i = 0;i<listaCelulares.size();i++){
                            System.out.print(listaCelulares.get(i)+", ");
                        }
                        Collections.sort(listaCelulares);
                        System.out.println("\ng). En orden ascendente: ");
                        for(int i = 0;i<listaCelulares.size();i++){
                            System.out.print(listaCelulares.get(i)+", ");
                        }
                    }
                }
                if(totalWeb<totalJava){
                    if(totalJava>totalCelulares){
                        System.out.println("\nf). El mayor es el conjunto de desarrolladores Java: ");
                        for(int i = 0;i<listaJava.size();i++){
                            System.out.print(listaJava.get(i)+", ");
                        }
                        Collections.sort(listaJava);
                        System.out.println("\ng). En orden ascendente: ");
                        for(int i = 0;i<listaJava.size();i++){
                            System.out.print(listaJava.get(i)+", ");
                        }
                    }
                    if(totalJava<totalCelulares){
                        System.out.println("\nf). El mayor es el conjunto de desarrolladores de Celulares: ");
                        for(int i = 0;i<listaCelulares.size();i++){
                            System.out.print(listaCelulares.get(i)+", ");
                        }
                        Collections.sort(listaCelulares);
                        System.out.println("\ng). En orden ascendente: ");
                        for(int i = 0;i<listaCelulares.size();i++){
                            System.out.print(listaCelulares.get(i)+", ");
                        }
                    }
                }
                else{
                    System.out.println("\nf). No hay conjunto mayor de desarrolladores. ");
                }
                break;
            }
        }
    }
}
