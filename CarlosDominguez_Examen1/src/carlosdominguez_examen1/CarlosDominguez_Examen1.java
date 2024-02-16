
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
                    cadenaparoimpar(Cadenasinevaluar);
                    break;
                case 2:
                    Historialdebusqueda += "-Respuestas de Preguntas";
                    System.out.println("1. Describa el funcionamiento de los ciclor for, while y do while");
                    System.out.println(" Ciclo for : es un ciclo que repite n veces, se usa para trabajos con multiples repeticiones ");
                    System.out.println(" ciclo While : es un ciclo que se repite mientras su condicion sea valida ");
                    System.out.println("Ciclo Do while : es como el while pero la diferencia que inicia sin revisar la condicion sea valida");
                    System.out.println("2. Describa el funcionamiento de .charAt(), indexOf() y .legth()");
                    System.out.println(" .charAt() : es una funcion que permite elegir un char en una string o para leer un char");
                    System.out.println(" indexOF() : sirve para encontrar el numero en un String el cual es cuando se compara con otra por ejemplo en la palabr hola y usa el indexof de (la) el indexof es 2 ");
                    System.out.println(" .length () : es que se usa para medir la longitud de una cadena Por ejemplo en hola empezaria del 0 al 3");
                    System.out.println("3. Mencione 2 tipos de datos primitivos de java y cual es su uso");
                    System.out.println("Esta el Int : o numero entero son numero por ejemplo 244 o 144 se usa para funciones basicas por ejemplo dividir o multiplicar");
                    System.out.println("Tambien el boolean : es el que devuelve valores verdadero o falso , util para decisiones simples");
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
    public static void cadenaparoimpar (String Cadenasinevaluar){
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
    }
    
}
