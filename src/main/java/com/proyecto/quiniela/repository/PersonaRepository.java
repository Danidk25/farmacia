package com.proyecto.quiniela.repository;
import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.quiniela.entity.Persona;

import java.util.List;

@Repository("personaRepository")
public interface PersonaRepository  extends JpaRepository <Persona, Serializable>{
   List<Persona> findAllByOrderByCodigopersona();
   List<Persona> findAllByOrderByCodigopersonaAsc();
   List<Persona> findByCodigopersona(Integer codigopersona);
}

