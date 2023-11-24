package com.proyecto.quiniela.repository;
import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.quiniela.entity.Devoluciones;


@Repository("DevolucionesRepository")
public interface DevolucionesRepository  extends JpaRepository<Devoluciones, Serializable>  {
    List<Devoluciones> findAllByOrderByCodigodevolucion();
    List<Devoluciones> findByCodigodevolucion(Integer codigodevolucion);
}
