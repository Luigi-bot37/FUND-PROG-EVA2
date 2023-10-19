/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_else_if;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EVA2_8_ELSE_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PEDIR NUMERO DEL MES
        int mes;
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes: ");
        mes = captura.nextInt();
        //Evaluar el mes
       // if ((mes >= 1) && (mes <= 12)) {//(mes>0) && (mes<13)
          //  System.out.println("El mes " + mes + " es valido ;3");
            
            if(mes==1)
                System.out.println("Enero");
            else if(mes==2)
                System.out.println("Febrero");
            else if(mes==3)
                System.out.println("Marzo");
            else if(mes==4)
                System.out.println("Abril;");
            else if(mes==5)
                System.out.println("Mayo");
            else if(mes==6)
                System.out.println("Junio");
            else if(mes==7)
                System.out.println("Julio");
            else if(mes==8)
                System.out.println("Agosto");
            else if(mes==9)
                System.out.println("Septiembre");
            else if(mes==10)
                System.out.println("Octubre");
            else if(mes==11)
                System.out.println("Noviembre");
            else if(mes==12)
                System.out.println("Diciembre");
            else
                System.out.println("El numero "+ mes + " no es valido :[");
     //   } else 
     //       System.out.println("El mes " + mes + " no es valido :C");
        
    }

}
