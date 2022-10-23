package com.example.demo.repositories;

import com.example.demo.entities.MetodoPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMetodoPagoRepository extends JpaRepository<MetodoPago, Integer> {

    @Query("from MetodoPago mp where mp.FormaPago like %:nameFormaPago")
    List<MetodoPago>search(@Param("nameFormaPago") String nameFormaPago);

}
