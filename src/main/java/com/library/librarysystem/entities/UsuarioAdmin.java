package com.library.librarysystem.entities;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "usuario_admin")
public class UsuarioAdmin implements Serializable {
    @Id
    private String id_admin;
    
    @Basic        
    private String userAdmin;
    private String passAdmin;

    public String getId_admin() {
        return id_admin;
    }

    public void setId_admin(String id_admin) {
        this.id_admin = id_admin;
    }

    public String getUser_admin() {
        return userAdmin;
    }

    public void setUser_admin(String userAdmin) {
        this.userAdmin = userAdmin;
    }

    public String getContraseña_admin() {
        return passAdmin;
    }

    public void setContraseña_admin(String passAdmin) {
        this.passAdmin = passAdmin;
    }
    
    
}
