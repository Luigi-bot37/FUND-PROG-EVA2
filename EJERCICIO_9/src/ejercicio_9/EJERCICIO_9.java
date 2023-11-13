/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_9;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EJERCICIO_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int cant = 0;
        System.out.println("Ingrese una cadena de texto: ");
        String palabra = captu.nextLine();
        System.out.println("Ingrese la letra a buscar:");
        char letra = captu.next().charAt(0);
        for (int i = 0; i < palabra.length(); i++) {
            if (letra == palabra.charAt(i)) {
                cant = cant + 1;
            }
        }
        /*String letra=captu.nextLine();
        for (int i = 0; i < palabra.length(); i++) {
            if(letra.equals(palabra.charAt(i)))
                cant++;
        }*/
        System.out.println("veces que aparece '" + letra + "' : " + cant);
    }

}
