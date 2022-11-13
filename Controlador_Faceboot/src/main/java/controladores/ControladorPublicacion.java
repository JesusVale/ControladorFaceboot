/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import commodelo.FachadaModeloPublicacion;
import coninterfaces.IFachadaModeloPublicacion;
import entidades.Publicacion;

/**
 *
 * @author tonyd
 */
public class ControladorPublicacion {
    private IFachadaModeloPublicacion fachadaPublicacion;

    public ControladorPublicacion() {
        this.fachadaPublicacion = new FachadaModeloPublicacion();
    }

    public Publicacion registrarPublicacion(Publicacion publicacion) {
        return fachadaPublicacion.agregarPublicacion(publicacion);
    }
}
