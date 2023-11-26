package com.upc.PortalEstudiante.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_PERSONA")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_persona;
    private String apellidos;
    private String nombres;
    private String documento;
    private String sexo;
    private String email;
    private String telefono;
    private String fechaNacinmiento;
    private String direccion;

    public Persona() {
    }

    public Persona(long id_persona, String apellidos, String nombres, String documento, String sexo, String email, String telefono, String fechaNacinmiento, String direccion) {
        this.id_persona = id_persona;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.documento = documento;
        this.sexo = sexo;
        this.email = email;
        this.telefono = telefono;
        this.fechaNacinmiento = fechaNacinmiento;
        this.direccion = direccion;
    }

    public long getId_persona() {
        return id_persona;
    }

    public void setId_persona(long id_persona) {
        this.id_persona = id_persona;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacinmiento() {
        return fechaNacinmiento;
    }

    public void setFechaNacinmiento(String fechaNacinmiento) {
        this.fechaNacinmiento = fechaNacinmiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
