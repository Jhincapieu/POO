/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio18;

/**
 *
 * @author hinca
 */

public class Empleado {
    int codigo;
    String nombres;
    float horasTrabajadas, valorHora,porcentajeR;
    
    public Empleado(int codigo, String nombres, float horasTrabajadas, float valorHora, float porcentajeR){
        this.codigo=codigo;
        this.horasTrabajadas=horasTrabajadas;
        this.nombres=nombres;
        this.porcentajeR=porcentajeR;
        this.valorHora=valorHora;
    }
    public double SalarioBruto(){
        return horasTrabajadas*valorHora;
    }
    public double SalarioNeto(){
        return horasTrabajadas*valorHora*(1-porcentajeR/100);
        
    }
    
    public int getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombres;
    }
    
    
}
