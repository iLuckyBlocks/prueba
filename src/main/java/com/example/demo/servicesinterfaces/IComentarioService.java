package com.example.demo.servicesinterfaces;

import com.example.demo.entities.Comentario;

import java.util.List;

public interface IComentarioService {
    public void insert(Comentario comentario);
    List<Comentario>list();
}
