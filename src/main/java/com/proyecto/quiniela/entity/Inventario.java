package com.proyecto.quiniela.entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "inventario")
public class Inventario implements Serializable {
    private static final long serialVersionUID = 11L;

    @Id
	
	@Basic(optional = false)
    @Column(name = "codigoinventario")
	private Integer codigoinventario;

    @Column(name = "fechacreacion")
    private Date fechacreacion;

    @Column(name = "fechaingreso")
    private Date fechaingreso;

    @Column(name = "fechavencimiento")
    private Date fechavencimiento;

    @Column(name = "existencia")
    private Integer existencia;

    @Column(name = "costoventa", precision = 10, scale = 2)
    private BigDecimal costoventa;

    @Column(name = "costocompra", precision = 10, scale = 2)
    private BigDecimal costocompra;

    public Integer getCodigoinventario() {
        return this.codigoinventario;
    }

    public void setCodigoinventario(Integer codigoinventario) {
        this.codigoinventario = codigoinventario;
    }

    public Date getFechacreacion() {
        return this.fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Date getFechaingreso() {
        return this.fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public Date getFechavencimiento() {
        return this.fechavencimiento;
    }

    public void setFechavencimiento(Date fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    public Integer getExistencia() {
        return this.existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }

    public BigDecimal getCostoventa() {
        return this.costoventa;
    }

    public void setCostoventa(BigDecimal costoventa) {
        this.costoventa = costoventa;
    }

    public BigDecimal getCostocompra() {
        return this.costocompra;
    }

    public void setCostocompra(BigDecimal costocompra) {
        this.costocompra = costocompra;
    }

}