/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import commodelo.FachadaModeloNotificacion;
import coninterfaces.IFachadaModeloNotificacion;
import entidades.Notificacion;
import entidades.Usuario;
import eventos.Eventos;
import java.util.List;
import peticiones.PeticionNotificaciones;

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
    
    public PeticionNotificaciones consultarNotificacionesPorRemitente(Usuario remitente){
        try{
            List<Notificacion> notificacionesEncontradas = fachadaNotificacion.consultarNotificacionesPorRemitente(remitente);
            return new PeticionNotificaciones(Eventos.consultarNotificacionesPorRemitente, 200, notificacionesEncontradas);
        } catch(Exception ex){
            return new PeticionNotificaciones(Eventos.consultarNotificacionesPorRemitente, 404, ex.getMessage()); 
        }
    }
    
}
