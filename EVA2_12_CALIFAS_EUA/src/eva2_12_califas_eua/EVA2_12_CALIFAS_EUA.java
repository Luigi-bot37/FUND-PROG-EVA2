/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_califas_eua;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EVA2_12_CALIFAS_EUA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese su calificacion:");
        int calif = captura.nextInt();

        if ((calif >= 0) && (calif <= 100)) {
            if ((calif >= 90) && (calif <= 100)) {
                System.out.println("Calificacion: A");
            } else if ((calif >= 80) && (calif <= 89)) {
                System.out.println("Calificacion: B");
            } else if ((calif >= 70) && (calif <= 79)) {
                System.out.println("Calificacion: C");
            } else if ((calif >= 60) && (calif <= 69)) {
                System.out.println("Calificacion: D");
            } else {
                System.out.println("Calificacion: F");
            }
        } else 
            System.out.println("Numero no valido");
        

    }

}
