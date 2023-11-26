package com.upc.PortalEstudiante.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_CURSO")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_curso;
    private String descripcion;

    public Curso() {
    }

    public Curso(long id_curso, String descripcion) {
        this.id_curso = id_curso;
        this.descripcion = descripcion;
    }

    public long getId_curso() {
        return id_curso;
    }

    public void setId_curso(long id_curso) {
        this.id_curso = id_curso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
