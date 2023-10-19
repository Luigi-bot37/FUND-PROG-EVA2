/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_cadenas;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EVA2_11_CADENAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captura=new Scanner(System.in);
        System.out.println("Ingrese texto:");
        String cade=captura.nextLine();
        if(cade.equals("HOLA"))
            System.out.println("Las cadenas son iguales");
        else
            System.out.println("Las cadenas NO son iguales");
    }
    
}
