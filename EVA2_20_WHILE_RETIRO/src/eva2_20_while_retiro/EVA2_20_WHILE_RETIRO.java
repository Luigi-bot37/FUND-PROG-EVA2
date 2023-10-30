/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_while_retiro;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EVA2_20_WHILE_RETIRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int money = 1000;
        Scanner captura = new Scanner(System.in);

        while (money > 0) {//MIentras haya saldo, se puede retirar
            System.out.println("Cuanto desea retirar?");
            int retiro = captura.nextInt();
            //ACUMULADOR
            //money=money-retito;
            money -= retiro;
            System.out.println("Su saldo actual es de: $" + money);
        }
    }

}
