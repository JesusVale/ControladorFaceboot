package commodelo;

import entidades.Usuario;
import coninterfaces.IFachadaModeloUsuario;
import interfaces.IConexionBD;
import interfaces.IModeloUsuario;
import modelo.ConexionBD;
import modelo.ModeloUsuario;

/**
 *
 * @author jegav
 */
public class FachadaModeloUsuario implements IFachadaModeloUsuario {

    private IModeloUsuario modeloUsuario;
    private IConexionBD conexionBD;

    public FachadaModeloUsuario() {
        this.conexionBD = new ConexionBD();
        this.modeloUsuario = new ModeloUsuario(conexionBD);
    }  
    
    @Override
    public boolean agregarUsuario(Usuario usuario) {
        
        return modeloUsuario.registrar(usuario);
    }
    
}
