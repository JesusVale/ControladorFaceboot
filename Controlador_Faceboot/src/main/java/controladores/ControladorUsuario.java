/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import commodelo.FachadaModeloUsuario;
import coninterfaces.IFachadaModeloUsuario;
import entidades.Usuario;

/**
 *
 * @author jegav
 */
public class ControladorUsuario {
    
    private IFachadaModeloUsuario fachadaUsuario;

    public ControladorUsuario() {
        this.fachadaUsuario = new FachadaModeloUsuario();
    }
    
    
    public Usuario registrarUsuario(Usuario usuario){
        return fachadaUsuario.agregarUsuario(usuario);
    }
    
    
}
