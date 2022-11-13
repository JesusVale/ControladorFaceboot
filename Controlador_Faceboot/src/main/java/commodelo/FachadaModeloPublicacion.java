/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commodelo;

import coninterfaces.IFachadaModeloPublicacion;
import entidades.Publicacion;
import interfaces.IModeloPublicacion;

/**
 *
 * @author tonyd
 */
public class FachadaModeloPublicacion implements IFachadaModeloPublicacion{
    private IModeloPublicacion modeloPublicacion;
    public FachadaModeloPublicacion() {
        this.modeloPublicacion = ModelosFactory.crearModeloPublicacion();
    }
    
    @Override
    public Publicacion agregarPublicacion(Publicacion publicacion) {
        return modeloPublicacion.registrar(publicacion);
    }
    
}
