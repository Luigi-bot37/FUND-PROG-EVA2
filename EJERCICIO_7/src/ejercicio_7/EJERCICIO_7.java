/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EJERCICIO_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int num;
        int tamano;
        int mayor = 0;
        int menor = 0;
        ArrayList<Integer> numeros = new ArrayList<>();
        do {
            System.out.println("Ingrese un numero : ");

            num = captu.nextInt();
            if (num >= 0) {
                numeros.add(num);
            }
        } while (num >= 0);
        tamano = numeros.size();
        System.out.println("Tamano de la cadena: " + tamano);
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > mayor) {
                mayor = numeros.get(i);
            }
            if (numeros.get(i) < mayor) {
                menor = numeros.get(i);
            }
        }

        /*int[] arreglo = new int[numeros.size()];
        for (int i = numeros.size(); i > 1; i--) {
            arreglo[i] = numeros.get(i);
            if (arreglo[i] > mayor) {

                mayor = 0;
                mayor += arreglo[i];
            } else if (arreglo[i] < mayor) {
                menor = 0;
                menor += arreglo[i];
            }

        }
         */
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        /* int num[]=;
        int mayor=0;
        // int i;
        do {
            System.out.println("Ingrese un numero");
            num = captu.nextInt();
            
            if (num > mayor){
                mayor=0;
         
            }
      
            //   }
        } while (num >= 0);
      System.out.println("Numero mayor ingresado: "+mayor); */
    }

}
