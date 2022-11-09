package commodelo;

import entidades.Usuario;
import coninterfaces.IFachadaModeloUsuario;
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

}
