/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_promedio_califas;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EVA2_15_PROMEDIO_CALIFAS {

    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        int cantcalif;

        //VARIABLE ACUMULADORA
        int sumcalif = 0;
        System.out.println("Cuantas notas se ingresaran?");
        cantcalif = captura.nextInt();

        for (int i = 1; i <= cantcalif; i++) {
            System.out.println("Ingrese la calificacion:");
            int calif = captura.nextInt();
            //ACUMULADOR
            sumcalif = sumcalif + calif;
            //sumcalif+=numcalif;

        }
        //si el divisor es entero, el resultado tambien sera entero
        double prom = sumcalif / (cantcalif * 1.0);
        System.out.println("Promedio de notas:"+ prom);
    }

}
