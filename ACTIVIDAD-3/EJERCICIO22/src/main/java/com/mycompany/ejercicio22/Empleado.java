/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio22;

/**
 *
 * @author hinca
 */
public class Empleado {
    String nombre;
    double salarioBasicoH;
    float horasTrabajadas;
    
    public Empleado(String nombre,double salarioBasicoH, float horasTrabajadas){
        this.nombre=nombre;
        this.salarioBasicoH=salarioBasicoH;
        this.horasTrabajadas=horasTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    public float getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getSalarioBasicoH() {
        return salarioBasicoH;
    }
    
    public float salario(){
        return (float) (horasTrabajadas*salarioBasicoH);
    }
    
    public boolean cumple(){
        if (salario()>450000){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    
}
