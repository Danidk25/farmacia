package com.proyecto.quiniela.entity;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "devoluciones")
public class Devoluciones implements Serializable {
    private static final long serialVersionUID = 5L;

    @Id
	
	@Basic(optional = false)
    @Column(name = "codigodevolucion")
	private Integer codigodevolucion;

     @Column(name = "fechadevolucion")
	private Date fechadevolucion;

    @Column(name = "cantidadproductos")
	private Integer cantidadproductos;

    @Column(name = "motivodevolucion")
	private String motivodevolucion;
    
     @Column(name = "descripciontipodevolucion")
	private String descripciontipodevolucion;

    public Integer getCodigodevolucion() {
        return codigodevolucion;
    }

    public void setCodigodevolucion(Integer codigodevolucion) {
        this.codigodevolucion = codigodevolucion;
    }

    public Date getFechadevolucion() {
        return fechadevolucion;
    }

    public void setFechadevolucion(Date fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }

    public Integer getCantidadproductos() {
        return cantidadproductos;
    }

    public void setCantidadproductos(Integer cantidadproductos) {
        this.cantidadproductos = cantidadproductos;
    }

    public String getMotivodevolucion() {
        return motivodevolucion;
    }

    public void setMotivodevolucion(String motivodevolucion) {
        this.motivodevolucion = motivodevolucion;
    }

    public String getDescripciontipodevolucion() {
        return descripciontipodevolucion;
    }

    public void setDescripciontipodevolucion(String descripciontipodevolucion) {
        this.descripciontipodevolucion = descripciontipodevolucion;
    }


    
}