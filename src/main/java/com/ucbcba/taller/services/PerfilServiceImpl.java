package com.ucbcba.taller.services;

import com.ucbcba.taller.entities.PerfilUsuario;
import com.ucbcba.taller.repositories.CityRepository;
import com.ucbcba.taller.repositories.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PerfilServiceImpl implements PerfilService{
    private PerfilRepository perfilRepository;


    @Autowired
    @Qualifier(value = "perfilRepository")
    public void setperfilRepository(PerfilRepository perfilRepository) {
        this.perfilRepository = perfilRepository;
    }


    @Override
    public Iterable<PerfilUsuario> listaAllPerfiles() {
        return perfilRepository.findAll();
    }

    @Override
    public PerfilUsuario getPerfil(Integer id) {
        return perfilRepository.findOne(id);
    }
}
