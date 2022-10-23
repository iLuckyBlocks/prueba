package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "DatosArrendador")
public class DatosArrendador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idArrendador;

    @Column(name = "rutaReferencia", length = 50, nullable = false)
    private String rutaReferencia;

    @Column(name = "Propiedad", length = 50, nullable = false)
    private String Propiedad;


    public DatosArrendador() {
    }

    public DatosArrendador(int idArrendador, String rutaReferencia, String propiedad) {
        this.idArrendador = idArrendador;
        this.rutaReferencia = rutaReferencia;
        this.Propiedad = propiedad;
    }

    public void setIdArrendador(int idArrendador) {
        this.idArrendador = idArrendador;
    }

    public void setRutaReferencia(String rutaReferencia) {
        this.rutaReferencia = rutaReferencia;
    }

    public void setPropiedad(String propiedad) {
        this.Propiedad = propiedad;
    }
}
