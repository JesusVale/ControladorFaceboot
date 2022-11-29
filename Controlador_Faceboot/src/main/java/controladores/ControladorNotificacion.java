/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import commodelo.FachadaModeloNotificacion;
import coninterfaces.IFachadaModeloNotificacion;
import entidades.Notificacion;

/**
 *
 * @author tonyd
 */
public class ControladorNotificacion {
    private IFachadaModeloNotificacion fachadaNotificacion;

    public ControladorNotificacion() {
        this.fachadaNotificacion = new FachadaModeloNotificacion();
    }
    
    public Notificacion registrarNotificacion(Notificacion notificacion){
        return fachadaNotificacion.agregarNotificacion(notificacion);
    }
    
    public Notificacion consultarNotificacion(Integer idNotificacion){
        return fachadaNotificacion.consultarNotificacion(idNotificacion);
    }
    
    
}
