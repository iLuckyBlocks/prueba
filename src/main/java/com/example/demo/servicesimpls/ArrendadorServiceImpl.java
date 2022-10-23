package com.example.demo.servicesimpls;

import com.example.demo.entities.Anuncio;
import com.example.demo.entities.Arrendador;
import com.example.demo.repositories.IArrendadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArrendadorServiceImpl {

    @Autowired
    private IArrendadorRepository aR;

    public Arrendador saveArrendador (Arrendador arrendador){
        if(String.valueOf(arrendador.getIdArrendador()).isEmpty()){
            return aR.save(arrendador);
        }
        return null;

    }

    public Page<Arrendador> getallArrendador (Integer page, Integer size, Boolean enablePagination){
        return aR.findAll(enablePagination ? PageRequest.of(page,size): Pageable.unpaged());
    }

    public void deleteArrendador (Integer idArrendador){
        aR.deleteById(idArrendador);
    }

    public Arrendador editArrendador  (Arrendador arrendador){
        if(!String.valueOf(arrendador.getIdArrendador()).isEmpty() && aR.existsById(arrendador.getIdArrendador())){
            return aR.save(arrendador);
        }
        return null;

    }

    public boolean existsByid(Integer id) {
        return aR.existsById(id);
    }

    public Optional<Arrendador> findById(Integer id){
        return aR.findById(id);
    }


}
