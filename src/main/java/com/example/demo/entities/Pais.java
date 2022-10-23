package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "Pais")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPais;

    @Column(name = "pais", length = 80, nullable = false)
    private String pais;

    @Column(name = "region", length = 80, nullable = false)
    private String region;

    public Pais() {
    }

    public Pais(int idPais, String pais, String region) {
        this.idPais = idPais;
        this.pais = pais;
        this.region = region;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
