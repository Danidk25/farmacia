package com.proyecto.quiniela.repository;
import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.quiniela.entity.Cliente;
import java.util.List;



@Repository("ClienteRepository")
public interface ClienteRepository  extends JpaRepository<Cliente, Serializable>  {
   List<Cliente> findByCodigocliente(Integer codigocliente);
}
