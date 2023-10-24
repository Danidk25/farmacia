package com.proyecto.quiniela.entity;
import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "factura")
public class Factura implements Serializable {
    private static final long serialVersionUID = 6L;

    @Id
	
	@Basic(optional = false)
    @Column(name = "codigofactura")
	private Integer codigofactura;
}