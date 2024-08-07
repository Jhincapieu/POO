/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio7;

/**
 *
 * @author hinca
 */
public class verificarNumeros {
    float A,B;
    
    public verificarNumeros(float A,float B){
        this.A=A;
        this.B=B;
                
    }
    public String mayor(){
        if (A<B){
            return B+" Es mayor que "+A;
            
        }
        else if (A>B){
            return A + " Es mayor que "+ B;
            
        }
        
        else{
            return A+" Es igual a "+ B;
        }
        
    }
    
}
