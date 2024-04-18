/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Estado;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class Ocupado extends Estado{
    
    public Ocupado()
    {
        this.setEstadoHab(" Habitaciones Ocupadas:");
        leeHabOcupadas();
    }

    
    public void leeHabOcupadas()
    {
        try{
            String numeroHabitacion = "";
            String tipoHabitacion = "";
            float costoHabitacion = 0;
            
            File archivo = new File("HabOcupadas.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            
            String linea;
            
            while((linea=br.readLine())!= null)
            {
                Reserva reserva = new Reserva(numeroHabitacion,tipoHabitacion,costoHabitacion);
                br.readLine();
                br.readLine();
                br.readLine();
                br.readLine();
                reserva.setNumeroHabitacion(br.readLine());
                reserva.setTipoHabitacion(br.readLine());
                reserva.setCostoHabitacion(Float.parseFloat(br.readLine()));
                br.readLine();
                br.readLine();
                br.readLine();
                br.readLine();
                br.readLine();
                this.listaEstadoHab.add(reserva);
            }
            fr.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
