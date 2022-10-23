package com.example.demo.controller;


import com.example.demo.entities.Anuncio;
import com.example.demo.servicesimpls.AnuncioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/anuncios")
public class AnuncioController {

    @Autowired
    private AnuncioServiceImpl aService;


    @PostMapping
    public ResponseEntity<Anuncio> saveAnuncio (@Validated @RequestBody Anuncio anuncio){
        return ResponseEntity.status(HttpStatus.CREATED).body(aService.saveAnuncio(anuncio));
    }

    @GetMapping
    public ResponseEntity<Page<Anuncio>> getallAnuncios (
            @RequestParam(required = false, defaultValue = "0") Integer page,
            @RequestParam(required = false, defaultValue = "10") Integer size,
            @RequestParam(required = false, defaultValue = "false") Boolean enablePagination){
            return ResponseEntity.ok(aService.getallAnuncios(page,size,enablePagination));
    }


    @DeleteMapping(value="/{id}")
    public void deleteAnuncio (@PathVariable ("id") Integer id){
        aService.deleteAnuncio(id);
        ResponseEntity.ok(!aService.existsByid(id));
    }


    @PutMapping
    public ResponseEntity<Anuncio> editAnuncio (@Validated @RequestBody Anuncio anuncio){
        return ResponseEntity.status(HttpStatus.CREATED).body(aService.editAnuncio(anuncio));
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Optional<Anuncio>> findAnuncioById(@PathVariable ("id") Integer id){
        return ResponseEntity.status(HttpStatus.CREATED).body(aService.findById(id));
    }



}
