package com.example.demo.entities;

import javax.persistence.*;


@Entity
@Table(name = "Anuncio")
public class Anuncio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnuncio;


    @Column(name = "imagen", length = 50, nullable = false)
    private String imagen;

    @Column(name = "titulo", length = 50, nullable = false)
    private String titulo;

    @Column(name = "FechaA", length = 50, nullable = false)
    private String FechaA;

    @Column(name = "CEstudiante", nullable = false)
    private int CEstudiante;


    public Anuncio() {
    }

    public Anuncio(int idAnuncio, String imagen, String titulo, String fechaA, int CEstudiante) {
        this.idAnuncio = idAnuncio;
        this.imagen = imagen;
        this.titulo = titulo;
        this.FechaA = fechaA;
        this.CEstudiante = CEstudiante;
    }

    public int getIdAnuncio() {
        return idAnuncio;
    }

    public void setIdAnuncio(int idAnuncio) {
        this.idAnuncio = idAnuncio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaA() {
        return FechaA;
    }

    public void setFechaA(String fechaA) {
        this.FechaA = fechaA;
    }

    public int getCEstudiante() {
        return CEstudiante;
    }

    public void setCEstudiante(int CEstudiante) {
        this.CEstudiante = CEstudiante;
    }
}
