package com.upc.PortalEstudiante.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_DOCENTECURSO")
public class DocenteCurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_docentecurso;
    private long id_docente;
    private long id_cronogramacurso;
    private String observacion;

    public DocenteCurso() {
    }

    public DocenteCurso(long id_docentecurso, long id_docente, long id_cronogramacurso, String observacion) {
        this.id_docentecurso = id_docentecurso;
        this.id_docente = id_docente;
        this.id_cronogramacurso = id_cronogramacurso;
        this.observacion = observacion;
    }

    public long getId_docentecurso() {
        return id_docentecurso;
    }

    public void setId_docentecurso(long id_docentecurso) {
        this.id_docentecurso = id_docentecurso;
    }

    public long getId_docente() {
        return id_docente;
    }

    public void setId_docente(long id_docente) {
        this.id_docente = id_docente;
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
