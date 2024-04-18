/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Estado;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Alejandro
 */
public class Disponible extends Estado{
    public Disponible()
    {
        this.setEstadoHab("Habitaciones Disponibles: ");
        this.leeHabDisponibles();
        this.setListaEstadoHab(this.getListaEstadoHab());
    }
    
    public void leeHabDisponibles()
    {
        try{
            String estado = "";
            String numeroHabitacion = "";
            String tipoHabitacion = "";
            float costoHabitacion = 0;
            
            File archivo = new File("HabDisponibles.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            
            br.readLine();
            while((linea=br.readLine()) != null)
            {
                Reserva reserva = new Reserva(estado,numeroHabitacion,tipoHabitacion,costoHabitacion);

                reserva.setEstado(linea);
                reserva.setNumeroHabitacion(br.readLine());
                reserva.setTipoHabitacion(br.readLine());
                reserva.setCostoHabitacion(Float.parseFloat(br.readLine()));
                if(reserva.getEstado().equals("Disponible"))
                {
                this.listaEstadoHab.add(reserva);    
                }
            }
            fr.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
