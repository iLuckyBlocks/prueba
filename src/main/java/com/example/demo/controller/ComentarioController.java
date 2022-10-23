package com.example.demo.controller;

import com.example.demo.entities.Comentario;
import com.example.demo.servicesimpls.ComentarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {

    @Autowired
    private ComentarioServiceImpl cServiceImpl;

    @PostMapping
    public ResponseEntity<Comentario> saveComentario (@Validated @RequestBody Comentario comentario){
        return ResponseEntity.status(HttpStatus.CREATED).body(cServiceImpl.saveComentario(comentario));
    }

    @GetMapping
    public ResponseEntity<Page<Comentario>> getallComentario (
            @RequestParam(required = false, defaultValue = "0") Integer page,
            @RequestParam(required = false, defaultValue = "10") Integer size,
            @RequestParam(required = false, defaultValue = "false") Boolean enablePagination){
        return ResponseEntity.ok(cServiceImpl.getallComentario(page,size,enablePagination));
    }


    @DeleteMapping(value="/{id}")
    public void deleteComentario (@PathVariable ("id") Integer id){
        cServiceImpl.deleteComentario(id);
        ResponseEntity.ok(!cServiceImpl.existsByid(id));
    }


    @PutMapping
    public ResponseEntity<Comentario> editComentario (@Validated @RequestBody Comentario comentario){
        return ResponseEntity.status(HttpStatus.CREATED).body(cServiceImpl.editComentario(comentario));
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Optional<Comentario>> findAnuncioById(@PathVariable ("id") Integer id){
        return ResponseEntity.status(HttpStatus.CREATED).body(cServiceImpl.findById(id));
    }




}
