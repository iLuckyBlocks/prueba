package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "Contrato")
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrato;


    @Column(name = "FechaC", length = 50, nullable = false)
    private String FechaC;

    @Column(name = "HoraC", length = 50, nullable = false)
    private String HoraC;

    @Column(name = "DetallesContrato", length = 50, nullable = false)
    private String DetallesContrato;

    @Column(name = "MontoPrevisto", length = 50, nullable = false)
    private Float MontoPrevisto;

    @Column(name = "RmetodoPago", length = 50, nullable = false)
    private String RmetodoPago;

    @Column(name = "Proceso", length = 50, nullable = false)
    private Boolean Proceso;

    public Contrato() {
    }

    public Contrato(int idContrato, String fechaC, String horaC, String detallesContrato, Float montoPrevisto, String rmetodoPago, Boolean proceso) {
        this.idContrato = idContrato;
        this.FechaC = fechaC;
        this.HoraC = horaC;
        this.DetallesContrato = detallesContrato;
        this.MontoPrevisto = montoPrevisto;
        this.RmetodoPago = rmetodoPago;
        this.Proceso = proceso;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
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

    public String getDetallesContrato() {
        return DetallesContrato;
    }

    public void setDetallesContrato(String detallesContrato) {
        this.DetallesContrato = detallesContrato;
    }

    public Float getMontoPrevisto() {
        return MontoPrevisto;
    }

    public void setMontoPrevisto(Float montoPrevisto) {
        this.MontoPrevisto = montoPrevisto;
    }

    public String getRmetodoPago() {
        return RmetodoPago;
    }

    public void setRmetodoPago(String rmetodoPago) {
        this.RmetodoPago = rmetodoPago;
    }

    public Boolean getProceso() {
        return Proceso;
    }

    public void setProceso(Boolean proceso) {
        this.Proceso = proceso;
    }
}
