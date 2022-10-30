/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import commodelo.FachadaModeloUsuario;
import comserver.ComunicadorControlador;
import comserver.IControladorObservable;
import coninterfaces.IFachadaModeloUsuario;
import conversors.IJsonToObject;
import entidades.Usuario;

/**
 *
 * @author jegav
 */
public class ControladorUsuario implements IControladorObservable {
    
    private IFachadaModeloUsuario fachadaUsuario;
    private ComunicadorControlador comunicador;
    private IJsonToObject conversor;

    public ControladorUsuario() {
        this.fachadaUsuario = new FachadaModeloUsuario();
        this.comunicador = new ComunicadorControlador(this, "221");
    }
    
    
    
    @Override
    public void actualizar(String[] info) {
        Usuario usuario = conversor.convertirUsuario(info[2]);
        comunicador.registrarUsuario(usuario, info[1]);
    }
    
    public static void correrControlador(){
        
    }
    
}
