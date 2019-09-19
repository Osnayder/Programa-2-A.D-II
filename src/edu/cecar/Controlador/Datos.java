/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.cecar.Controlador;

import edu.cecar.Modelo.Album;
import edu.cecar.Modelo.Comentario;
import edu.cecar.Modelo.Foto;
import edu.cecar.Modelo.Publicacion;
import edu.cecar.Modelo.Usuario;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import us.monoid.json.JSONArray;
import us.monoid.json.JSONException;

/** Interface: UsuarioControlador
 * 
 * @version: 0.1
 *  
 * @sincelejo: 21/08/2019
 * 
 * Fecha de Modificación: 
 * 
 * @author: Osnayder Conde Rodriguez
 * 
 * Copyrigth: CECAR
 */
public class Datos {
     
    Vector<Usuario> vectorUsuarios = new Vector<Usuario>();
    Vector<Comentario>    vectorComentarios = new Vector<Comentario>();
    Vector<Publicacion> vectorPublicaciones = new Vector<Publicacion>();
    Vector<Album> vectorAlbumes = new Vector<Album>();
    Vector<Foto>    vectorFotos = new Vector<Foto>();
    
    SingletonDescarga s = new SingletonDescarga();
    JSONArray ArrayResult = null; 
    
    
    public void cargarUsuarios(){
        Usuario usuario = new Usuario();
        ArrayResult = s.singletonUsuario();
      
        for(int i=0; i<ArrayResult.length(); i++){
            try {
                usuario.setAddress((String)ArrayResult.getJSONObject(i).get("address"));
                usuario.setDob((String)ArrayResult.getJSONObject(i).get("dob"));
                usuario.setEmail((String)ArrayResult.getJSONObject(i).get("email"));
                usuario.setFirt_name((String)ArrayResult.getJSONObject(i).get("first_name"));
                usuario.setGender((String)ArrayResult.getJSONObject(i).get("gender"));
                usuario.setId(Integer.parseInt((String)ArrayResult.getJSONObject(i).get("id")));
                usuario.setLast_name((String)ArrayResult.getJSONObject(i).get("last_name"));
                usuario.setPhone((String)ArrayResult.getJSONObject(i).get("phone"));
                usuario.setStatus((String)ArrayResult.getJSONObject(i).get("status"));
                usuario.setWebsite((String)ArrayResult.getJSONObject(i).get("website"));
                vectorUsuarios.addElement(usuario);
            } catch (JSONException ex) {
                Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            }            
       }
            
    }
    
    public void cargarComentarios(){
        Comentario comentario = new Comentario();
        ArrayResult = s.singletonComentario();
        
        for(int i=0; i<ArrayResult.length(); i++){
            try {
                comentario.setBody((String)ArrayResult.getJSONObject(i).get("body"));
                comentario.setEmail((String)ArrayResult.getJSONObject(i).get("email"));
                comentario.setId(Integer.parseInt((String) ArrayResult.getJSONObject(i).get("id")));
                comentario.setName((String)ArrayResult.getJSONObject(i).get("name"));
                comentario.setPost_id(Integer.parseInt((String) ArrayResult.getJSONObject(i).get("post_id")));
                vectorComentarios.addElement(comentario);
            } catch (JSONException ex) {
                Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
    }
    
    public void cargarPublicaciones(){
        Publicacion publicacion = new Publicacion();
        ArrayResult = s.singletonPublicacion();
        
        for(int i=0; i<ArrayResult.length(); i++){
            try {
                publicacion.setBody((String)ArrayResult.getJSONObject(i).get("body"));
                publicacion.setId(Integer.parseInt((String)ArrayResult.getJSONObject(i).get("id")));
                publicacion.setTitle((String)ArrayResult.getJSONObject(i).get("title"));
                publicacion.setUser_id(Integer.parseInt((String) ArrayResult.getJSONObject(i).get("user_id")));
                vectorPublicaciones.addElement(publicacion);
            } catch (JSONException ex) {
                Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
    }
    
    public void cargarAlbumes(){
        Album album = new Album();
        ArrayResult = s.singletonAlbum();
        
        for(int i=0; i<ArrayResult.length(); i++){
            try {
                album.setId(Integer.parseInt((String)ArrayResult.getJSONObject(i).get("id")));
                album.setTitle((String)ArrayResult.getJSONObject(i).get("title"));
                album.setUser_id(Integer.parseInt((String)ArrayResult.getJSONObject(i).get("user_id")));
                vectorAlbumes.addElement(album);
            } catch (JSONException ex) {
                Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
    }
    
    public void cargarFotos(){
         Foto foto = new Foto();
         ArrayResult = s.singletonFoto();
         
         for(int i=0; i<ArrayResult.length(); i++){
            try {
                foto.setId(Integer.parseInt((String)ArrayResult.getJSONObject(i).get("id")));
                foto.setAlbum_id(Integer.parseInt((String)ArrayResult.getJSONObject(i).get("album_id")));
                foto.setThumbnail((String)ArrayResult.getJSONObject(i).get("thumbnail"));
                foto.setTitle((String)ArrayResult.getJSONObject(i).get("title"));
                foto.setUrl((String)ArrayResult.getJSONObject(i).get("url"));
                vectorFotos.addElement(foto);
            } catch (JSONException ex) {
                Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
         
    }
}
