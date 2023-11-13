/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_10;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EJERCICIO_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        boolean valido;
        do {
            valido = true;
            System.out.println("Escriba un numero");
            String numero = captu.nextLine();
            switch (numero) {
                case "uno":
                    System.out.println("Si es un numero");
                    break;
                case "dos":
                    System.out.println("Si es un numero");
                    break;
                case "tres":
                    System.out.println("Si es un numero");
                    break;
                case "cuatro":
                    System.out.println("Si es un numero");
                    break;
                case "cinco":
                    System.out.println("Si es un numero");
                    break;
                case "seis":
                    System.out.println("Si es un numero");
                    break;
                case "siete":
                    System.out.println("Si es un numero");
                    break;
                case "ocho":
                    System.out.println("Si es un numero");
                    break;
                case "nueve":
                    System.out.println("Si es un numero");
                    break;
                case "diez":
                    System.out.println("Si es un numero");
                    break;
                default:
                    System.out.println(numero + " no representa un numero");
                    valido = false;
                    break;
            }
        } while (valido == false);
    }

}
