package com.proyecto.quiniela.repository;
import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.quiniela.entity.Proveedor;


@Repository("ProveedorRepository")
public interface ProveedorRepository  extends JpaRepository<Proveedor, Serializable>  {
    
}
