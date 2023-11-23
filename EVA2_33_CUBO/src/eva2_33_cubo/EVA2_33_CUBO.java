/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_33_cubo;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EVA2_33_CUBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int[][][] cubo = new int[3][4][6];

        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {

                    cubo[i][j][k] = (int) (Math.random() * 100);

                }

            }
        }

        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    System.out.print("[" + cubo[i][j][k] + "]");

                }
                System.out.println("");
            }
            System.out.println("");
            System.out.println("");
        }
        /* int cubo[][][] = new int[3][4][6];
        System.out.println(cubo.length);

        //colocar datos
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    cubo[i][j][k] = (int) (Math.random() * 100);
                    System.out.print("[" + cubo[i][j][k] + "]");
                }
                System.out.println(" ");
              
            }
            System.out.println(" ");
            System.out.println(" ");
        }*/
 /*//impresion   
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    System.out.print("["+cubo[i][j][k]+"]");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
            System.out.println(" ");*
        }*/
    }

}
