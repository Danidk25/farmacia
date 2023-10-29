package com.proyecto.quiniela.repository;
import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.quiniela.entity.Bitacora;


@Repository("BitacoraRepository")
public interface BitacoraRepository extends JpaRepository<Bitacora, Serializable>{
    List<Bitacora> findAllByOrderByIdbitacoraAsc();
    List<Bitacora> findByIdbitacora(Integer idbitacora);
}
