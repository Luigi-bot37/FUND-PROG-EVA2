/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EJERCICIO_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        String letra;
        do {
            System.out.println("Ingrese una letra");
            letra = captu.nextLine();
            if ((letra.equals("a")) || (letra.equals("e")) || (letra.equals("i"))) {
                System.out.println("Es vocal");
            } else if ((letra.equals("o")) || (letra.equals("u"))) {
                System.out.println("Es vocal");
            } else {
                System.out.println("Es consonante");
            }
        } while (!(letra.equals("")));
    }

}
