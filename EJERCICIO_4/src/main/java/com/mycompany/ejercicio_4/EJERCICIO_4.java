package com.mycompany.ejercicio_4;

public class EJERCICIO_4 {
    
    public static void main(String[] args) {
        
        int edad_juan = 9;       
        int edad_alberto =(edad_juan*2)/3;
        int edad_ana =(edad_juan*4)/3;
        int edad_mama = edad_juan + edad_alberto + edad_ana;

        System.out.println("La edad de Juan es: " + edad_juan);
        System.out.println("La edad de Alberto: " + edad_alberto);
        System.out.println("La edad de Ana: " + edad_ana);
        System.out.println("La edad de la mamá de Juan es: " + edad_mama);
        
    }
}
