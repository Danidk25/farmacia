package com.proyecto.quiniela.entity;
import java.io.Serializable;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "empleado")
public class Empleado implements Serializable{

        private static final long serialVersionUID = 2L;

    @Id
	
	@Basic(optional = false)
    @Column(name = "codigoempleado")
	private Integer codigoempleado;

     @Column(name = "fechaingreso")
	private Date fechaingreso;

     @Column(name = "salariobase")
	private Integer salariobase;

     @Column(name = "fechaegreso")
	private Date fechaegreso;

     @Column(name = "codigopersona")
	private Integer codigopersona;

    public Integer getCodigoempleado() {
        return codigoempleado;
    }

    public void setCodigoempleado(Integer codigoempleado) {
        this.codigoempleado = codigoempleado;
    }

    public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public Integer getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(Integer salariobase) {
        this.salariobase = salariobase;
    }

    public Date getFechaegreso() {
        return fechaegreso;
    }

    public void setFechaegreso(Date fechaegreso) {
        this.fechaegreso = fechaegreso;
    }

    public Integer getCodigopersona() {
        return codigopersona;
    }

    public void setCodigopersona(Integer codigopersona) {
        this.codigopersona = codigopersona;
    }


}
