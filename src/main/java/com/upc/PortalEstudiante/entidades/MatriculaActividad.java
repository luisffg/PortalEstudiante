package com.upc.PortalEstudiante.entidades;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "TBL_MATRICULAACTIVIDAD")
public class MatriculaActividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_matriculaactividad;
    private long id_detalle;
    private long id_actividad;
    private double calificacion;
    private Date fechaentrega;
    private Date fechaenviado;
    private String observaacion;

    public MatriculaActividad() {
    }

    public MatriculaActividad(long id_matriculaactividad, long id_detalle, long id_actividad, double calificacion, Date fechaentrega, Date fechaenviado, String observaacion) {
        this.id_matriculaactividad = id_matriculaactividad;
        this.id_detalle = id_detalle;
        this.id_actividad = id_actividad;
        this.calificacion = calificacion;
        this.fechaentrega = fechaentrega;
        this.fechaenviado = fechaenviado;
        this.observaacion = observaacion;
    }

    public long getId_matriculaactividad() {
        return id_matriculaactividad;
    }

    public void setId_matriculaactividad(long id_matriculaactividad) {
        this.id_matriculaactividad = id_matriculaactividad;
    }

    public long getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(long id_detalle) {
        this.id_detalle = id_detalle;
    }

    public long getId_actividad() {
        return id_actividad;
    }

    public void setId_actividad(long id_actividad) {
        this.id_actividad = id_actividad;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public Date getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(Date fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public Date getFechaenviado() {
        return fechaenviado;
    }

    public void setFechaenviado(Date fechaenviado) {
        this.fechaenviado = fechaenviado;
    }

    public String getObservaacion() {
        return observaacion;
    }

    public void setObservaacion(String observaacion) {
        this.observaacion = observaacion;
    }
}
