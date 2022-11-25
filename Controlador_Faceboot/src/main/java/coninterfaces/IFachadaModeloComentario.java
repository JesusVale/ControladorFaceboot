/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package coninterfaces;

import entidades.Comentario;
import java.util.List;


/**
 *
 * @author tonyd
 */
public interface IFachadaModeloComentario {

    public Comentario agregarPublicacion(Comentario comentario);

    public List<Comentario> consultarComentarios(Integer idPublicacion);

    public Comentario eliminarComentario(Comentario comentario);
}
