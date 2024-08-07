package com.mycompany.pruebafiguras;

public class TrianguloRectangulo {
    int base;
    int altura;
    
    public TrianguloRectangulo(int base, int altura){
        
        this.base=base;
        this.altura=altura;
        
        
    }
    
    public double calcularArea(){
        return base*altura/2;
    }
    
    public double calcularHipotenusa(){
        return Math.pow(base*base+altura*altura,0.5);
    }
    public double calcularPerimetro(){
        return base+altura+calcularHipotenusa();
    }
    public String determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())){
            System.out.println("Es un triángulo equilátero");
            return "Es un triángulo equilátero";}
        
        else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())){
            System.out.println("Es un triángulo escaleno"); 
            return "Es un triángulo escaleno";
        
        }

        else{
            System.out.println("Es un triángulo isósceles");
            return "Es un triángulo isósceles";
        }
    }

    
}
