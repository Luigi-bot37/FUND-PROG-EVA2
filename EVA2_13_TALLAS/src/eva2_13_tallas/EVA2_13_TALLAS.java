/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_tallas;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EVA2_13_TALLAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese el numero de talla:");
        int talla = captura.nextInt();
        switch (talla) {
            case 29:
                System.out.println("Talla: Small");
                break;
            case 42:
                System.out.println("Talla: Medium");
                break;
            case 44:
                System.out.println("Talla: Large");
                break;
            case 48:
                System.out.println("Talla: X large");
                break;
            default:
                System.out.println("Esa talla no existe");
        }
    }

}
