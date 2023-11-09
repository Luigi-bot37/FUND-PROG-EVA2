/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_31_uso_arreglos_2;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EVA2_31_USO_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[] = new int[10];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
        System.out.println("Que valor necesitas?");
        Scanner captu = new Scanner(System.in);
        int num = captu.nextInt();
        int posi = -1;
        //busqueda
        for (int i = 0; i < arreglo.length; i++) {
            if (num == arreglo[i]) {
                posi = i;

                break;

                //}else{
                //   System.out.println("El valor no ha sido encontrado");  
                // break;
            }

        }
        if (posi != -1) {
            System.out.println("El valor se euncuentra en la posicion: [" + posi + "]");
        } else {
            System.out.println("EL valor no se ha encontrado");
        }

    }

}
