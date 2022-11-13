/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commodelo;

import interfaces.IConexionBD;
import modelo.ConexionBD;
import modelos.ModeloPublicacion;
import modelos.ModeloUsuario;

/**
 *
 * @author jegav
 */
public class ModelosFactory {
    private static final IConexionBD conexionBD = ConexionBD.getInstance();
    
    public static ModeloUsuario crearModeloUsuario(){
        return new ModeloUsuario(conexionBD);
    }
    
    public static ModeloPublicacion crearModeloPublicacion(){
        return new ModeloPublicacion(conexionBD);
    }
    
}
