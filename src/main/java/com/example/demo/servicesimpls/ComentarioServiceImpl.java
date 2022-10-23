package com.example.demo.servicesimpls;


import com.example.demo.entities.Arrendador;
import com.example.demo.entities.Comentario;
import com.example.demo.repositories.IComentarioRepository;
import com.example.demo.servicesinterfaces.IComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComentarioServiceImpl implements IComentarioService {
    @Autowired
    private IComentarioRepository cR;
    @Override
    public void insert(Comentario comentario){
        cR.save(comentario);
    }

    @Override
    public List<Comentario>list(){return cR.findAll();}


    public Comentario saveComentario (Comentario comentario){
        if(String.valueOf(comentario.getIdComentario()).isEmpty()){
            return cR.save(comentario);
        }
        return null;

    }

    public Page<Comentario> getallComentario (Integer page, Integer size, Boolean enablePagination){
        return cR.findAll(enablePagination ? PageRequest.of(page,size): Pageable.unpaged());
    }

    public void deleteComentario (Integer idComentario){
        cR.deleteById(idComentario);
    }

    public Comentario editComentario  (Comentario comentario){
        if(!String.valueOf(comentario.getIdComentario()).isEmpty() && cR.existsById(comentario.getIdComentario())){
            return cR.save(comentario);
        }
        return null;

    }

    public boolean existsByid(Integer id) {
        return cR.existsById(id);
    }

    public Optional<Comentario> findById(Integer id){
        return cR.findById(id);
    }






}
