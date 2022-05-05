package com.edu.ucentral.modelo;

import org.springframework.context.annotation.Bean;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "ticket")
public class ticket {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String tipo_solicitud;
    private String fecha_de_apertura;
    private String fecha_de_cierre;
    private String nombre_de_solicitud;
    private String detalle;
    private String estado_solicitud;

    public ticket() {}

    public ticket(Long id, String tipo_solicitud, String fecha_de_apertura, String fecha_de_cierre, String nombre_de_solicitud, String detalle, String estado_solicitud) {
        Id = id;
        this.tipo_solicitud = tipo_solicitud;
        this.fecha_de_apertura = fecha_de_apertura;
        this.fecha_de_cierre = fecha_de_cierre;
        this.nombre_de_solicitud = nombre_de_solicitud;
        this.detalle = detalle;
        this.estado_solicitud = estado_solicitud;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTipo_solicitud() {
        return tipo_solicitud;
    }

    public void setTipo_solicitud(String tipo_solicitud) {
        this.tipo_solicitud = tipo_solicitud;
    }

    public String getFecha_de_apertura() {
        return fecha_de_apertura;
    }

    public void setFecha_de_apertura(String fecha_de_apertura) {
        this.fecha_de_apertura = fecha_de_apertura;
    }

    public String getFecha_de_cierre() {
        return fecha_de_cierre;
    }

    public void setFecha_de_cierre(String fecha_de_cierre) {
        this.fecha_de_cierre = fecha_de_cierre;
    }

    public String getNombre_de_solicitud() {
        return nombre_de_solicitud;
    }

    public void setNombre_de_solicitud(String nombre_de_solicitud) {
        this.nombre_de_solicitud = nombre_de_solicitud;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getEstado_solicitud() {
        return estado_solicitud;
    }

    public void setEstado_solicitud(String estado_solicitud) {
        this.estado_solicitud = estado_solicitud;
    }
}
