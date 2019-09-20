package edu.cecar.Controlador;


import us.monoid.json.JSONArray;
import us.monoid.json.JSONException;
import us.monoid.json.JSONObject;
import us.monoid.web.Resty;
import edu.cecar.Modelo.Album;
import edu.cecar.Modelo.Comentario;
import edu.cecar.Modelo.Foto;
import edu.cecar.Modelo.Publicacion;
import edu.cecar.Modelo.Usuario;
import java.io.IOException;

/** Clase: SingletonDescarga
 * 
 * @version: 0.1
 *  
 * @sincelejo: 15/09/2019
 * 
 * Fecha de Modificación: 
 * 
 * @author: Osnayder Conde Rodriguez
 * 
 * Copyrigth: CECAR
 */


public class SingletonDescarga {
    
    private JSONObject json = null;
    private JSONArray jsonArrayResultU = null;
    private JSONArray jsonArrayResultC = null;
    private JSONArray jsonArrayResultP = null;
    private JSONArray jsonArrayResultA = null;
    private JSONArray jsonArrayResultF = null;
    private int sizeUsuarios;
    private int sizeComentarios;
    private int sizePublicaciones;
    private int sizeAlbumes;
    private int sizeFotos;
    
    public SingletonDescarga(){ 
        if(jsonArrayResultU==null){
            try {
                json = new Resty().json("https://gorest.co.in/public-api/users?_format="
                                     + "json&access-token=DVC3QJkPjl1w-0OFBXevVadQ8QKv_RVtTxIe").object();
                JSONObject jsonMeta = json.getJSONObject("_meta");
                System.out.println("Descarga Usuario: "+jsonMeta.get("success"));
                jsonArrayResultU = json.getJSONArray("result");
                sizeUsuarios = jsonArrayResultU.length();
            } catch (IOException | JSONException ex) {
                System.out.println("Error al Descargar el jSON de Usuarios: "+ex.getMessage());
            }
        }
        
        if(jsonArrayResultA==null){
            try {
                json = new Resty().json("https://gorest.co.in/public-api/albums?_format="
                                     + "json&access-token=DVC3QJkPjl1w-0OFBXevVadQ8QKv_RVtTxIe").object();
                  JSONObject jsonMeta = json.getJSONObject("_meta");
                  System.out.println("Descarga Album: "+jsonMeta.get("success"));
                  jsonArrayResultA = json.getJSONArray("result");
                  sizeAlbumes = jsonArrayResultA.length();
            } catch (IOException | JSONException ex) {
                System.out.println("Error al Descargar el jSON de Albumes: "+ex.getMessage());
            }
        }
        
        if(jsonArrayResultP==null){
            try {
                json = new Resty().json("https://gorest.co.in/public-api/posts?_format="
                                      + "json&access-token=DVC3QJkPjl1w-0OFBXevVadQ8QKv_RVtTxIe").object();
                  JSONObject jsonMeta = json.getJSONObject("_meta");
                  System.out.println("Descarga Publicaciones: "+jsonMeta.get("success"));
                  jsonArrayResultP = json.getJSONArray("result");
                  sizePublicaciones = jsonArrayResultP.length();
            } catch (IOException | JSONException ex) {
                System.out.println("Error al Descargar el jSON de Publicaciones: "+ex.getMessage());
            }
        }
        
        if(jsonArrayResultF==null){
            try {
                json = new Resty().json("https://gorest.co.in/public-api/photos?_format="
                                        + "json&access-token=DVC3QJkPjl1w-0OFBXevVadQ8QKv_RVtTxIe").object();
                  JSONObject jsonMeta = json.getJSONObject("_meta");
                  System.out.println("Descarga Foto: "+jsonMeta.get("success"));
                  jsonArrayResultF = json.getJSONArray("result");
                  sizeFotos  = jsonArrayResultF.length();
            } catch (IOException | JSONException ex) {
                System.out.println("Error al Descargar el jSON de Fotos: "+ex.getMessage());
            }
        }
        
        if(jsonArrayResultC==null){
            try {
                json = new Resty().json("https://gorest.co.in/public-api/comments?_format="
                                       + "json&access-token=DVC3QJkPjl1w-0OFBXevVadQ8QKv_RVtTxIe").object();
                  JSONObject jsonMeta = json.getJSONObject("_meta");
                  System.out.println("Descarga Comentario: "+jsonMeta.get("success"));
                  jsonArrayResultC = json.getJSONArray("result");
                  sizeComentarios = jsonArrayResultC.length();
            } catch (IOException | JSONException ex) {
                System.out.println("Error al Descargar el jSON de Comentarios: "+ex.getMessage());
            }
        }      
    }
    
    public  Usuario getUsuarios(int i){
        Usuario usuario = new Usuario();
        try {
            usuario.setAddress((String)jsonArrayResultU.getJSONObject(i).get("address"));
            usuario.setDob((String)jsonArrayResultU.getJSONObject(i).get("dob"));
            usuario.setEmail((String)jsonArrayResultU.getJSONObject(i).get("email"));
            usuario.setFirt_name((String)jsonArrayResultU.getJSONObject(i).get("first_name"));
            usuario.setGender((String)jsonArrayResultU.getJSONObject(i).get("gender"));
            usuario.setId(Integer.parseInt((String)jsonArrayResultU.getJSONObject(i).get("id")));
            usuario.setLast_name((String)jsonArrayResultU.getJSONObject(i).get("last_name"));
            usuario.setPhone((String)jsonArrayResultU.getJSONObject(i).get("phone"));
            usuario.setStatus((String)jsonArrayResultU.getJSONObject(i).get("status"));
            usuario.setWebsite((String)jsonArrayResultU.getJSONObject(i).get("website"));         
        } catch (JSONException ex) {
            System.out.println("Error al Leer el jSON usuario: "+ex.getMessage());
        }
        return usuario;        
    }
    
    public   Album getAlbum(int i){        
        Album album = new Album();
        try {
            album.setId(Integer.parseInt((String)jsonArrayResultA.getJSONObject(i).get("id")));
            album.setTitle((String)jsonArrayResultA.getJSONObject(i).get("title"));
            album.setUser_id(Integer.parseInt((String)jsonArrayResultA.getJSONObject(i).get("user_id")));
        } catch (JSONException ex) {
            System.out.println("Error Al Leer el jSON album: "+ex.getMessage());            
        }
        return album; 
    }

    public Publicacion getPublicacion(int i){
        Publicacion publicacion = new Publicacion();
        try {
            publicacion.setBody((String)jsonArrayResultP.getJSONObject(i).get("body"));
            publicacion.setId(Integer.parseInt((String)jsonArrayResultP.getJSONObject(i).get("id")));
            publicacion.setTitle((String)jsonArrayResultP.getJSONObject(i).get("title"));
            publicacion.setUser_id(Integer.parseInt((String) jsonArrayResultP.getJSONObject(i).get("user_id")));
        } catch (JSONException ex) {
            System.out.println("Error al Leer jSON Publicaciones: "+ex.getMessage());
        }            
        return publicacion; 
    }
    
    public Foto getFoto(int i){
        Foto foto = new Foto();
        try {
            foto.setId(Integer.parseInt((String)jsonArrayResultF.getJSONObject(i).get("id")));
            foto.setAlbum_id(Integer.parseInt((String)jsonArrayResultF.getJSONObject(i).get("album_id")));
            foto.setThumbnail((String)jsonArrayResultF.getJSONObject(i).get("thumbnail"));
            foto.setTitle((String)jsonArrayResultF.getJSONObject(i).get("title"));
            foto.setUrl((String)jsonArrayResultF.getJSONObject(i).get("url"));
        } catch (JSONException ex) {
            System.out.println("Error al Leer jSON Fotos: "+ex.getMessage());
        }           
        return foto; 
    }
    
    public  Comentario getComentario(int i){
        Comentario comentario = new Comentario();        
        
            try {
                comentario.setBody((String)jsonArrayResultC.getJSONObject(i).get("body"));
                comentario.setEmail((String)jsonArrayResultC.getJSONObject(i).get("email"));
                comentario.setId(Integer.parseInt((String)jsonArrayResultC.getJSONObject(i).get("id")));
                comentario.setName((String)jsonArrayResultC.getJSONObject(i).get("name"));
                comentario.setPost_id(Integer.parseInt((String)jsonArrayResultC.getJSONObject(i).get("post_id")));
            } catch (JSONException ex) {
                System.out.println("Error al Leer jSON Comentarios: "+ex.getMessage());
            }            
        return comentario; 
    }

    public int getSizeUsuarios() {
        return sizeUsuarios;
    }

    public int getSizeComentarios() {
        return sizeComentarios;
    }

    public int getSizePublicaciones() {
        return sizePublicaciones;
    }

    public int getSizeAlbumes() {
        return sizeAlbumes;
    }

    public int getSizeFotos() {
        return sizeFotos;
    }
    
    
}