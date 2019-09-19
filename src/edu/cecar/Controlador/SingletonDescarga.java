package edu.cecar.Controlador;


import java.util.logging.Level;
import java.util.logging.Logger;
import us.monoid.json.JSONArray;
import us.monoid.json.JSONObject;
import us.monoid.web.Resty;

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
    JSONArray jsonArrayResultU = null;
    JSONArray jsonArrayResultC = null;
    JSONArray jsonArrayResultP = null;
    JSONArray jsonArrayResultA = null;
    JSONArray jsonArrayResultF = null;
    
    public  JSONArray  singletonUsuario(){ 
        
        if(jsonArrayResultU==null){
            try {
                json = new Resty().json("https://gorest.co.in/public-api/users?_format=json&access-token=DVC3QJkPjl1w-0OFBXevVadQ8QKv_RVtTxIe").object();
                JSONObject jsonMeta = json.getJSONObject("_meta");
                System.out.println("usuario: "+jsonMeta.get("success"));
                jsonArrayResultU = json.getJSONArray("result");
                                      
            } catch (Exception ex) {
                Logger.getLogger(SingletonDescarga.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return jsonArrayResultU;
    }
    
    public  JSONArray singletonAlbum(){        
        if(jsonArrayResultA==null){
            try {
                json = new Resty().json("https://gorest.co.in/public-api/albums?_format=json&access-token=DVC3QJkPjl1w-0OFBXevVadQ8QKv_RVtTxIe").object();
                  JSONObject jsonMeta = json.getJSONObject("_meta");
                  System.out.println("Album: "+jsonMeta.get("success"));
                  jsonArrayResultA = json.getJSONArray("result");
            } catch (Exception ex) {
                Logger.getLogger(SingletonDescarga.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
        return jsonArrayResultA; 
    }

    public  JSONArray singletonPublicacion(){
        if(jsonArrayResultP==null){
            try {
                json = new Resty().json("https://gorest.co.in/public-api/posts?_format=json&access-token=DVC3QJkPjl1w-0OFBXevVadQ8QKv_RVtTxIe").object();
                  JSONObject jsonMeta = json.getJSONObject("_meta");
                  System.out.println("Publicaciones: "+jsonMeta.get("success"));
                  jsonArrayResultP = json.getJSONArray("result");
            } catch (Exception ex) {
                Logger.getLogger(SingletonDescarga.class.getName()).log(Level.SEVERE, null, ex);
            }
        }      
        return jsonArrayResultP; 
    }
    
    public JSONArray singletonFoto(){
        if(jsonArrayResultF==null){
            try {
                json = new Resty().json("https://gorest.co.in/public-api/photos?_format=json&access-token=DVC3QJkPjl1w-0OFBXevVadQ8QKv_RVtTxIe").object();
                  JSONObject jsonMeta = json.getJSONObject("_meta");
                  System.out.println("Foto: "+jsonMeta.get("success"));
                  jsonArrayResultF = json.getJSONArray("result");
            } catch (Exception ex) {
                Logger.getLogger(SingletonDescarga.class.getName()).log(Level.SEVERE, null, ex);
            }
        }      
        return jsonArrayResultF; 
    }
    
    public JSONArray singletonComentario(){
        JSONArray jsonArrayResult = null;
        if(jsonArrayResultC==null){
            try {
                json = new Resty().json("https://gorest.co.in/public-api/comments?_format=json&access-token=DVC3QJkPjl1w-0OFBXevVadQ8QKv_RVtTxIe").object();
                  JSONObject jsonMeta = json.getJSONObject("_meta");
                  System.out.println(" "+jsonMeta.get("success"));
                  jsonArrayResultC = json.getJSONArray("result");
            } catch (Exception ex) {
                Logger.getLogger(SingletonDescarga.class.getName()).log(Level.SEVERE, null, ex);
            }
        }      
        return jsonArrayResultC; 
    }
}
