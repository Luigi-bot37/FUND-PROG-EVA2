/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_if2;

import java.util.Scanner;

public class EVA2_2_IF2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1.DECLARACION
        int num1;
        int num2;
        Scanner captura = new Scanner(System.in);
        //2.CAPTURA
        System.out.println("Ingrese el valor 1:");
        num1 = captura.nextInt();

        System.out.println("Ingrese el valor 2:");
        num2 = captura.nextInt();
        //3.ESTRCTURA CONDICIONAL
        if (num1 > num2) 
            System.out.println("El mas grande es: " + num1);//+ concatenar cadenas de texto
         else {
            if (num1 == num2) 
                System.out.println("Ambos valores son iguales.");
            else 
                System.out.println("El mayor es: " + num2);
            
        }
    }
}

