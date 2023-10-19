/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_carreras;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EVA2_10_CARRERAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captura=new Scanner(System.in);
        System.out.println("Ingrese las siglas de su carrera:");
        String carrera=captura.nextLine();
        switch(carrera){
            case "ISC":
                System.out.println("Ingenieria en Sistemas Computacionales");
                break;
            case "INF":
                System.out.println("Ingenieria Informatica");
                break;
            case "LA":
                System.out.println("Licenciatura en Administracion");
                break;
            case "ARQ":
                System.out.println("Arquitectura");
                break;
            case "IND":
                System.out.println("Ingenieria Industrial");
                break;
            case "IDI":
                System.out.println("Ingenieria en Disenio Industrial");
                break;
            case "IGE":
                System.out.println("Ingenieria en Gestion Empresarial");
                break;
            default:
                System.out.println("Esa carrera no existe");
                     
        }
    }
    
}
