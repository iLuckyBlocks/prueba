package com.example.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Anuncio;
import org.springframework.stereotype.Repository;

@Repository
public interface IAnuncioRepository extends JpaRepository<Anuncio, Integer> {
}
