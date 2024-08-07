/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio10;

/**
 *
 * @author hinca
 */
public class Estudiante {
    int numeroIns,estrato;
    String nombre;
    float patrimonio;
    


public Estudiante(int numeroIns, String nombre, float patrimonio, int estrato){
    this.numeroIns=numeroIns;
    this.nombre=nombre;
    this.patrimonio=patrimonio;
    this.estrato=estrato;
}
public int getNumeroIns(){

return numeroIns;
}
public String getNombre(){
    return nombre;
}
public float getPago(){
    float valor=50000;
    if (estrato>3 && patrimonio>2000000){
        
        valor=valor+patrimonio*0.03f;
    
    }
    return valor;
}
}