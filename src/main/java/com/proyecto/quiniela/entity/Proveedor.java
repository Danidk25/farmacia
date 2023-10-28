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
    
    @Column(name = "fechaproveedor")
	private Date fechaproveedor;
    
     @Column(name = "codigopersona")
	private Integer codigopersona;



    public Integer getCodigopersona() {
        return codigopersona;
    }

    public void setCodigopersona(Integer codigopersona) {
        this.codigopersona = codigopersona;
    }

    public Integer getCodigoproveedor() {
        return codigoproveedor;
    }

    public void setCodigoproveedor(Integer codigoproveedor) {
        this.codigoproveedor = codigoproveedor;
    }

    public Date getFechaproveedor() {
        return fechaproveedor;
    }

    public void setFechaproveedor(Date fechaproveedor) {
        this.fechaproveedor = fechaproveedor;
    }

 

    
}