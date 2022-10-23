package com.example.demo.servicesimpls;

import com.example.demo.entities.MetodoPago;
import com.example.demo.repositories.IMetodoPagoRepository;
import com.example.demo.servicesinterfaces.IMetodoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetodoPagoServiceImpl implements IMetodoPagoService {
    @Autowired
    private IMetodoPagoRepository mR;
    @Override
    public void insert(MetodoPago metodopago){
        mR.save(metodopago);
    }

    @Override
    public List<MetodoPago>list(){
        return mR.findAll();
    }

    @Override
    public void delete(int IdMetodoPago) {
        mR.deleteById(IdMetodoPago);
    }

    @Override
    public List<MetodoPago> search(String nameFormaPago) {
        return mR.search(nameFormaPago);
    }


}