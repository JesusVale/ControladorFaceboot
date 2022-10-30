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
    
    @Override
    public boolean agregarUsuario(Usuario usuario) {
        
        return modeloUsuario.registrar(usuario);
    }
    
}
