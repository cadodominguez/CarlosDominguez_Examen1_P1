
package carlosdominguez_examen1;
import java.util.Scanner;
public class CarlosDominguez_Examen1 {

    public static void main(String[] args) {
        Scanner brazil = new Scanner (System.in);
        String Historialdebusqueda = "";
        boolean out = true;
        do {
            System.out.println("********MENU**********");    
            System.out.println("1. Ejercios de String ");
            System.out.println("2. Respuestas a preguntas ");
            System.out.println("3. Mostrar el historial del Menu ");
            System.out.println("4. Salir");
            int opcion = brazil.nextInt();
            switch (opcion) {
                case 1:
                    Historialdebusqueda += "-Ejercicos de String";
                    boolean out2 = true;
                    while (out2 == true) {
                        System.out.println("*******Submenu********");
                        System.out.println("1. Ejercicio 1 String");
                        System.out.println("2. Ejercicio 2 String ");
                        System.out.println("3. Salir del Submenu");
                        int opcion2 = brazil.nextInt();
                        switch (opcion2) {
                            case 1:
                                Historialdebusqueda += "-Ejercicio 1 String";
                                
                                break;
                            case 2:
                                Historialdebusqueda += "-Ejercicio 2 String";
                                
                                break;
                            case 3:
                                out2=false;
                                System.out.println("Saliendo del submenu.....");
                                break;    
                            default:
                                System.out.println("La opcion no es valida");
                        }
                    }
                    
                    break;
                case 2:
                    Historialdebusqueda += "-Respuestas de Preguntas";

                    
                    break;
                case 3:
                    Historialdebusqueda += "-Mostrar el historial del menu";
                    System.out.println(Historialdebusqueda);
                    break;
                case 4:
                    System.out.println("Saliendo.......");
                    out = false;
                    break;    
                default:
                    System.out.println("La opcion no es valida");
            }
        } while (out);
    }
    
}
