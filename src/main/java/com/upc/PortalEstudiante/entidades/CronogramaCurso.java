package com.upc.PortalEstudiante.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_CRONOGRAMACURSO")
public class CronogramaCurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_cronogramacurso;
    private long id_cronograma;
    private long id_curso;
    private String codigo;
    private String descripcion;

    public CronogramaCurso() {
    }

    public CronogramaCurso(long id_cronogramacurso, long id_cronograma, long id_curso, String codigo, String descripcion) {
        this.id_cronogramacurso = id_cronogramacurso;
        this.id_cronograma = id_cronograma;
        this.id_curso = id_curso;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public long getId_cronogramacurso() {
        return id_cronogramacurso;
    }

    public void setId_cronogramacurso(long id_cronogramacurso) {
        this.id_cronogramacurso = id_cronogramacurso;
    }

    public long getId_cronograma() {
        return id_cronograma;
    }

    public void setId_cronograma(long id_cronograma) {
        this.id_cronograma = id_cronograma;
    }

    public long getId_curso() {
        return id_curso;
    }

    public void setId_curso(long id_curso) {
        this.id_curso = id_curso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
