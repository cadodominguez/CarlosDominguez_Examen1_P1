
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
                    brazil.nextLine();
                    Historialdebusqueda += "-Ejercicos de String";
                    System.out.println("Ingrese una cadena");
                    String Cadenasinevaluar = brazil.nextLine();
                    int sizeString = Cadenasinevaluar.length();
                    if (sizeString % 2 != 0) {
                        int mitaddelstring = Cadenasinevaluar.length()/2;
                        String mitad1 = Cadenasinevaluar.substring(0, mitaddelstring);
                        String mitad2 = Cadenasinevaluar.substring(mitaddelstring, Cadenasinevaluar.length());
                        System.out.println("Cadena Ingresada : "+Cadenasinevaluar);
                        System.out.println("Primera mitad : " + mitad1);
                        System.out.println("Segunda mitad : " + mitad2);
                        System.out.println("Cadena Resultante : " + mitad2 + mitad1);
                        System.out.println("");
                    }else{
                        int mitaddelstring = Cadenasinevaluar.length()/2;
                        String mitad1 = Cadenasinevaluar.substring(0, mitaddelstring);
                        String mitad2 = Cadenasinevaluar.substring(mitaddelstring, Cadenasinevaluar.length());
                        String modificada = "";
                        for (int i = 0; i < mitaddelstring; i++) {
                            modificada += mitad1.charAt(i);
                            modificada += "-";
                            modificada += mitad2.charAt(i);
                            if (i == mitaddelstring-1 ) {
                                modificada += " ";
                            }else{
                                modificada += "-";
                            }
                        }
                        System.out.println("Primera mitad : " + mitad1);
                        System.out.println("Segunda mitad : " + mitad2);
                        System.out.println("Cadena Resultante : "+ modificada);    
                        System.out.println("");
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
