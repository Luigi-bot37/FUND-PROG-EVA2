/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_30_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EVA2_30_USO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[]listaProd=new String[10];
        listaProd[0]="Tacos";
        listaProd[1]="Tortas";
        listaProd[2]="Tamales";
        listaProd[3]="Tlacoyos";
        listaProd[4]="Tlayudas";
        listaProd[5]="Tampiquenas";
        listaProd[6]="Tortas ahogadas";
        listaProd[7]="Chilaquiles";
        listaProd[8]="T-bone";
        listaProd[9]="Tripas";
        /*Si tenemos previamente los datos, se recomienda hacerlo asi
        String[] listaprod={"Tacos", "Tortas"};
        */
        double listaPrecio[]={30, 35, 10, 20, 20, 20, 50, 60, 45, 100};
        System.out.println("-----MENU-----");
        for (int i = 0; i < listaProd.length; i++) {
            System.out.println(i+" -"+listaProd[i]+": $"+listaPrecio[i]);
        }
        Scanner captu=new Scanner(System.in);
        int opc, cant;
        System.out.println("Que deseas ordenar?");
        opc=captu.nextInt();
        System.out.println("Que deseas ordenar?");
        cant=captu.nextInt();
        System.out.println("Tu total es de: $"+(cant*listaPrecio[opc]));
    }
    
}
