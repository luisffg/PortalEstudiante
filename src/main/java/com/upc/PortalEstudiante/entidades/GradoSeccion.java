package com.upc.PortalEstudiante.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_GRADOSECCION")
public class GradoSeccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_gradoseccion;
    private long id_grado;
    private long id_seccion;
    private String descripcion;

    public GradoSeccion() {
    }

    public GradoSeccion(long id_gradoseccion, long id_grado, long id_seccion, String descripcion) {
        this.id_gradoseccion = id_gradoseccion;
        this.id_grado = id_grado;
        this.id_seccion = id_seccion;
        this.descripcion = descripcion;
    }

    public long getId_gradoseccion() {
        return id_gradoseccion;
    }

    public void setId_gradoseccion(long id_gradoseccion) {
        this.id_gradoseccion = id_gradoseccion;
    }

    public long getId_grado() {
        return id_grado;
    }

    public void setId_grado(long id_grado) {
        this.id_grado = id_grado;
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
