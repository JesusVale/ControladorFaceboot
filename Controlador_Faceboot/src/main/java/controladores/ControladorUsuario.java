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
import conversors.JsonToObject;
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
        this.conversor = new JsonToObject();
        this.fachadaUsuario = new FachadaModeloUsuario();
        this.comunicador = new ComunicadorControlador(this, "221");
    }
    
    
    
    @Override
    public void actualizar(String[] info) {
        Usuario usuario = conversor.convertirUsuario(info[2]);        
        //boolean resultado = fachadaUsuario.agregarUsuario(usuario); 
        comunicador.registrarUsuario(true, info[1]);
        fachadaUsuario.agregarUsuario(usuario);
    }
    
    public static void correrControlador(){
        
    }
    
}
