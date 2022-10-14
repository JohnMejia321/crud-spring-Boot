package com.udea.prueba.dao;

import com.udea.prueba.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona,Long> {
}
