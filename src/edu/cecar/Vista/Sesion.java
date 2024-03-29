package edu.cecar.Vista;

/** Clase: Sesion
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

import edu.cecar.Controlador.SingletonDescarga;
import edu.cecar.Modelo.Album;
import edu.cecar.Modelo.Comentario;
import edu.cecar.Modelo.Foto;
import edu.cecar.Modelo.Publicacion;
import edu.cecar.Modelo.Usuario;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Sesion extends javax.swing.JFrame {

    private SingletonDescarga singletonDescarga = new SingletonDescarga();
    
    private ArrayList<Usuario> listaUsuarios = null;
    private ArrayList<Comentario> listaComentarios     = null;
    private ArrayList<Publicacion> listaPublicaciones = null; 
    private ArrayList<Album> listaAlbumes = null; 
    private ArrayList<Foto>   listaFotos = null; 
    
    public Sesion() {    
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        this.setIconImage (new ImageIcon(getClass().getResource("/edu/cecar/Recursos/Icono.png")).getImage());
    }
        
        Object[][] datos = {};
        Object[][] datos1 = {};
        Object[][] datos2 = {};
        Object[][] datos3 = {};
        Object[][] datos4 = {};
        
        String[] cPublicacaiones = {" ID publicacion", " Titulo ", " Cuerpo"};
        String[] cUsuarios = {"Id","Estado","Primer Nombre","Apellido","Género","Telefono","dob","Dirrección","Email","Sitio Web"};
        String[] cComentarios = {"  ID Comentario ", "  Nombre ", "  Email ", "  Cuerpo "};
        String[] cAlbumes = {" ID Album "," Titulo "};
        String[] cFotos = {"  ID  "," Titulo "," URl Imagen "," Miniatura "};
        
        DefaultTableModel modeloPublicaciones = new DefaultTableModel(datos,cPublicacaiones);
        DefaultTableModel modeloComentarios = new DefaultTableModel(datos2,cComentarios);
        DefaultTableModel modeloUsuarios = new DefaultTableModel(datos1,cUsuarios);
        DefaultTableModel modeloAlbums = new DefaultTableModel(datos3,cAlbumes);
        DefaultTableModel modeloFotos = new DefaultTableModel(datos4,cFotos);
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Información");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(10, 12, 130, 30);

        jButton1.setText("Buscar");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(150, 10, 90, 30);

        jTable1.setModel(modeloPublicaciones);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 70, 452, 150);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(260, 10, 70, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(340, 10, 130, 30);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel5.setText("Lista de Publiaciones");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 45, 180, 20);

        jTable3.setModel(modeloComentarios);
        jScrollPane3.setViewportView(jTable3);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(10, 250, 910, 150);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel8.setText("Lista de Comentarios");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 220, 240, 30);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel9.setText("Lista de Albumes");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(490, 44, 130, 20);

        jTable4.setModel(modeloAlbums);
        jScrollPane4.setViewportView(jTable4);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(480, 70, 452, 150);

        jTable5.setModel(modeloFotos);
        jScrollPane5.setViewportView(jTable5);

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(10, 430, 570, 150);

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel10.setText("Lista de Fotos");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 400, 120, 30);

        jLabel11.setText("imagen");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(610, 430, 160, 150);

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel12.setText("Foto del Usuario");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(630, 404, 100, 30);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jPanel3);
        jPanel3.setBounds(250, 10, 680, 30);

        jTabbedPane1.addTab("Busqueda", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(null);

        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 255));
        jButton2.setText("Listar");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(267, 10, 90, 30);

        jComboBox1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 153, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Nombre", "Apellido", "Telefono" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(143, 10, 110, 30);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Criterio Listado");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 10, 130, 30);

        jTable2.setBackground(new Color(65, 65, 65));
        jTable2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(255, 255, 255)));
        jTable2.setFont(new Font( "Verdana",Font.PLAIN ,12 ));
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(modeloUsuarios);
        jTable2.setToolTipText("");
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(10, 64, 935, 250);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cecar/Recursos/lista.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(892, 0, 45, 67);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setText("Lista de personas, si desea puede listar de acuerdo a varios criterios.");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(382, 11, 500, 20);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 255));
        jLabel7.setText("Segun el criterio que elija se ordenará en la tabla");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(380, 30, 390, 17);

        jTabbedPane1.addTab("Listas", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 960, 610));

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton3.setText("Cerrar Sesión");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 150, 30));

        setSize(new java.awt.Dimension(1016, 696));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int id = Integer.parseInt(jTextField1.getText());
        boolean estado = false;
        String[] lista = new String[3];
        String[] lista2 = new String[4];
        String[] lista3 = new String[2];
        Object[] lista4 = new Object[4];
                    
        if(listaUsuarios==null){
            listaUsuarios = new ArrayList<Usuario>();
            for(int i=0; i<singletonDescarga.getSizeUsuarios(); i++){
               listaUsuarios.add(singletonDescarga.getUsuarios(i));
            }
        }
        
        if (listaPublicaciones==null){
            listaPublicaciones = new ArrayList<Publicacion>(); 
            for(int i=0; i<singletonDescarga.getSizePublicaciones(); i++){
                listaPublicaciones.add(singletonDescarga.getPublicacion(i));
            }
        }
        
        if(listaComentarios==null){
            listaComentarios = new ArrayList<Comentario>();
            for(int i=0; i<singletonDescarga.getSizeComentarios(); i++){
                listaComentarios.add(singletonDescarga.getComentario(i));
            }
        }
        
        if(listaAlbumes==null){
            listaAlbumes =  new ArrayList<Album>(); 
            for(int i=0; i<singletonDescarga.getSizeAlbumes(); i++){
                listaAlbumes.add(singletonDescarga.getAlbum(i));
            } 
        }
        
        if(listaFotos==null){
            listaFotos = new ArrayList<Foto>();
            for(int i=0; i<singletonDescarga.getSizeFotos(); i++){
                listaFotos.add(singletonDescarga.getFoto(i));
            }
        }
        
      
        for(int i=0; i<20; i++){
            if(id==listaUsuarios.get(i).getId()){
                jLabel2.setText(listaUsuarios.get(i).getFirt_name());
            }
            if(id==listaPublicaciones.get(i).getId()){
                lista[0] = ""+listaPublicaciones.get(i).getUser_id();
                lista[1] = listaPublicaciones.get(i).getTitle();
                lista[2]= listaPublicaciones.get(i).getBody();
                modeloPublicaciones.addRow(lista);
                estado = true;
            }
        }
        
        for(int i=0; i<20; i++){
            if(id==listaComentarios.get(i).getId()){
                lista2[0] = ""+listaComentarios.get(i).getPost_id();
                lista2[1] = listaComentarios.get(i).getName();
                lista2[2] = listaComentarios.get(i).getEmail();
                lista2[3] = listaComentarios.get(i).getBody();
                modeloComentarios.addRow(lista2);
            }
        }
        
        for(int i=0; i<20; i++){
            if(id==listaAlbumes.get(i).getId()){
                lista3[0] = ""+listaAlbumes.get(i).getUser_id();
                lista3[1] = listaAlbumes.get(i).getTitle();
                modeloAlbums.addRow(lista3);
            }
        }
        
        for(int i=0; i<20; i++){
            if(id==listaFotos.get(i).getId()){
                lista4[0] = ""+listaFotos.get(i).getAlbum_id();
                lista4[1] = listaFotos.get(i).getTitle();
                lista4[2] = listaFotos.get(i).getUrl();
                lista4[3] = listaFotos.get(i).getThumbnail();
                modeloFotos.addRow(lista4);
                Image imagen = null;
                try {
                    URL url = new URL("https://lorempixel.com/150/150/abstract/?76583");
                    
                    try {
                        imagen = ImageIO.read(url);
                    } catch (IOException ex) {
                        Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel11.setIcon(new ImageIcon(imagen));
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
        
        if(!estado){
            JOptionPane.showMessageDialog(this,"No se encontro coincidencia",
                                                                 "Error de Busqueda",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String[] fila = new String[10];
        
        
        if(listaUsuarios==null){
            listaUsuarios = new ArrayList<Usuario>();
            for(int i=0; i<singletonDescarga.getSizeUsuarios(); i++){
            listaUsuarios.add(singletonDescarga.getUsuarios(i));
            }
        }
        
        
        for(int i=0; i<listaUsuarios.size(); i++){
                fila[0] = ""+listaUsuarios.get(i).getId();
                fila[1] = listaUsuarios.get(i).getStatus();
                fila[2] = listaUsuarios.get(i).getFirt_name();
                fila[3] = listaUsuarios.get(i).getLast_name();
                fila[4] = listaUsuarios.get(i).getGender();
                fila[5] = listaUsuarios.get(i).getPhone();
                fila[6] = listaUsuarios.get(i).getDob();
                fila[7] = listaUsuarios.get(i).getAddress();
                fila[8] = listaUsuarios.get(i).getEmail();
                fila[9] = listaUsuarios.get(i).getWebsite();
            modeloUsuarios.addRow(fila);
        }
        jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
       System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String[] fila = new String[10];
        jButton2.setEnabled(true);
        /*
        for(int i=0; i<20; i++){    
          switch(listaUsuarios.get(1).getFirt_name().toLowerCase().charAt(0)){
            case 'a': break;
            case 'b': break;
            case 'c': break;
            case 'd': break;
            case 'e': break;
            case 'f': break;
            case 'g': break;
            case 'h': break;
            case 'i': break;
            case 'j': break;
            case 'k': break;
            case 'l': break;
            case 'm': break;
            case 'n': break;
            case 'ñ': break;
            case 'o': break;
            case 'p': break;
            case 'q': break;
            case 'r': break;
            case 's': break;
            case 't': break;
            case 'u': break;
            case 'w': break;
            case 'x': break;
            case 'y': break;
            case 'z': break;
        }
        }*/
    }//GEN-LAST:event_jComboBox1ActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
