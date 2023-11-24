package com.proyecto.quiniela.entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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

    @Column(name = "descuento", precision = 10, scale = 2)
    private BigDecimal descuento;

    @Column(name = "estatus")
	private String estatus;

    @Column(name = "garantia")
	private String garantia;

    @Column(name = "producto")
	private String producto;

    @Column(name = "cantidad")
	private Integer cantidad;

    @Column(name = "preciounitario", precision = 10, scale = 2)
    private BigDecimal preciounitario;

    @Column(name = "impuestos", precision = 10, scale = 2)
    private BigDecimal impuestos;

    @Column(name = "subtotal", precision = 10, scale = 2)
    private BigDecimal subtotal;

    @Column(name = "total",  precision = 10, scale = 2)
    private BigDecimal total;

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

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(BigDecimal preciounitario) {
        this.preciounitario = preciounitario;
    }

    public BigDecimal getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(BigDecimal impuestos) {
        this.impuestos = impuestos;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
   
}