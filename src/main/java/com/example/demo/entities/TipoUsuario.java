package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "TipoUsuario")
public class TipoUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoUser;

    @Column(name = "TypeUsuario", length = 80, nullable = false)
    private String TypeUsuario;

    public TipoUsuario() {}

    public TipoUsuario(int idTipoUser, String tipoUsuario) {
        this.idTipoUser = idTipoUser;
        this.TypeUsuario = tipoUsuario;
    }

    public int getIdTipoUser() {return idTipoUser;}

    public void setIdTipoUser(int idTipoUsuario) {this.idTipoUser = idTipoUsuario;}
    public String getTipoUsuario() {return TypeUsuario;}
    public void setTipoUsuario(String tipoUsuario) {this.TypeUsuario = tipoUsuario;}

}
