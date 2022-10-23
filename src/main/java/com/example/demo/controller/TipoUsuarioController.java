package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entities.TipoUsuario;
import com.example.demo.servicesinterfaces.ITipoUsuarioService;

import java.util.List;

@RestController
@RequestMapping("/tipoUsuario")
public class TipoUsuarioController {

    @Autowired
    private ITipoUsuarioService tService;

    @PostMapping
    public void registrar(@RequestBody TipoUsuario t){tService.insert(t); }

    @GetMapping
    public List<TipoUsuario>listar(){
        return tService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        tService.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody TipoUsuario typeUser){
        tService.insert(typeUser);
    }

    @PostMapping("/buscar")
    public  List<TipoUsuario> buscar(@RequestBody TipoUsuario typeUser){
        List<TipoUsuario> lista;
        typeUser.setTipoUsuario(typeUser.getTipoUsuario());
        lista= tService.search(typeUser.getTipoUsuario());
        return lista;
    }

}
