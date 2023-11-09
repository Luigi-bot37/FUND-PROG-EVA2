/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_validar_do_while;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EVA2_23_VALIDAR_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captura=new Scanner(System.in);
        int num;
        boolean valido;
        do{
           try{ 
               System.out.println("Ingrese  un valor entero:");
            num=Integer.parseInt(captura.nextLine());
           // num=captura.nextInt();
            valido=true;
           }
          catch(NumberFormatException e){
              System.out.println("Respuesta no valida");
              valido=false;
          }
                
            
        }while( valido==false);
    }
    
}
