package com.example.demo.servicesimpls;


import com.example.demo.entities.Anuncio;
import com.example.demo.repositories.IAnuncioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AnuncioServiceImpl {
    @Autowired
    private IAnuncioRepository aR;

    public Anuncio saveAnuncio (Anuncio anuncio){
        if(String.valueOf(anuncio.getIdAnuncio()).isEmpty()){
            return aR.save(anuncio);
        }
        return null;
    }

    public Page<Anuncio> getallAnuncios (Integer page, Integer size, Boolean enablePagination){
        return aR.findAll(enablePagination ? PageRequest.of(page,size): Pageable.unpaged());
    }

    public void deleteAnuncio (Integer idAnuncio){
        aR.deleteById(idAnuncio);
    }

    public Anuncio editAnuncio (Anuncio anuncio){
        if(!String.valueOf(anuncio.getIdAnuncio()).isEmpty() && aR.existsById(anuncio.getIdAnuncio())){
            return aR.save(anuncio);
        }
        return null;

    }

    public boolean existsByid(Integer id) {
        return aR.existsById(id);
    }

    public Optional<Anuncio> findById(Integer id){
        return aR.findById(id);
    }
}
