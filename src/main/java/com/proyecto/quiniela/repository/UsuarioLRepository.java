package com.proyecto.quiniela.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.quiniela.entity.UsuarioL;
@Repository("usuarioLRepository")
public interface UsuarioLRepository extends JpaRepository<UsuarioL, Serializable>{
    List<UsuarioL> findByNombreusuarioAndPassword(String nombreusuario, String password);
    List<UsuarioL> findByIdusuario(Integer idusuario);
    List<UsuarioL> findAllByOrderByIdusuarioAsc();

    
}
