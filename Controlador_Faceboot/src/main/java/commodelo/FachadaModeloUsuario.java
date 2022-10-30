/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commodelo;

import entidades.Usuario;
import coninterfaces.IFachadaModeloUsuario;

/**
 *
 * @author jegav
 */
public class FachadaModeloUsuario implements IFachadaModeloUsuario {

    private ModeloUsuario modeloUsuario;
    
    @Override
    public boolean agregarUsuario(Usuario usuario) {
        
        return modeloUsuario.registrar(usuario);
    }
    
}
