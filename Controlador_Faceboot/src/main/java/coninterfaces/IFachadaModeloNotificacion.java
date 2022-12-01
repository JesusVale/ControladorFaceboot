/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package coninterfaces;

import entidades.Notificacion;
import entidades.Usuario;
import java.util.List;

/**
 *
 * @author tonyd
 */
public interface IFachadaModeloNotificacion {
    public Notificacion agregarNotificacion(Notificacion notificacion);
    public Notificacion consultarNotificacion(Integer idNotificacion);
    public List<Notificacion> consultarNotificacionesPorRemitente(Usuario remitente);
}
