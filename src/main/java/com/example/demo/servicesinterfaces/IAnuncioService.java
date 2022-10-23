package com.example.demo.servicesinterfaces;

import com.example.demo.entities.Anuncio;

import java.util.List;

public interface IAnuncioService {
    public void insert(Anuncio anuncio);
    List<Anuncio>list();
}
