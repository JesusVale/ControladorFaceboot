/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comserver;

import coninterfaces.IComunicadorControlador;
import conversors.IJsonToObject;
import entidades.Usuario;
import eventos.Eventos;

/**
 *
 * @author jegav
 */
public class ComunicadorControlador implements IComunicadorControlador {
    
    private ClienteControlador clienteControlador;
    private IJsonToObject conversor;
    
    public ComunicadorControlador(IControladorObservable controladorObservable, String codigo) {
        
        this.clienteControlador = new ClienteControlador(5000, controladorObservable, codigo);
        
    }
    
    @Override
    public void registrarUsuario(Usuario usuario, String seguimiento) {
        String usuarioStr =  conversor.convertirObjetoString(usuario);
        String[] mensajes = {Eventos.registrarUsuario, seguimiento, usuarioStr};
        clienteControlador.enviarMensaje(conversor.convertirObjetoString(mensajes));
    }
}
