package com.example.demo.repositories;

import com.example.demo.entities.Pais;
import com.example.demo.entities.TipoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPaisRepository extends JpaRepository<Pais, Integer> {
    @Query("from Pais p WHERE p.pais like %:pais")
    List<Pais> search(@Param("pais") String pais);
}
