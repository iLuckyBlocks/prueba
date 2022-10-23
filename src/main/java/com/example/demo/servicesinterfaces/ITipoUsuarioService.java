package com.example.demo.servicesinterfaces;

import com.example.demo.entities.TipoUsuario;

import java.util.List;

public interface ITipoUsuarioService {

    public void insert(TipoUsuario typeUser);
    List<TipoUsuario>list();
    public void delete(int idTipoUsuario);
    List<TipoUsuario>search(String TipoUser);
}
