/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comserver;

import coninterfaces.IComunicadorControlador;
import conversors.IJsonToObject;
import conversors.JsonToObject;
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
        this.conversor = new JsonToObject();
        this.clienteControlador = new ClienteControlador(5000, controladorObservable, codigo);
        new Thread(clienteControlador).start();
    }
    
    @Override
    public void registrarUsuario(boolean resultado, String seguimiento) {
        String[] arreglo = {Eventos.registrarUsuario,seguimiento ,conversor.convertirObjetoString(resultado)}; 
        clienteControlador.enviarMensaje(conversor.convertirObjetoString(arreglo));
        
    }
}
