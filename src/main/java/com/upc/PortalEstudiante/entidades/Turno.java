package com.upc.PortalEstudiante.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_TURNO")
public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_turno;
    private String descripcion;

    public Turno() {
    }

    public Turno(long id_turno, String descripcion) {
        this.id_turno = id_turno;
        this.descripcion = descripcion;
    }

    public long getId_turno() {
        return id_turno;
    }

    public void setId_turno(long id_turno) {
        this.id_turno = id_turno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
