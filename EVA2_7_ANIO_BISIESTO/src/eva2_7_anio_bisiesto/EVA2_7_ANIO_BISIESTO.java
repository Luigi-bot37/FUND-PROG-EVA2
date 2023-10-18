/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_anio_bisiesto;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EVA2_7_ANIO_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year, resi4, resi100, resi400;
        Scanner captura=new Scanner(System.in);
        System.out.println("Introduce the year: ");
        year=captura.nextInt();
        resi4=year % 4;
        resi100=year % 100;
        resi400=year % 400;
        //&& operador AND
        //|| operador OR
        //!= operador diferente a
        if((resi4==0)&&((resi100!=0)||(resi400==0)))
        System.out.println(year+" es bisiesto");
        else
        System.out.println(year+" no es bisiesto");
    }
    
}
