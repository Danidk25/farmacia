package com.proyecto.quiniela.entity;
import java.io.Serializable;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "proveedor")
public class Proveedor implements Serializable {
    private static final long serialVersionUID = 8L;

    @Id
	
	@Basic(optional = false)
    @Column(name = "codigoproveedor")
	private Integer codigoproveedor;
    
    @Column(name = "primernombre")
	private String primernombre;

    @Column(name = "segundonombre")
	private String segundonombre;

    @Column(name = "primerapellido")
	private String primerapellido;

    @Column(name = "segundoapellido")
	private String segundoapellido;

    @Column(name = "nit")
	private Integer nit;

    @Column(name = "numerotelefono")
	private Integer numerotelefono;

    @Column(name = "fechaproveedor")
	private Date fechaproveedor;

    public Integer getCodigoproveedor() {
        return codigoproveedor;
    }

    public void setCodigoproveedor(Integer codigoproveedor) {
        this.codigoproveedor = codigoproveedor;
    }

    public String getPrimernombre() {
        return primernombre;
    }

    public void setPrimernombre(String primernombre) {
        this.primernombre = primernombre;
    }

    public String getSegundonombre() {
        return segundonombre;
    }

    public void setSegundonombre(String segundonombre) {
        this.segundonombre = segundonombre;
    }

    public String getPrimerapellido() {
        return primerapellido;
    }

    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    public String getSegundoapellido() {
        return segundoapellido;
    }

    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }

    public Integer getNit() {
        return nit;
    }

    public void setNit(Integer nit) {
        this.nit = nit;
    }

    public Integer getNumerotelefono() {
        return numerotelefono;
    }

    public void setNumerotelefono(Integer numerotelefono) {
        this.numerotelefono = numerotelefono;
    }

    public Date getFechaproveedor() {
        return fechaproveedor;
    }

    public void setFechaproveedor(Date fechaproveedor) {
        this.fechaproveedor = fechaproveedor;
    }

}