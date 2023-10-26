package com.proyecto.quiniela.repository;
import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.quiniela.entity.persona;

import java.util.List;

@Repository("personaRepository")
public interface PersonaRepository  extends JpaRepository <persona, Serializable>{
   List<persona> findAllByOrderByCodigopersona();
   List<persona> findAllByOrderByCodigopersonaAsc();
   List<persona> findByCodigopersona(Integer codigopersona);
}

