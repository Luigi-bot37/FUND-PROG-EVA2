/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_recorrer_cadena;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EVA2_24_RECORRER_CADENA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cade;
         Scanner captura=new Scanner(System.in);
         System.out.println("Ingrese un texto");
         cade=captura.nextLine();
         for (int i = 0; i < cade.length(); i++) {
             System.out.println(cade.charAt(i)); 
        }
    }
    
}
