package com.proyecto.quiniela.entity;
import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "inventario")
public class Inventario implements Serializable {
    private static final long serialVersionUID = 11L;

    @Id
	
	@Basic(optional = false)
    @Column(name = "codigoinventario")
	private Integer codigoinventario;
}