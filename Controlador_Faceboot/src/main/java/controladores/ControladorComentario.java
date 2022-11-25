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
import peticiones.PeticionComentario;
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

    public PeticionComentario registrarComentario(Comentario comentario) {
        Comentario comentarioRegistrado = fachadaComentario.agregarPublicacion(comentario);
        return new PeticionComentario(Eventos.registrarComentario, 200, comentarioRegistrado);
    }
    
    public PeticionComentarios consultarComentarios(Integer idPublicacion){
        List<Comentario> comentarios = fachadaComentario.consultarComentarios(idPublicacion);
        if(comentarios != null){
            return new PeticionComentarios(Eventos.consultarComentarios, 200, comentarios);
        }
        return new PeticionComentarios(Eventos.consultarComentarios, 400, "No se pudieron Consultar las Comentarios");
    }
 
    public Comentario eliminarPublicacion(Comentario comentario) {
        return fachadaComentario.eliminarComentario(comentario);
    }
}
