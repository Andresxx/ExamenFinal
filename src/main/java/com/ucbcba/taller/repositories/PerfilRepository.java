package com.ucbcba.taller.repositories;


import com.ucbcba.taller.entities.PerfilUsuario;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface PerfilRepository extends CrudRepository<PerfilUsuario,Integer> {
}
