package com.example.demo.controller;

import com.example.demo.entities.TipodeIdentificacion;
import com.example.demo.servicesinterfaces.ITipodeIdentificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tiposdeidentificacion")
public class TipodeIdentificacionController {
    @Autowired
    private ITipodeIdentificacionService tiService;

    @PostMapping
    public void registrar(@RequestBody TipodeIdentificacion ti){
        tiService.insert(ti);
    }
    @GetMapping
    public List<TipodeIdentificacion>listar(){
        return tiService.list();}
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        tiService.delete(id);}
    @PutMapping
    public void modificar(@RequestBody TipodeIdentificacion tipodeIdentificacion ){
        tiService.insert(tipodeIdentificacion);
    }
}
