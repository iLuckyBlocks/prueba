package com.example.demo.repositories;

import com.example.demo.entities.TipodeIdentificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipodeIdentificacionRepository extends JpaRepository<TipodeIdentificacion,Integer> {
}
