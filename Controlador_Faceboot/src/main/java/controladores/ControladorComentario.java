/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import commodelo.FachadaModeloComentario;
import coninterfaces.IFachadaModeloComentario;
import entidades.Comentario;
import eventos.Eventos;
import java.util.List;
import peticiones.PeticionComentarios;

/**
 *
 * @author tonyd
 */
public class ControladorComentario{
    private IFachadaModeloComentario fachadaComentario;

    public ControladorComentario() {
        this.fachadaComentario = new FachadaModeloComentario();
    }

    public Comentario registrarComentario(Comentario comentario) {
        return fachadaComentario.agregarPublicacion(comentario);
    }
    
    public PeticionComentarios consultarComentarios(){
        List<Comentario> comentarios = fachadaComentario.consultarComentarios();
        if(comentarios != null){
            return new PeticionComentarios(Eventos.consultarComentarios, 200, comentarios);
        }
        return new PeticionComentarios(Eventos.consultarComentarios, 400, "No se pudieron Consultar las Comentarios");
    }
 
    public Comentario eliminarPublicacion(Comentario comentario) {
        return fachadaComentario.eliminarComentario(comentario);
    }
}
