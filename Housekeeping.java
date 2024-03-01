/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

//import hotel.Lectura;


public class Housekeeping extends Rooms{
    static Lectura ln = new Lectura();
    static String nombre;
    static int ID;
    static boolean limpiar;
    //static Rooms habitacion;
    
    public static void DatosMucama(){
        nombre = ln.leerString("Ingrese su nombre: ");
        ID = ln.leerInt("Ingrese su ID: ");  
        //int numeroHabitacion = ln.leerInt("Ingrese el número de la habitación: ");
        //String ubicacionHabitacion = ln.leerString("Ingrese la ubicación de la habitación (piso): ");
        //habitacion = new Rooms(numeroHabitacion, ubicacionHabitacion); 
    }
    
    public void LimpiarLimpieza(){
        numeroHabitacion = ln.leerInt("¿Qué número de habitación está limpiando? ");
        System.out.println("La mucama" + nombre + "está limpiando la habitación " + numeroHabitacion + "en"
                + "el piso" + ubicacion);
        limpiar=true;
    }

    public boolean VerificarLimpieza(){
        if (limpiar==true){
        }
            return true;
    }
    

}
