/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EJERCICIO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captura = new Scanner(System.in);

        int num2;

        System.out.println("Ingrese el limite mayor");
        num2 = captura.nextInt();
        System.out.println("Ingrese un el limite menor");
        for (int num1 = captura.nextInt(); num1 <= num2; num1++) {
            int residuo = num1 % 2;
            if(residuo==0)
            System.out.print(num1 + " - ");
           
        }
    }

}
