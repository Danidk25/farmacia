package com.proyecto.quiniela.entity;
import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {
    private static final long serialVersionUID = 4L;

    @Id
	
	@Basic(optional = false)
    @Column(name = "codigocliente")
	private Integer codigocliente;
}
