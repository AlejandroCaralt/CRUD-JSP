/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorLogin;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;

/**
 *
 * @author Usuario
 */
public class Consultas extends Conexion {
    
    public boolean auttenticacion (String usuario, String contraseña){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try{
            String consulta = "SELECT * FROM login WHERE userName = ? AND userPassword = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, contraseña);
            rs = pst.executeQuery();
            
            if(rs.absolute(1)){
                return true;
            }
            
        } catch(Exception e){
            System.err.println("Error" + e);
        } finally{
            try{
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
                if(rs != null) rs.close();
            } catch(Exception e){
                System.err.println("Error" + e);
            }
        }
        return false;
    }
    public boolean deleteProject(int projectId) {
         
        PreparedStatement pst = null; 
        
        try {
            String consulta = "DELETE FROM project WHERE projectId=?";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, projectId);
            
            if(pst.executeUpdate() == 1){
              return true;
            }

        } catch(Exception e){
            System.err.println("Error" + e);
        }finally{
            try{
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
            } catch(Exception e){
                System.err.println("Error" + e);
            }
        }
    return false;
    }
    public boolean deleteUser(String userName) {
         
        PreparedStatement pst = null; 
        
        try {
            String consulta = "DELETE FROM login WHERE userName=?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, userName);
            
            if(pst.executeUpdate() == 1){
              return true;
            }

        } catch(Exception e){
            System.err.println("Error" + e);
        }finally{
            try{
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
            } catch(Exception e){
                System.err.println("Error" + e);
            }
        }
    return false;
    }
    public boolean updateProyecto(int codigo,String nombre, String lenguaje, String github, String descripcion){
        PreparedStatement pst = null; 
        try {
            String consulta = "UPDATE project SET nombreProyecto=?,lenguajeProyecto=?,github=?,descripcionProyecto=?,  WHERE projectId=?";
            pst = getConexion().prepareStatement(consulta);
                pst.setString(1, nombre);
                pst.setString(2, lenguaje);
                pst.setString(3,github);
                pst.setString(4,descripcion);
                pst.setInt(5, codigo);
                pst.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try{
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
            } catch(Exception e){
                System.err.println("Error" + e);
            }
        }
    return false;
    }
     public ArrayList<Proyecto> getAllProjects() {
        ArrayList<Proyecto> proyectos = new ArrayList<Proyecto>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT * FROM project";
            pst = getConexion().prepareCall(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                proyectos.add(new Proyecto(rs.getInt("projectId"),
                rs.getString("nombreProyecto"),
                rs.getString("lenguajeProyecto"),
                rs.getString("github"),
                rs.getString("adminProyecto"),
                rs.getDate("fechaInicio"),
                rs.getString("descripcionProyecto")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try{
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
            } catch(Exception e){
                System.err.println("Error" + e);
            }
        }

        return proyectos;
    }
     
    public boolean entrarProyecto(int projectId, int userId){
        PreparedStatement pst = null;
        
        try{
             String consulta ="INSERT INTO activeproject (projectId, userId) VALUES (?,?) ";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, projectId);
            pst.setInt(2, userId);
          
            if(pst.executeUpdate() == 1){
              return true;
            }
        } catch(Exception e){
            System.err.println("Error" + e);
        }finally{
            try{
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
            } catch(Exception e){
                System.err.println("Error" + e);
            }
        }
        
        return false;
    }
        public ArrayList<Usuario> getAllUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT userName,email FROM login";
            pst = getConexion().prepareCall(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                usuarios.add(new Usuario(rs.getString("UserName"),
                rs.getString("userName"),
                rs.getString("email")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try{
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
            } catch(Exception e){
                System.err.println("Error" + e);
            }
        }

        return usuarios;
        }
    public boolean registrar(String nombre, String contraseña, String email){
      
        PreparedStatement pst = null;
      
        try{
             String consulta ="INSERT INTO login (userName, userPassword, email) VALUES (?,?,?) ";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, contraseña);
            pst.setString(3, email);
          
            if(pst.executeUpdate() == 1){
              return true;
            }
        } catch(Exception e){
            System.err.println("Error" + e);
        }finally{
            try{
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
            } catch(Exception e){
                System.err.println("Error" + e);
            }
        }
    return false;
    }
    public boolean registrarProyecto(String nombre, String lenguaje, String github, String descripcion){
      
        PreparedStatement pst = null;
      
        try{
             String consulta ="INSERT INTO project (nombreProyecto,lenguajeProyecto,github,descripcionProyecto ) VALUES (?,?,?,?) ";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, lenguaje);
            pst.setString(3, github);
            pst.setString(4, descripcion);
          
            if(pst.executeUpdate() == 1){
              return true;
            }
        } catch(Exception e){
            System.err.println("Error" + e);
        }finally{
            try{
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
            } catch(Exception e){
                System.err.println("Error" + e);
            }
        }
    return false;
    }
    
}
