/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commodelo;

import coninterfaces.IFachadaModeloNotificacion;
import entidades.Notificacion;
import interfaces.IModeloNotificacion;

/**
 *
 * @author tonyd
 */
public class FachadaModeloNotificacion implements IFachadaModeloNotificacion{

    private IModeloNotificacion modeloNotificacion;

    public FachadaModeloNotificacion() {
        this.modeloNotificacion = ModelosFactory.crearModeloNotificacion();
    }
    
    @Override
    public Notificacion agregarNotificacion(Notificacion notificacion) {
        return modeloNotificacion.registrar(notificacion);
    }

    @Override
    public Notificacion consultarNotificacion(Integer idNotificacion) {
        return modeloNotificacion.consultar(idNotificacion);
    }
    
}
