/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio19;

/**
 *
 * @author hinca
 */
public class Triangulo {
    float lado;
    
    public Triangulo(float lado){
        
        this.lado=lado;
    }
    
    public double perimetro(){
        return lado*3;
    }
    public double altura(){
        return (lado/2)*Math.sqrt(3);
    }
    
    public double area(){
        return (lado*(lado/2)*Math.sqrt(3))/2;
    }
    
}
