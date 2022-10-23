package com.example.demo.servicesinterfaces;

import com.example.demo.entities.TipodeIdentificacion;

import java.util.List;
import java.util.Optional;

public interface ITipodeIdentificacionService {
    public void insert(TipodeIdentificacion tipodeIdentificacion);
    List<TipodeIdentificacion>list();
    public void delete(int idIdentificacio);
    public Optional<TipodeIdentificacion>listarId(int idIdentificacion);
}
