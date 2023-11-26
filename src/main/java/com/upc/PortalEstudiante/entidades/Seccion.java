package com.upc.PortalEstudiante.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_SECCION")
public class Seccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_seccion;
    private String descripcion;

    public Seccion() {
    }

    public Seccion(long id_seccion, String descripcion) {
        this.id_seccion = id_seccion;
        this.descripcion = descripcion;
    }

    public long getId_seccion() {
        return id_seccion;
    }

    public void setId_seccion(long id_seccion) {
        this.id_seccion = id_seccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
