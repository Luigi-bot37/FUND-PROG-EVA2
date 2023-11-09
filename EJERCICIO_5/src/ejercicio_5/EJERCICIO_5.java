/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EJERCICIO_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu=new Scanner(System.in);
        int potencia=1;
        System.out.println("Ingrese la base:");
        int base=captu.nextInt();
        System.out.println("Ingrese el exponente: ");
        int exponente=captu.nextInt();
        for (int i = 1; i <=exponente; i++) {
            potencia*=base;
        }
        System.out.println(base+ " elevado a "+exponente+ " es: "+ potencia);
    }
    
}
