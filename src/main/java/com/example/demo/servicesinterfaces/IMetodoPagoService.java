package com.example.demo.servicesinterfaces;

import com.example.demo.entities.MetodoPago;

import java.util.List;


public interface IMetodoPagoService {

    public void insert(MetodoPago metodopago);
    List<MetodoPago>list();

    public void delete(int IdMetodoPago);

    List<MetodoPago> search(String nameFormaPago);
}
