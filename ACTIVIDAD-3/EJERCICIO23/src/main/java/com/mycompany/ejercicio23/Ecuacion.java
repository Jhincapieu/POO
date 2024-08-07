/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio23;

/**
 *
 * @author hinca
 */
public class Ecuacion {
    float A,B,C;
    
    public Ecuacion (float A, float B, float C){
        this.A=A;
        this.B=B;
        this.C=C;
    }
    
    public float solucion1(){
        return (float) ((-B+Math.sqrt(Math.pow(B, 2)-4*A*C))/(2*A));
    }
    public float solucion2(){
        return (float) ((-B-Math.sqrt(Math.pow(B, 2)-4*A*C))/(2*A));
    }

    
}
