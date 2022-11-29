
package com.tutorial.crud.contact.dto;

import com.tutorial.crud.emailpassword.dto.EmailValuesDTO;

public class Details {
    
    private String name;
    
    private String email;

    private String asunto;

    private String msgbox;
    
    private String nombreUsuario;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMsgbox() {
        return msgbox;
    }

    public void setMsgbox(String msgbox) {
        this.msgbox = msgbox;
    }
}