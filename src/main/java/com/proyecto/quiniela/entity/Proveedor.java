package com.proyecto.quiniela.entity;
import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "proveedor")
public class Proveedor implements Serializable {
    private static final long serialVersionUID = 8L;

    @Id
	
	@Basic(optional = false)
    @Column(name = "codigoproveedor")
	private Integer codigoproveedor;
}