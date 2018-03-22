/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorLogin;


/**
 *
 * @author Usuario
 */
public class Usuario {
    private String userName;
    private String userPassword;
    private String email;

    public Usuario(String userName, String userPassword, String email) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.email = email;
    }

    public Usuario() {
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    @Override
    public String toString() {
        return "Usuario [NickName=" + userName +"Contraseña="
                + userPassword + "email="
                + email + "]";
    }    
}
