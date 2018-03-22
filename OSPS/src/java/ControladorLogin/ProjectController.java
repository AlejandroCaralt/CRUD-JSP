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
public class ProjectController {

    public String getViewProjects(){
        String htmlcode = "";
        Consultas consulta = new Consultas();
        for(Proyecto p : consulta.getAllProjects()){
            String admin = "";
            if(p.getAdminProyecto() == null){admin ="*Sin asignar*";} else{ admin = p.getAdminProyecto();};
            htmlcode += "<tr>\n" +
"                    <td>"+p.getNombreProyecto()+"</td>\n" +
"                    <td>"+p.getLenguajeProyecto()+"</td>\n" +
"                    <td><a href="+p.getGithub()+">"+p.getGithub()+"</td>\n" +
"                    <td>"+admin+"</td>\n" +
"                    <td>"+p.getFechaInicio()+"</td>\n" +
"                    <td>"+p.getDescripcionProyecto()+"</td>\n" +
"                </tr>";
        }
        return htmlcode;
    }
    public String getUpdateProject(){
        String htmlcode ="";
        Consultas consulta = new Consultas();
        for(Proyecto p : consulta.getAllProjects()){
            htmlcode += "<tr>\n<form action= 'UpdateProyecto' method='POST'>" +
"                    <td><input type='number' value='"+p.getProjectId()+"' readonly></td>\n" +
"                    <td><input type='text' value='"+p.getNombreProyecto()+"'></td>\n" +
"                    <td><input type='text' value='"+p.getLenguajeProyecto()+"'></td>\n" +
"                    <td><input type='text' value='"+p.getGithub()+"'></td>\n" +
"                    <td>"+p.getAdminProyecto()+"</td>\n" +
"                    <td>"+p.getFechaInicio()+"</td>\n" +
"                    <td><input type='text' value='"+p.getDescripcionProyecto()+"'></td>\n" +
"                    <td><input type='submit' value='Modificar'></td>\n" +
"                    <td><input type='submit' value='Eliminar'></td>\n" +
"                </tr>\n" +
"                </form></tr>";
        }
    return htmlcode;
    }

    public String getViewUsuarios(){
        String htmlcode = "";
        Consultas consulta = new Consultas();
        for(Usuario p : consulta.getAllUsuarios()){
            String correo = "";
            if(p.getEmail() == null){
                correo+= "-------";
            } else {
                correo = p.getEmail();
            }
            htmlcode += "<tr>\n" +
"                    <td>"+p.getUserName()+"</td>\n" +
"                    <td>"+correo+"</td>\n" +
"                </tr>";
        }
        return htmlcode;
    }
}
