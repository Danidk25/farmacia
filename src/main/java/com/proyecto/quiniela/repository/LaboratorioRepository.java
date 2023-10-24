package com.proyecto.quiniela.repository;
import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.quiniela.entity.Laboratorio;


@Repository("LaboratorioRepository")
public interface LaboratorioRepository  extends JpaRepository<Laboratorio, Serializable>  {
    
}
