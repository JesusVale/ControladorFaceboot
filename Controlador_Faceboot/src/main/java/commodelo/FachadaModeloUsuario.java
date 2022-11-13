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

}
