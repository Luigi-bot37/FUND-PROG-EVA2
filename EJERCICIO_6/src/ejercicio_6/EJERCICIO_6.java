/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EJERCICIO_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int num;
        int residuo;
        System.out.println("Ingrese un numero: ");
        num = captu.nextInt();
        String binario = "";
        /* int binario[];
        for (int i = 0; i < 10; i++) {
            while(true){
                 residuo    
            }
        }
         */

        do {
            residuo = num % 2;

            binario = residuo + binario;
            num = num / 2;
        } while (num > 0);
        System.out.println(binario);
    }
}
