package com.example.demo.servicesinterfaces;

import com.example.demo.entities.Anuncio;
import com.example.demo.entities.Arrendador;
import com.example.demo.entities.Comentario;

import java.util.List;

public interface IArrendadorService {

    public void insert(Arrendador arrendador);
    List<Arrendador>list();

}
