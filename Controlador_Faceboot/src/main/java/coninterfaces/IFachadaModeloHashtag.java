/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coninterfaces;

import entidades.Hashtag;
import java.util.List;

/**
 *
 * @author tonyd
 */
public interface IFachadaModeloHashtag {
    public Hashtag agregarHashtag(Hashtag hashtag);
    public List agregarHashtags(List<Hashtag> hashtags);
    public Hashtag consultarHashtag(Integer idHashtag);
    public Hashtag eliminarHashtag(Integer idHashtag);
}
