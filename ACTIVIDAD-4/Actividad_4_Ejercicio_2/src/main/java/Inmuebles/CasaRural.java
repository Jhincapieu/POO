/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author hinca
 */
public class CasaRural extends Casa{
    
    protected static double valorArea=1500000;
    protected int distanciaCabecera;
    protected int altitud;

    public CasaRural(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos, int distanciaCabecera, int altitud) {
        
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
        this.altitud=altitud;
        this.distanciaCabecera=distanciaCabecera;
    }
    
    void imprimir(){
        
        super.imprimir();
        System.out.println("Distancia la cabecera municipal = "+ distanciaCabecera + "km");
        System.out.println("Altitud sobre el nivel del mar = "+ altitud + "metros");
    }
    
}
