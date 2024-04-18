/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Alejandro
 */
public abstract class Estado extends Reserva{
        private String estadoHab;
        List<Reserva> listaEstadoHab = new ArrayList<Reserva>();
       

    public String getEstadoHab() {
        return estadoHab;
    }

    public void setEstadoHab(String estadoHab) {
        this.estadoHab = estadoHab;
    }

    public List<Reserva> getListaEstadoHab() {
        return listaEstadoHab;
    }

    public void setListaEstadoHab(List<Reserva> listaEstadoHab) {
        this.listaEstadoHab = listaEstadoHab;
    }

    

}