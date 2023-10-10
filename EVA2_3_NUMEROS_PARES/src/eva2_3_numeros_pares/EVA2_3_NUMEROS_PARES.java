/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EVA2_3_NUMEROS_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor, residuo;
        Scanner captura = new Scanner(System.in);

        System.out.println("INgrese valor a evaluar:");
        valor = captura.nextInt();
        residuo = valor % 2;//% ---> Operacion de modulo. Nos da el residuo.
        if (residuo == 0) {
            System.out.println("E numero es par. :]");
        } else {
            System.out.println("El numero es impar. :D");
        }
    }

}
