/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_while_infinito;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EVA2_19_WHILE_INFINITO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captura = new Scanner(System.in);
        int captu = 0;
        int num = 100;

        while (true) {//Ciclo infinito, por si solo NUNCA se detendra
            System.out.println("Ingrese el numero:");
            captu = captura.nextInt();
            if (captu == num) {
                System.out.println("Lo lograste :3");
                break;//ROMPER ---> Detiene la ejecucion del ciclo
            }

        }
    }

}
