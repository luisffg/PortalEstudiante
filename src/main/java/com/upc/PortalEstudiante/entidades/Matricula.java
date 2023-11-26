package com.upc.PortalEstudiante.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_MATRICULA")
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_matricula;
    private long id_estudiante;
    private long id_gradoseccion;
    private long anho;
    private String observacion;

    public Matricula() {
    }

    public Matricula(long id_matricula, long id_estudiante, long id_gradoseccion, long anho, String observacion) {
        this.id_matricula = id_matricula;
        this.id_estudiante = id_estudiante;
        this.id_gradoseccion = id_gradoseccion;
        this.anho = anho;
        this.observacion = observacion;
    }

    public long getId_matricula() {
        return id_matricula;
    }

    public void setId_matricula(long id_matricula) {
        this.id_matricula = id_matricula;
    }

    public long getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(long id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public long getId_gradoseccion() {
        return id_gradoseccion;
    }

    public void setId_gradoseccion(long id_gradoseccion) {
        this.id_gradoseccion = id_gradoseccion;
    }

    public long getAnho() {
        return anho;
    }

    public void setAnho(long anho) {
        this.anho = anho;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
