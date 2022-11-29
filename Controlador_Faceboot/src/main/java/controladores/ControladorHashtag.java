/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import commodelo.FachadaModeloHashtag;
import coninterfaces.IFachadaModeloHashtag;
import entidades.Hashtag;
import java.util.List;

/**
 *
 * @author tonyd
 */
public class ControladorHashtag {

    private IFachadaModeloHashtag fachadaHashtag;

    public ControladorHashtag() {
        this.fachadaHashtag = new FachadaModeloHashtag();
    }

    public Hashtag registrarHashtag(Hashtag hashtag) {
        return fachadaHashtag.agregarHashtag(hashtag);
    }

    public List registrarHashtags(List<Hashtag> hashtags) {
        return fachadaHashtag.agregarHashtags(hashtags);
    }

    public Hashtag consultarHashtag(Integer idHashtag) {
        return fachadaHashtag.consultarHashtag(idHashtag);
    }

    public Hashtag registrarHashtag(Integer idHashtag) {
        return fachadaHashtag.eliminarHashtag(idHashtag);
    }
}
