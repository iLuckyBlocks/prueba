package com.example.demo.controller;

import com.example.demo.entities.Anuncio;
import com.example.demo.entities.Arrendador;
import com.example.demo.servicesimpls.AnuncioServiceImpl;
import com.example.demo.servicesimpls.ArrendadorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/Arrendador")
public class ArrendadorController {

    @Autowired
    private ArrendadorServiceImpl aService;


    @PostMapping
    public ResponseEntity<Arrendador> saveArrendador (@Validated @RequestBody Arrendador arrendador){
        return ResponseEntity.status(HttpStatus.CREATED).body(aService.saveArrendador(arrendador));
    }

    @GetMapping
    public ResponseEntity<Page<Arrendador>> getallArrendador (
            @RequestParam(required = false, defaultValue = "0") Integer page,
            @RequestParam(required = false, defaultValue = "10") Integer size,
            @RequestParam(required = false, defaultValue = "false") Boolean enablePagination){
        return ResponseEntity.ok(aService.getallArrendador(page,size,enablePagination));
    }


    @DeleteMapping(value="/{id}")
    public void deleteArrendador (@PathVariable ("id") Integer id){
        aService.deleteArrendador(id);
        ResponseEntity.ok(!aService.existsByid(id));
    }


    @PutMapping
    public ResponseEntity<Arrendador> editArrendador (@Validated @RequestBody Arrendador arrendador){
        return ResponseEntity.status(HttpStatus.CREATED).body(aService.editArrendador(arrendador));
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Optional<Arrendador>> findAnuncioById(@PathVariable ("id") Integer id){
        return ResponseEntity.status(HttpStatus.CREATED).body(aService.findById(id));
    }



}
