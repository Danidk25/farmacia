package com.proyecto.quiniela.entity;
import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "bitacora")
public class Bitacora implements Serializable {
    private static final long serialVersionUID = 3L;

    @Id
	
	@Basic(optional = false)
    @Column(name = "idbitacora")
	private Integer idbitacora  ;
}
