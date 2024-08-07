package com.mycompany.pruebafiguras;

public class Circulo {
    int radio;
    
    public Circulo(int radio){
        this.radio=radio;
    }
    
    /* Métodos*/
    
    public double calcularArea(){
        return Math.PI * Math.pow(radio,2);
    }
    
    public double calcularPerimetro(){
        return Math.PI*2*radio;
    }
}
