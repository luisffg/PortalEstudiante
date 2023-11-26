package com.upc.PortalEstudiante.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_MATRICULADETALLE")
public class MatriculaDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_detalle;
    private long id_cronogramacurso;
    private Double Puntuacion;
    private String observacion;

    public MatriculaDetalle() {
    }

    public MatriculaDetalle(long id_detalle, long id_cronogramacurso, Double puntuacion, String observacion) {
        this.id_detalle = id_detalle;
        this.id_cronogramacurso = id_cronogramacurso;
        Puntuacion = puntuacion;
        this.observacion = observacion;
    }

    public long getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(long id_detalle) {
        this.id_detalle = id_detalle;
    }

    public long getId_cronogramacurso() {
        return id_cronogramacurso;
    }

    public void setId_cronogramacurso(long id_cronogramacurso) {
        this.id_cronogramacurso = id_cronogramacurso;
    }

    public Double getPuntuacion() {
        return Puntuacion;
    }

    public void setPuntuacion(Double puntuacion) {
        Puntuacion = puntuacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
