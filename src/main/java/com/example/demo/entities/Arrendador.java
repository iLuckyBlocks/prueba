package com.example.demo.entities;

import javax.persistence.*;
@Entity
@Table(name = "Arrendador")

public class Arrendador{
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int idArrendador;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "celular", nullable = false)
    private int celular;

    @Column(name = "correo_electronico", length = 50, nullable = false)
    private String correo_electronico;

    @Column(name = "username", length = 50, nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private int password;

    @Column(name = "direccion", length = 50, nullable = false)
    private String direccion;

    public Arrendador(){
    }

    public Arrendador(int idArrendador, String nombre, int celular, String correo_electronico, String username, int password, String direccion){
        this.idArrendador = idArrendador;
        this.nombre = nombre;
        this.correo_electronico = correo_electronico;
        this.celular = celular;
        this.username = username;
        this.password = password;
        this.direccion = direccion;
    }

    public int getIdArrendador() {
        return idArrendador;
    }

    public void setIdArrendador(int idArrendador) {
        this.idArrendador = idArrendador;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
