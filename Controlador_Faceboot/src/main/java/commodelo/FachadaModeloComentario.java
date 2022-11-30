/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commodelo;

import coninterfaces.IFachadaModeloComentario;
import entidades.Comentario;
import interfaces.IModeloComentario;
import java.util.List;

/**
 *
 * @author tonyd
 */
public class FachadaModeloComentario implements IFachadaModeloComentario{
    private IModeloComentario modeloComentario;
    public FachadaModeloComentario() {
        this.modeloComentario = ModelosFactory.crearModeloComentario();
    }
    @Override
    public Comentario agregarComentario(Comentario comentario) {
        return modeloComentario.registrar(comentario);
    }

    @Override
    public List<Comentario> consultarComentarios(Integer idPublicacion) {
        return modeloComentario.consultarComentarios(idPublicacion);
    }

    @Override
    public Comentario eliminarComentario(Comentario comentario) {
        return modeloComentario.eliminar(comentario.getId().toString());
    }
    
}
