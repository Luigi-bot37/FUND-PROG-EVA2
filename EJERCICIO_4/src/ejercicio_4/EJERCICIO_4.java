/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EJERCICIO_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu=new Scanner(System.in);
int num;
int respuesta;
        do {
            System.out.println("Ingrese un numero: ");
            num=captu.nextInt();
            if(num>0)
                System.out.println("Es positivo");
            else if(num<0)
                System.out.println("Es negativo");
            else
                System.out.println(num);
            System.out.println("Deseas continuar?");
            System.out.println("1 para si. 2 para no");
            respuesta=captu.nextInt();
            
        } while (respuesta==1);

    }

}
