/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EJERCICIO_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = captu.nextInt();
        int suma=0;
        for (int i = 1; i <= num; i++) {
suma+=i;
        }
        System.out.println("Sumatoria del 1 al "+num+": "+suma);
    }

}
