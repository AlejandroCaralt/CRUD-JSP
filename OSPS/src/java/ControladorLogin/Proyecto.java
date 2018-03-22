/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorLogin;

import java.sql.Date;

/**
 *
 * @author Usuario
 */
public class Proyecto {
    private int projectId;
    private String nombreProyecto;
    private String lenguajeProyecto;
    private String github;
    private String adminProyecto;
    private Date fechaInicio;
    private String descripcionProyecto;
    
    public Proyecto(){
        
    }

    public Proyecto(int projectId, String nombreProyecto, String lenguajeProyecto, String github, String adminProyecto, Date fechaInicio, String descripcionProyecto) {
        this.projectId = projectId;
        this.nombreProyecto = nombreProyecto;
        this.lenguajeProyecto = lenguajeProyecto;
        this.github = github;
        this.adminProyecto = adminProyecto;
        this.fechaInicio = fechaInicio;
        this.descripcionProyecto = descripcionProyecto;
    }


    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getLenguajeProyecto() {
        return lenguajeProyecto;
    }

    public void setLenguajeProyecto(String lenguajeProyecto) {
        this.lenguajeProyecto = lenguajeProyecto;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getAdminProyecto() {
        return adminProyecto;
    }

    public void setAdminProyecto(String adminProyecto) {
        this.adminProyecto = adminProyecto;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getDescripcionProyecto() {
        return descripcionProyecto;
    }

    public void setDescripcionProyecto(String descripcionProyecto) {
        this.descripcionProyecto = descripcionProyecto;
    }
    
    
}
