package com.proyecto.quiniela.entity;
import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "sucursal")
public class Sucursal implements Serializable {
    private static final long serialVersionUID = 9L;

    @Id
	
	@Basic(optional = false)
    @Column(name = "codigosucursal")
	private Integer codigosucursal;
}