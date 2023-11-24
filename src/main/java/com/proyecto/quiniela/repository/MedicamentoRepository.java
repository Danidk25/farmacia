package com.proyecto.quiniela.repository;
import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.quiniela.entity.Medicamento;

@Repository("MedicamentoRepository")
public interface MedicamentoRepository  extends JpaRepository<Medicamento, Serializable>  {
    List<Medicamento> findAllByOrderByCodigomedicamento();
    List<Medicamento> findByCodigomedicamento(Integer codigomedicamento);    
}
