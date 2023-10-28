package com.proyecto.quiniela.repository;
import java.io.Serializable;
//import java.util.List;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.quiniela.entity.Empleado;


@Repository("EmpleadoRepository")
public interface EmpleadoRepository extends JpaRepository<Empleado, Serializable>{
   List<Empleado> findAllByOrderByCodigoempleado();
    List<Empleado> findAllByOrderByCodigoempleadoAsc();
    List<Empleado>findByCodigoempleado(Integer codigoempleado);
   // List<Empleado> findByCodigopersona(Integer codigopersona); 

}
