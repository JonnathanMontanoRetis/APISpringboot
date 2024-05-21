package com.library.librarysystem.entities;
	
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;


@Entity
@Table(name = "prestamo")
public class Prestamo {
    @Id 
    private String id_reserva;

    @Basic
    private String id_user;
    private String id_ejemplar;
    private String id_admin;
    private Integer dias_prestamo;
    private String estado; 

    @Temporal(TemporalType.DATE)
    private Date fecha_prestamo;
    @Temporal(TemporalType.DATE)
    private Date fecha_devolucion;
    
    public String getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(String id_reserva) {
        this.id_reserva = id_reserva;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getId_ejemplar() {
        return id_ejemplar;
    }

    public void setId_ejemplar(String id_ejemplar) {
        this.id_ejemplar = id_ejemplar;
    }

    public String getId_admin() {
        return id_admin;
    }

    public void setId_admin(String id_admin) {
        this.id_admin = id_admin;
    }

    public Integer getDias_prestamo() {
        return dias_prestamo;
    }

    public void setDias_prestamo(Integer dias_prestamo) {
        this.dias_prestamo = dias_prestamo;
    }

    public Date getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(Date fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public Date getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(Date fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
  
  
}
