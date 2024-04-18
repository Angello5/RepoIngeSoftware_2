/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Disponible;
import Controller.Estado;

/**
 *
 * @author Alejandro
 */
public class EstadoFactory {
    public Estado emitirEstado(int opcion)
    {
        switch(opcion)
        {
            case 1:
                return new Ocupado();
            case 2:
                return new Disponible();
            default:
                return null;
        }
    }
}
