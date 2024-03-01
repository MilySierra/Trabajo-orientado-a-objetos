/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import java.util.Scanner;

public class Lectura {
    Scanner sc = new Scanner(System.in);
    public int leerInt(String mensaje){
        System.out.println(mensaje+": ");
        int dato = sc.nextInt();
        return dato;
    }
    public String leerString(String mensaje){
        System.out.println(mensaje+": ");
        String dato = sc.next();
        return dato;
    }
    
    public double leerDoble(String mensaje){
        System.out.println(mensaje);
        double dato = sc.nextDouble();
        return dato;
    }
    
    public float leerFloat(String mensaje){
        System.out.println(mensaje);
        float dato = sc.nextFloat();
        return dato;
    }

}


