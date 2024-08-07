
package com.mycompany.ejercicio_12;

public class EJERCICIO_12 {

    public static void main(String[] args) {
        double hora,vh,reten,retenT,brut,net;
        
        hora=48;
        vh=5000;
        reten=0.125;
        brut=hora*vh;
        retenT=reten*brut;
        net=brut-retenT;
        
        System.out.println("El salario bruto del trabajador es: "+brut);
        System.out.println("El total de retención en la fuente es: "+retenT);
        System.out.println("El salario neto del trabajador es: "+ net);
    }
}
