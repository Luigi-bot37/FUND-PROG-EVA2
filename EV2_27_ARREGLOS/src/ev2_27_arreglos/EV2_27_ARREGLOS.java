/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ev2_27_arreglos;

/**
 *
 * @author selva
 */
public class EV2_27_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //acceso a los arreglos aleatorio
        //se accede a partir de un indice
        //el primer elemento es 0
        //la ultima pocision es n-1, n es el tamano del arreglo
        int[] arreglo = new int[10];
        //ACCEDER EN UN ARREGLO
        arreglo[0]=100;
        arreglo[1]=200;
        arreglo[2]=400;
        arreglo[3]=500;
        arreglo[5]=600;
        arreglo[6]=700;
        arreglo[7]=800;
        arreglo[8]=900;
        arreglo[9]=1000;
        System.out.println("valor en posicion 0: "+ arreglo[0]);
        
        String[] arregloCade=new String[5];
        arregloCade[0]="Hola";
        arregloCade[1]="";
        arregloCade[2]="mundo";
        arregloCade[3]="H";
        arregloCade[4]="cruel";
    }

}
