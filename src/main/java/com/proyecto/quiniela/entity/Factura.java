package com.proyecto.quiniela.entity;
import java.io.Serializable;

import java.sql.Date;
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

    @Column(name = "fechaemicion")
	private Date fechaemicion;

    @Column(name = "total")
	private Integer total;

    @Column(name = "descuento")
	private Integer descuento;
    
    @Column(name = "garantia")
	private Date garantia;


    public Integer getCodigofactura() {
        return codigofactura;
    }

    public void setCodigofactura(Integer codigofactura) {
        this.codigofactura = codigofactura;
    }

    public Date getFechaemicion() {
        return fechaemicion;
    }

    public void setFechaemicion(Date fechaemicion) {
        this.fechaemicion = fechaemicion;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getDescuento() {
        return descuento;
    }

    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }

    public Date getGarantia() {
        return garantia;
    }

    public void setGarantia(Date garantia) {
        this.garantia = garantia;
    }


}