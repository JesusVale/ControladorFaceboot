package commodelo;

import entidades.Usuario;
import coninterfaces.IFachadaModeloUsuario;
import entidades.Publicacion;
import interfaces.IModeloUsuario;

/**
 *
 * @author jegav
 */
public class FachadaModeloUsuario implements IFachadaModeloUsuario {

    private IModeloUsuario modeloUsuario;

    public FachadaModeloUsuario() {
        this.modeloUsuario = ModelosFactory.crearModeloUsuario();
    }  
    
    @Override
    public Usuario agregarUsuario(Usuario usuario) {
        return modeloUsuario.registrar(usuario);
    }

    @Override
    public Usuario iniciarSesion(Usuario usuario) {
        return modeloUsuario.login(usuario);
    }

    @Override
    public Usuario editarPerfil(Usuario usuario) {
        return modeloUsuario.actualizar(usuario);
    }

    @Override
    public boolean eliminarUsuario(Usuario usuario) {
        return modeloUsuario.eliminar(usuario.getId());
    }
    
    @Override
    public Usuario consultarUsuario(Long idUsuario) {
        return modeloUsuario.consultar(idUsuario);
    }

}
