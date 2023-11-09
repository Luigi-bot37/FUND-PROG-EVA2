/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EVA2_28_USO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant;
        int[] calif;//el arreglo no existe
        Scanner captu = new Scanner(System.in);
        System.out.println("Cuantas notas capturaras?");
        cant = captu.nextInt();
        calif=new int[cant];
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese la nota:");
            calif[i]=captu.nextInt();
        }
        for (int i = 0; i < cant; i++) {
            System.out.print("["+calif[i]+"]");
        }
        
        
    }

}
