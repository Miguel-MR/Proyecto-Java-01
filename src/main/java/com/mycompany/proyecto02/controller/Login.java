/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.proyecto02.controller;

import com.mycompany.proyecto02.entities.Users;
import com.mycompany.proyecto02.services.UsersFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 */
@Named(value = "login")
@SessionScoped
public class Login implements Serializable {

    /**
     * Creates a new instance of Login
     */
    private String usuario;
    private String contrasenna;
    private Users user = new Users();
    @EJB
    UsersFacadeLocal ufl;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }
    
    public String iniciarSesion(){
        user = this.ufl.iniciarSesion(usuario, contrasenna);
        if(user.getEmployeeId()!=null){
            return "/views/index.xhtml";
        }else{
            FacesContext contexto = FacesContext.getCurrentInstance();
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Usuario y/o contraseña invalidos","MSG_ERROR");
            contexto.addMessage(null, fm);
            return null;
        }
    }
    
    public Login() {
    }
    
}
 