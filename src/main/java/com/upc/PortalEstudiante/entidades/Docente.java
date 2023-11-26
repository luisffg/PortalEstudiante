package com.upc.PortalEstudiante.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_DOCENTE")
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_docente;
    private long id_persona;
    private String codigo;
    private String password;

    public Docente() {
    }

    public Docente(long id_docente, long id_persona, String codigo, String password) {
        this.id_docente = id_docente;
        this.id_persona = id_persona;
        this.codigo = codigo;
        this.password = password;
    }

    public long getId_docente() {
        return id_docente;
    }

    public void setId_docente(long id_docente) {
        this.id_docente = id_docente;
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
