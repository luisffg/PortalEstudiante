package com.upc.PortalEstudiante.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_CRONOGRAMA")
public class Cronograma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_cronograma;
    private long id_turno;
    private long anho;
    private String periodo;
    private String descripcion;

    public Cronograma() {
    }

    public Cronograma(long id_cronograma, long id_turno, long anho, String periodo, String descripcion) {
        this.id_cronograma = id_cronograma;
        this.id_turno = id_turno;
        this.anho = anho;
        this.periodo = periodo;
        this.descripcion = descripcion;
    }

    public long getId_cronograma() {
        return id_cronograma;
    }

    public void setId_cronograma(long id_cronograma) {
        this.id_cronograma = id_cronograma;
    }

    public long getId_turno() {
        return id_turno;
    }

    public void setId_turno(long id_turno) {
        this.id_turno = id_turno;
    }

    public long getAnho() {
        return anho;
    }

    public void setAnho(long anho) {
        this.anho = anho;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
