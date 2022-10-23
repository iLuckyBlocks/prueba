package com.example.demo.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.TipoUsuario;
import com.example.demo.repositories.ITipoUserRepository;
import com.example.demo.servicesinterfaces.ITipoUsuarioService;

import java.util.List;

@Service
public class TipoUsuarioServicelmpl implements ITipoUsuarioService {

    @Autowired
    private ITipoUserRepository tR;
    @Override
    public void insert(TipoUsuario typeUser) { tR.save(typeUser); }
    @Override
    public List<TipoUsuario> list() { return tR.findAll(); }
    @Override
    public void delete(int idTipoUsuario) {tR.deleteById(idTipoUsuario); }
    @Override
    public List<TipoUsuario> search(String TipoUser) { return tR.search(TipoUser); }
}
