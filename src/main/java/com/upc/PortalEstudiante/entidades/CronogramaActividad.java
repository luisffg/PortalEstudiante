package com.upc.PortalEstudiante.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_CRONOGRAMAACTIVIDAD")
public class CronogramaActividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_actividad;
    private long id_cronogramacurso;
    private String observacion;


    public CronogramaActividad() {
    }

    public CronogramaActividad(long id_actividad, long id_cronogramacurso, String observacion) {
        this.id_actividad = id_actividad;
        this.id_cronogramacurso = id_cronogramacurso;
        this.observacion = observacion;
    }

    public long getId_actividad() {
        return id_actividad;
    }

    public void setId_actividad(long id_actividad) {
        this.id_actividad = id_actividad;
    }

    public long getId_cronogramacurso() {
        return id_cronogramacurso;
    }

    public void setId_cronogramacurso(long id_cronogramacurso) {
        this.id_cronogramacurso = id_cronogramacurso;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
