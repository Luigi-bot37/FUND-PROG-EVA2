/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_and_or_operadores;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EVA2_6_AND_OR_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1.CAPTURA LA CALIFICACION
        int calif;
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese su promedio:");
        calif = captura.nextInt();
        if ((calif >= 0) && (calif <= 100)) {
            System.out.println("La calificacion " + calif + " es valida");
            if (calif >= 70) 
                System.out.println("Aprobaste :D");
            else 
                System.out.println("Reprobaste :[");
            
        } else {
            System.out.println("La calificacion " + calif + " no es valida");
        }

    }

}
