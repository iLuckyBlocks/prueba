package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name="MetodoPago")
public class MetodoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdMetodoPago;

    @Column(name = "FormaPago", length = 50, nullable = false)
    private String FormaPago;

    public MetodoPago(){

    }

    public MetodoPago(int IdMetodoPago, String FormaPago){
        this.IdMetodoPago = IdMetodoPago;
        this.FormaPago = FormaPago;
    }



    public String getFormaPago() {
        return FormaPago;
    }

    public int getIdMetodoPago() {
        return IdMetodoPago;
    }

    public void setIdMetodoPago(int idMetodoPago) {
        IdMetodoPago = idMetodoPago;
    }

    public void setFormaPago(String formaPago) {
        FormaPago = formaPago;
    }
}
