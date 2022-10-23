package com.example.demo.servicesinterfaces;

import com.example.demo.entities.Pais;

import java.util.List;

public interface IPaisService {

    public void insert(Pais pais);
    List<Pais> list();
    public void delete(int idPais);
    List<Pais>search(String pais);


}
