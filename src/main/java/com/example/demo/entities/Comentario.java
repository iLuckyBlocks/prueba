package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "Comentario")
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComentario;

    @Column(name = "coment", length = 50, nullable = false)
    private String coment;

    @Column(name = "FechaC", length = 50, nullable = false)
    private String FechaC;

    @Column(name = "HoraC", length = 50, nullable = false)
    private String HoraC;

    public Comentario() {
    }

    public Comentario(int idComentario, String coment, String fechaC, String horaC) {
        this.idComentario = idComentario;
        this.coment = coment;
        this.FechaC = fechaC;
        this.HoraC = horaC;
    }


    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public String getComent() {
        return coment;
    }

    public void setComent(String coment) {
        this.coment = coment;
    }

    public String getFechaC() {
        return FechaC;
    }

    public void setFechaC(String fechaC) {
        this.FechaC = fechaC;
    }

    public String getHoraC() {
        return HoraC;
    }

    public void setHoraC(String horaC) {
        this.HoraC = horaC;
    }
}
