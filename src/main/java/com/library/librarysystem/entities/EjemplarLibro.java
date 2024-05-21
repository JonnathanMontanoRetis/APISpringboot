package com.library.librarysystem.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "ejemplar_libro")
public class EjemplarLibro implements Serializable {
    @Id
    private String id_ejemplar;
    @Basic          
    private String cod_inv;
    private String numero;
    private String estatus;

    public String getId_ejemplar() {
        return id_ejemplar;
    }

    public void setId_ejemplar(String id_ejemplar) {
        this.id_ejemplar = id_ejemplar;
    }

    public String getCod_inv() {
        return cod_inv;
    }

    public void setCod_inv(String cod_inv) {
        this.cod_inv = cod_inv;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}
