package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "TipodeIdentificacion")
public class TipodeIdentificacion {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIdentificacion;
@Column(name = "tipoIdentificacion", length = 50, nullable = false)
    private String tipoIdentificacion;

    public TipodeIdentificacion() {
    }

    public TipodeIdentificacion(int idIdentificacion, String tipoIdentificacion) {
        this.idIdentificacion = idIdentificacion;
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public int getIdIdentificacion() {
        return idIdentificacion;
    }

    public void setIdIdentificacion(int idIdentificacion) {
        this.idIdentificacion = idIdentificacion;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }
}
