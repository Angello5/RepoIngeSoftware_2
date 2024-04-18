/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Habitacion;

/**
 *
 * @author Alejandro
 */

public class Reserva extends Habitacion{
    
   //CLASE HIJA DE HABITACION
   private String codigoReserva;
   private String fechaReserva;
   private String fechaIngreso;
   private String fechaSalida;
   private String fechaCancelacion;
   private float montoTotal;

    public Reserva(){
        
    }

    public Reserva(String nombre, String apellidos, String dni, String telefono) {
        super(nombre, apellidos, dni, telefono);
    }

    
        //Para generar el archivo con todas las reservas de habitacion ocupadas
    public Reserva(String codigoReserva,String fechaReserva, String fechaIngreso,String fechaSalida, String numeroHabitacion,
            String tipoHabitacion,float costoHabitacion, float montoTotal, String nombre, String apellidos, String dni, String telefono)
    {
        super(numeroHabitacion, tipoHabitacion, costoHabitacion, nombre, apellidos, dni, telefono);
        this.codigoReserva = codigoReserva;
        this.fechaReserva = fechaReserva;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.montoTotal = montoTotal;
    }
    
    
    
    
    public Reserva(String fechaReserva, String fechaIngreso,String fechaSalida, String numeroHabitacion,
            String tipoHabitacion,float costoHabitacion, float montoTotal, String nombre, String apellidos, String dni, String telefono){
        super(numeroHabitacion, tipoHabitacion,costoHabitacion,nombre, apellidos, dni, telefono);
        this.fechaReserva = fechaReserva;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.montoTotal = montoTotal;
    }

    
    //Para almacenar los datos despues de hacer el checkout
    public Reserva(String codigoReserva, String fechaReserva, String fechaIngreso, String fechaSalida,String fechaCancelacion, 
            String numeroHabitacion, String tipoHabitacion, float costoHabitacion,String nombre, String apellidos, String dni, String telefono,float montoTotal) {
        super(numeroHabitacion, tipoHabitacion, costoHabitacion, nombre, apellidos, dni, telefono);
        this.codigoReserva = codigoReserva;
        this.fechaReserva = fechaReserva;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.fechaCancelacion = fechaCancelacion;
        this.montoTotal = montoTotal;
    }
    
    public Reserva(String fechaReserva, String fechaIngreso, String fechaSalida,String fechaCancelacion, 
            String numeroHabitacion, String tipoHabitacion, float costoHabitacion,String nombre, String apellidos, String dni, String telefono,float montoTotal) {
        super(numeroHabitacion, tipoHabitacion, costoHabitacion, nombre, apellidos, dni, telefono);
        this.fechaReserva = fechaReserva;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.fechaCancelacion = fechaCancelacion;
        this.montoTotal = montoTotal;
    }
    
    
    
    
    public Reserva(String numeroHabitacion, String tipoHabitacion, float costoHabitacion) {
        super(numeroHabitacion, tipoHabitacion, costoHabitacion);
    }
    
    public Reserva(String estado,String numeroHabitacion, String tipoHabitacion, float costoHabitacion) {
        super(numeroHabitacion, tipoHabitacion, costoHabitacion);
    }
    

    public Reserva(String fechaIngreso, String fechaSalida) {
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }


    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(String fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }
   
   
}
