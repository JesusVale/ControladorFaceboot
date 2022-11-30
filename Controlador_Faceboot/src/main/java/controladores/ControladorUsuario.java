/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import commodelo.FachadaModeloUsuario;
import coninterfaces.IFachadaModeloUsuario;
import entidades.Publicacion;
import entidades.Usuario;
import eventos.Eventos;
import peticiones.PeticionUsuario;

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
    
    public PeticionUsuario IniciarSesionFacebook(Usuario usuario){
        Usuario usuarioEncontrado = fachadaUsuario.iniciarSesionFacebook(usuario);
        if(usuarioEncontrado == null){
            return new PeticionUsuario(Eventos.Login, 404, "No se encontró el usuario");
        }
        return new PeticionUsuario(Eventos.Login, 200, usuarioEncontrado);
    }
    
    public PeticionUsuario IniciarSesion(Usuario usuario){
        Usuario usuarioEncontrado = fachadaUsuario.iniciarSesion(usuario);
        if(usuarioEncontrado == null){
            return new PeticionUsuario(Eventos.Login, 404, "No se encontró el usuario");
        }
        return new PeticionUsuario(Eventos.Login, 200, usuarioEncontrado);
    }
    
    public Usuario editarPerfil(Usuario usuario){
        return fachadaUsuario.editarPerfil(usuario);
    }
    
    public Usuario eliminarUsuario(Usuario usuario){
        return fachadaUsuario.eliminarUsuario(usuario);
    }
    
    public PeticionUsuario consultarUsuarioPorId(Integer idUsuario){
        try{
            Usuario usuarioEncontrado = fachadaUsuario.consultarUsuario(idUsuario);
            return new PeticionUsuario(Eventos.consultarUsuarioPorId, 200, usuarioEncontrado);
        } catch(Exception ex){

        }
        return null;
    }
    
    public PeticionUsuario consultarUsuarioPorNombre(String nombre){
        Usuario usuarioEncontrado = fachadaUsuario.consultarUsuarioPorNombre(nombre);
        return new PeticionUsuario(Eventos.consultarUsuarioPorNombre, 200, usuarioEncontrado);
    }
    

}
