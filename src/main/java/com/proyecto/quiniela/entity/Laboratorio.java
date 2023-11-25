package com.proyecto.quiniela.entity;
import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "laboratorio")
public class Laboratorio implements Serializable {
    private static final long serialVersionUID = 7L;

    @Id
	
	@Basic(optional = false)
    @Column(name = "codigolaboratorio")
	private Integer codigolaboratorio;

    @Column(name = "ubicacionlaboratorio", length = 100)
    private String ubicacionlaboratorio;

    @Column(name = "nombrelaboratorio", length = 100)
    private String nombrelaboratorio;

    @Column(name = "encargadolaboratorio", length = 40)
    private String encargadolaboratorio;

    public Integer getCodigolaboratorio() {
        return codigolaboratorio;
    }

    public void setCodigolaboratorio(Integer codigolaboratorio) {
        this.codigolaboratorio = codigolaboratorio;
    }

    public String getUbicacionlaboratorio() {
        return ubicacionlaboratorio;
    }

    public void setUbicacionlaboratorio(String ubicacionlaboratorio) {
        this.ubicacionlaboratorio = ubicacionlaboratorio;
    }

    public String getNombrelaboratorio() {
        return nombrelaboratorio;
    }

    public void setNombrelaboratorio(String nombrelaboratorio) {
        this.nombrelaboratorio = nombrelaboratorio;
    }

    public String getEncargadolaboratorio() {
        return encargadolaboratorio;
    }

    public void setEncargadolaboratorio(String encargadolaboratorio) {
        this.encargadolaboratorio = encargadolaboratorio;
    }

    
}

