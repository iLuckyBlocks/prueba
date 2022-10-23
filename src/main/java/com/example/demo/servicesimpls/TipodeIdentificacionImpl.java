package com.example.demo.servicesimpls;

import com.example.demo.entities.TipodeIdentificacion;
import com.example.demo.repositories.ITipodeIdentificacionRepository;
import com.example.demo.servicesinterfaces.ITipodeIdentificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipodeIdentificacionImpl implements ITipodeIdentificacionService {
    @Autowired
    private ITipodeIdentificacionRepository tiR;

    @Override
    public void insert(TipodeIdentificacion tipodeIdentificacion) {
        tiR.save(tipodeIdentificacion);

    }

    @Override
    public List<TipodeIdentificacion> list() {
        return tiR.findAll();
    }

    @Override
    public void delete(int idIdentificacio) {
        tiR.deleteById(idIdentificacio);

    }

    @Override
    public Optional<TipodeIdentificacion> listarId(int idIdentificacion) {
        return Optional.of(tiR.findById(idIdentificacion).orElse(new TipodeIdentificacion()));
    }
}
