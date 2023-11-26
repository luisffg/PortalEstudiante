package com.upc.PortalEstudiante.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_GRADO")
public class Grado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_grado;
    private String descripcion;

    public Grado() {
    }

    public Grado(long id_grado, String descripcion) {
        this.id_grado = id_grado;
        this.descripcion = descripcion;
    }

    public long getId_grado() {
        return id_grado;
    }

    public void setId_grado(long id_grado) {
        this.id_grado = id_grado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
