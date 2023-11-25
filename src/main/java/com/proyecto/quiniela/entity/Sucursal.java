package com.proyecto.quiniela.entity;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "sucursal")
public class Sucursal implements Serializable {
    private static final long serialVersionUID = 9L;

    @Id
	
	@Basic(optional = false)
    @Column(name = "codigosucursal")
	private Integer codigosucursal;


    @Column(name = "fechaapertura")
    private Date fechaapertura;

    @Column(name = "fechacierre")
    private Date fechacierre;

    @Column(name = "nombresucursal", length = 50)
    private String nombresucursal;

    @Column(name = "departamentosucursal", length = 50)
    private String departamentosucursal;


    public Integer getCodigosucursal() {
        return this.codigosucursal;
    }

    public void setCodigosucursal(Integer codigosucursal) {
        this.codigosucursal = codigosucursal;
    }

    public Date getFechaapertura() {
        return this.fechaapertura;
    }

    public void setFechaapertura(Date fechaapertura) {
        this.fechaapertura = fechaapertura;
    }

    public Date getFechacierre() {
        return this.fechacierre;
    }

    public void setFechacierre(Date fechacierre) {
        this.fechacierre = fechacierre;
    }

    public String getNombresucursal() {
        return this.nombresucursal;
    }

    public void setNombresucursal(String nombresucursal) {
        this.nombresucursal = nombresucursal;
    }

    public String getDepartamentosucursal() {
        return this.departamentosucursal;
    }

    public void setDepartamentosucursal(String departamentosucursal) {
        this.departamentosucursal = departamentosucursal;
    }


}