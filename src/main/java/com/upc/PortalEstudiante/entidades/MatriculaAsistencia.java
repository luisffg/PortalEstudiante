package com.upc.PortalEstudiante.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_MATRICULAASISTENCIA")
public class MatriculaAsistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_asistencia;
    private long id_detalle;
    private long id_estudiante;
    private long falta;
    private String observacion;

    public MatriculaAsistencia() {
    }

    public MatriculaAsistencia(long id_asistencia, long id_detalle, long id_estudiante, long falta, String observacion) {
        this.id_asistencia = id_asistencia;
        this.id_detalle = id_detalle;
        this.id_estudiante = id_estudiante;
        this.falta = falta;
        this.observacion = observacion;
    }

    public long getId_asistencia() {
        return id_asistencia;
    }

    public void setId_asistencia(long id_asistencia) {
        this.id_asistencia = id_asistencia;
    }

    public long getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(long id_detalle) {
        this.id_detalle = id_detalle;
    }

    public long getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(long id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public long getFalta() {
        return falta;
    }

    public void setFalta(long falta) {
        this.falta = falta;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
