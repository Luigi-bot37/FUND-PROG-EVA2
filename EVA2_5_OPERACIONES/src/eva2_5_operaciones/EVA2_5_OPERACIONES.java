/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_operaciones;

/**
 *
 * @author selva
 */
public class EVA2_5_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma, val1, val2;

        val1 = 20;
        val2 = 10;
        suma = val1 + val2;
        System.out.println("-----VALORES-----");
        System.out.println("Valor 1: " + val1);
        System.out.println("Valor 2: " + val2);

        System.out.println("-----SUMA-----");
        System.out.println("LA suma es: " + suma);

        int resta = val1 - val2;
        System.out.println("-----RESTA-----");
        System.out.println("La resta es: " + resta);

        int multi = val1 * val2;
        System.out.println("-----MULTIPLICACION-----");
        System.out.println("La multiplicacion es: " + multi);

        int divi;
        val1 = 13;
        val2 = 2;
        divi = val1 / val2;
        System.out.println("-----VALORES-----");
        System.out.println("Valor 1: " + val1);
        System.out.println("Valor 2: " + val2);
        System.out.println("-----DIVISION-----");
        System.out.println("La division es: " + divi);
        int residuo = val1 % val2;
        System.out.println("El residuo es: " + residuo);
        double resu = val1 / val2;
        System.out.println("La division es: " + resu);

        double val2double = 2;
        resu = val1 / val2double;
        System.out.println("La division de 11/2.0 es: " + resu);

        double potencia = Math.pow(5, 2);
        System.out.println("-----POTENCIA-----");
        System.out.println("La potencia de 5 es: " + potencia);

        double raiz = Math.pow(100, 0.5);
        System.out.println("-----RAIZ CUADRADA-----");
        System.out.println("La raiz de 100 es: " + raiz);
        double resul = (-6) * (3 * Math.pow(5, 2) * (9 * 3 - 13) - Math.pow(121, 0.5) + 30);
        //resul = (-6) * (3 * 25 * (27- 13) - 11 + 30);
        //resul = (-6) * (75 * 14 - 11 + 30);
        //resul = (-6) * (1050 - 11 + 30);
        //resul = (-6) * (1069);
        //resul = -6414;
        System.out.println("-----JERARQUIA DE OPERACIONES-----");
        System.out.println(resul);
        double a = 3, b = 5, c = 2, x1, x2;
        x1 = ((-1 * b) - (Math.pow(((Math.pow(b, 2)) - (4 * a * c)), 0.5))) / (2 * a);
        //x1=((-1*5)-(Math.pow(((Math.pow(5, 2))-(4*3*2)), 0.5)))/(2*3);
        // x1=((-5)-(Math.pow(((25)-(12*2)), 0.5)))/(6);
        // x1=((-5)-(Math.pow((25-24), 0.5)))/6;
        //x1=((-5)-(Math.pow(1, 0.5)))/6;
        // x1=(-5- 1)/6;
        // x1=-6/6=-1;

        x2 = ((-1 * b) + (Math.pow(((Math.pow(b, 2)) - (4 * a * c)), 0.5))) / (2 * a);
        //x2=((-1*5)+(Math.pow(((Math.pow(5, 2))-(4*3*2)), 0.5)))/(2*3);
        // x2=((-5)+(Math.pow(((25)-(12*2)), 0.5)))/(6);
        // x2=((-5)+(Math.pow((25-24), 0.5)))/6;
        //x2=((-5)+(Math.pow(1, 0.5)))/6;
        // x2=(-5+ 1)/6;
        // x2=-4/6=-0.6666...;
        System.out.println("-----FORMULA GENERAL-----");
        System.out.println("a= 3 --- b= 5 --- c= 2");
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);

    }

}
