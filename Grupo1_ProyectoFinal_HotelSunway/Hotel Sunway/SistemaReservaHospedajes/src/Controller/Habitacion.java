/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Cliente;

/**
 *
 * @author Alejandro
 */
public class Habitacion extends Cliente{
    private String estado;
    private String numeroHabitacion;
    private String tipoHabitacion;
    private float costoHabitacion;
    

    public Habitacion() {
    }

    public Habitacion(String numeroHabitacion, String tipoHabitacion,float costoHabitacion, String nombre, String apellidos, String dni, String telefono) {
        super(nombre, apellidos, dni, telefono);
        this.costoHabitacion = costoHabitacion;
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
    }

    public Habitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public Habitacion(String tipoHabitacion, float costoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
        this.costoHabitacion = costoHabitacion;
    }

    public Habitacion(String numeroHabitacion, String tipoHabitacion, float costoHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.costoHabitacion = costoHabitacion;
    }

    
    
    public Habitacion(String estado,String numeroHabitacion, String tipoHabitacion, float costoHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.costoHabitacion = costoHabitacion;
    }
    
    

    public Habitacion(String nombre, String apellidos, String dni, String telefono) {
        super(nombre, apellidos, dni, telefono);
    }
    

    //Para usarlo en el reporte de habitacion
    public Habitacion(String tipoHabitacion, String nombre, String apellidos, String dni, String telefono) {
        super(nombre, apellidos, dni, telefono);
        this.tipoHabitacion = tipoHabitacion;
    }
    
    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public float getCostoHabitacion() {
        return costoHabitacion;
    }

    public void setCostoHabitacion(float costoHabitacion) {
        this.costoHabitacion = costoHabitacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
  
    
}
