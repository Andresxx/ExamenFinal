package com.ucbcba.taller.services;

import com.ucbcba.taller.entities.PerfilUsuario;

public interface PerfilService {
    Iterable<PerfilUsuario> listaAllPerfiles();

    PerfilUsuario getPerfil(Integer id);


}
