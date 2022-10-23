package com.example.demo.repositories;

import com.example.demo.entities.Anuncio;
import com.example.demo.entities.Arrendador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IArrendadorRepository extends JpaRepository<Arrendador, Integer> {


}
