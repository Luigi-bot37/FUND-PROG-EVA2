/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_22_do_while;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EVA2_22_DO_WHILE {

    final static String NOMBRE_USUARIO = "admin";
    final static String CLAVE = "admin";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captura = new Scanner(System.in);
        String usuario, clave;
        System.out.println(CLAVE);
        do {
            System.out.println("Ingrese usuario");
            usuario = captura.nextLine();
            System.out.println("Ingrese clave");
            clave = captura.nextLine();
        } while ((!usuario.equals(NOMBRE_USUARIO)) || (!clave.equals(CLAVE)));
    }

}
