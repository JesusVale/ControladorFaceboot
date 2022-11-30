/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package coninterfaces;

import entidades.Publicacion;
import java.util.List;

/**
 *
 * @author tonyd
 */
public interface IFachadaModeloPublicacion {
    public Publicacion agregarPublicacion(Publicacion publicacion);
    public List<Publicacion> consultarPublicaciones();
    public Publicacion eliminarPublicacion(Publicacion publicacion);
    public List<Publicacion> consultarPublicacionesPorEtiqueta(String hashtag) throws Exception;
}
