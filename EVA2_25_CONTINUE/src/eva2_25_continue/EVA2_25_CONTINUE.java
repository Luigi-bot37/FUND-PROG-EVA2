/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_25_continue;

/**
 *
 * @author invitado
 */
public class EVA2_25_CONTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //continue-->interrumpe la iteracion actual
        for (int i = 1; i <=10; i++) {
            if(i==5)
                continue;
            System.out.print(i + " - ");
        }
        System.out.println("");
        //break--> interrumpe la ejecucion del ciclo
        for (int i = 1; i <=10; i++) {
            if(i==5)
                break;
            System.out.print(i+" - ");
        }
    }
    
}
