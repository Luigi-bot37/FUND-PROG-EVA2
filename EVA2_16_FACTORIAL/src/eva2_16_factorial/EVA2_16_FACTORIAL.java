/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_factorial;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EVA2_16_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese el numero limite de veces");
        int veces = captura.nextInt();
        int factorial = 1;
        for (int i = 1; i <= veces; i++) {
            System.out.print(i + " - ");
            factorial = factorial * i;
        }
        System.out.println(" ");
        System.out.println("Factorial de " + veces + " es: " + factorial);
        System.out.println(" ");
        factorial = 1;
        for (int i = veces; i >= 1; i--) {
            System.out.print(i + " - ");
            factorial = factorial * i;
        }
        System.out.println(" ");
        System.out.println("Factorial de " + veces + " es: " + factorial);
        System.out.println(" ");
    }
}
