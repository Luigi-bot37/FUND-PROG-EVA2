/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_do_while;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EVA2_21_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captura = new Scanner(System.in);
        int num;
        //Asegura al menos una vez que se ejecutan las instrucciones del ciclo
        do {
            System.out.println("Ingrese un valor: ");
            num = captura.nextInt();
        } while (num != 100);
    }
}
