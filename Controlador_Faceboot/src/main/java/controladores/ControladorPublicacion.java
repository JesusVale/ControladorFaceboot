/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import commodelo.FachadaModeloPublicacion;
import coninterfaces.IFachadaModeloPublicacion;
import entidades.Publicacion;
import eventos.Eventos;
import java.util.List;
import peticiones.PeticionPublicaciones;

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
    
    public PeticionPublicaciones consultarPublicaciones(){
        List<Publicacion> publicaciones = fachadaPublicacion.consultarPublicaciones();
        if(publicaciones != null){
            return new PeticionPublicaciones(Eventos.consultarPublicaciones, 200, publicaciones);
        }
        return new PeticionPublicaciones(Eventos.consultarPublicaciones, 400, "No se pudieron Consultar las publicaciones");
    }
}
