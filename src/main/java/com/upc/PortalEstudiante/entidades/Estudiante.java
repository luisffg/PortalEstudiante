package com.upc.PortalEstudiante.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_ESTUDIANTE")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_estudiante;
    private long id_persona;
    private String  codigo;
    private String password;

    public Estudiante() {
    }

    public Estudiante(long id_estudiante, long id_persona, String codigo, String password) {
        this.id_estudiante = id_estudiante;
        this.id_persona = id_persona;
        this.codigo = codigo;
        this.password = password;
    }

    public long getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(long id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public long getId_persona() {
        return id_persona;
    }

    public void setId_persona(long id_persona) {
        this.id_persona = id_persona;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
