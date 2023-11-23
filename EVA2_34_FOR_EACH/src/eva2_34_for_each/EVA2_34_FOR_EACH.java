/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_34_for_each;

/**
 *
 * @author selva
 */
public class EVA2_34_FOR_EACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int array[]=new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random()*100);
        }
        for (int valor : array) {
            System.out.println("["+valor+"]");
        }
    }
    
}
