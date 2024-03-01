
package hotel;
//import java.util.Scanner;

public class Rooms {
    static Lectura mn = new Lectura();
    static int numeroHabitacion;
    static int ubicacion;
    //private Scanner jk = new Scanner(System.in);
    
    public static void DatosHabitacion(){
        numeroHabitacion = mn.leerInt("Ingrese el número de la habitación: ");
        ubicacion = mn.leerInt("Ingrese la ubicación de la habitación: ");
    }
    
    
}