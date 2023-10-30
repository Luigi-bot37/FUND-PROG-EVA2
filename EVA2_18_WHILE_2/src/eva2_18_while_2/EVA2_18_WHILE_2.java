/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_while_2;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EVA2_18_WHILE_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captura = new Scanner(System.in);
        int num = 100;
        int captu = 0;

        while (captu != num) {
            System.out.println("Ingrese Numero:");
            captu = captura.nextInt();
            if (captu == num) 
                System.out.println("Lo lograste :3");
            
        }
    }

}
