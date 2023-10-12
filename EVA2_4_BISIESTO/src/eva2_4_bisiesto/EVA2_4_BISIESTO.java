package eva2_4_bisiesto;

import java.util.Scanner;

public class EVA2_4_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1.DECLARACION
        int year, residuo;
        Scanner captura = new Scanner(System.in);
        //2.
        System.out.println("Ingrese el año a evaluar:");
        year = captura.nextInt();
        residuo = year % 4;
        if (residuo == 0) {//Verdad: divisible entre 4
            residuo = year % 100;
            if(residuo==0){//Verdad: divisible entre 100
                residuo=year %400;
                if(residuo==0){//Verdad: divisible entre 400
                    System.out.println("Año bisiesto");
                }else
                    System.out.println("El año no es bisiesto");
            }else
                System.out.println("Es año bisiesto ");
         
            
        }else
            System.out.println("No es bisiesto");
        
        
    }
    
}
