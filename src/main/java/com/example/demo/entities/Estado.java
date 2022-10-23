package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "Estado")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstado;

    @Column(name = "proceso", nullable = false)
    private Boolean proceso;

    public Estado() {
    }

    public Estado(int idEstado, Boolean proceso) {
        this.idEstado = idEstado;
        this.proceso = proceso;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public Boolean getProceso() {
        return proceso;
    }

    public void setProceso(Boolean proceso) {
        this.proceso = proceso;
    }
}
