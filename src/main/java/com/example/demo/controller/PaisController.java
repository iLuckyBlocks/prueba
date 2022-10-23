package com.example.demo.controller;

import com.example.demo.entities.Pais;
import com.example.demo.entities.TipoUsuario;
import com.example.demo.servicesinterfaces.IPaisService;
import com.example.demo.servicesinterfaces.ITipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pais")
public class PaisController {

    @Autowired
    private IPaisService tPais;

    @PostMapping
    public void registrar(@RequestBody Pais t){tPais.insert(t); }

    @GetMapping
    public List<Pais> listar(){
        return tPais.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        tPais.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody Pais pais){
        tPais.insert(pais);
    }

    @PostMapping("/buscar")
    public  List<Pais> buscar(@RequestBody Pais pais){
        List<Pais> lista;
        pais.setPais(pais.getPais());
        pais.setRegion(pais.getRegion());

        lista= tPais.search(pais.getPais());


        return lista;
    }


}
