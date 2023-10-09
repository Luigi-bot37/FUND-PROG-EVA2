/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_if;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EVA2_1_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1.DECLARACION
        int calif;
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese calificacion:");
        //2.ENTRADA Y EVALUACION DE EXPRESION
        calif = captura.nextInt();

        if (calif >= 70) {//if(expresion a evaluar)
            //Usar llaves cuando hay mas de UNA instruccion
            //ESTE BLOQUE SIEMPRE ES VERDADERO
            System.out.println("APROBADO");
            System.out.println("NICE");
        } else //else --> si no. ES OPCIONAL
        //Este bloque SIEMPRE es falso
        {
            System.out.println("REPROBADO: A CHAMBEAR");
        }
    }

}
