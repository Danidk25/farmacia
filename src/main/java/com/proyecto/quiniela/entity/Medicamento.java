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
@Table(name = "medicamento")
public class Medicamento implements Serializable {
    private static final long serialVersionUID = 10L;

    @Id
	
	@Basic(optional = false)
    @Column(name = "codigomedicamento")
	private Integer codigomedicamento;

    @Column(name = "lote")
    private String lote;

    @Column(name = "nombrecomercial")
    private String nombrecomercial;

    @Column(name = "estado")
    private String estado;

    @Column(name = "unidaddemedida")
    private Integer unidaddemedida;

    @Column(name = "proporcion")
    private Integer proporcion;

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
    
    @Column(name = "principioactivo")
    private String principioactivo;

    public Integer getCodigomedicamento() {
        return codigomedicamento;
    }

    public void setCodigomedicamento(Integer codigomedicamento) {
        this.codigomedicamento = codigomedicamento;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getNombrecomercial() {
        return nombrecomercial;
    }

    public void setNombrecomercial(String nombrecomercial) {
        this.nombrecomercial = nombrecomercial;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getUnidaddemedida() {
        return unidaddemedida;
    }

    public void setUnidaddemedida(Integer unidaddemedida) {
        this.unidaddemedida = unidaddemedida;
    }

    public Integer getProporcion() {
        return proporcion;
    }

    public void setProporcion(Integer proporcion) {
        this.proporcion = proporcion;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public Date getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(Date fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }

    public BigDecimal getCostoventa() {
        return costoventa;
    }

    public void setCostoventa(BigDecimal costoventa) {
        this.costoventa = costoventa;
    }

    public BigDecimal getCostocompra() {
        return costocompra;
    }

    public void setCostocompra(BigDecimal costocompra) {
        this.costocompra = costocompra;
    }

    public String getPrincipioactivo() {
        return principioactivo;
    }

    public void setPrincipioactivo(String principioactivo) {
        this.principioactivo = principioactivo;
    }

}