package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "celular", nullable = false)
    private int celular;

    @Column(name = "correo_electronico", length = 50, nullable = false)
    private String correo_electronico;

    @Column(name = "password", nullable = false)
    private int password;

    @Column(name = "pais", length = 50, nullable = false)
    private String pais;


    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, int celular, String correo_electronico, int password, String pais) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.celular = celular;
        this.correo_electronico = correo_electronico;
        this.password = password;
        this.pais = pais;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
