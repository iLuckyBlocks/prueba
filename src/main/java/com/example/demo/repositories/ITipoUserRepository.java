package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.TipoUsuario;

import java.util.List;

@Repository
public interface ITipoUserRepository extends JpaRepository<TipoUsuario, Integer> {

    @Query("from TipoUsuario p WHERE p.TypeUsuario like %:TypeUsuario")
    List<TipoUsuario>search(@Param("TypeUsuario") String TypeUsuario);
}
