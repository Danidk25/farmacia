package com.proyecto.quiniela.entity;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "bitacora")
public class Bitacora implements Serializable {
    private static final long serialVersionUID = 3L;

    @Id
	
	@Basic(optional = false)
    @Column(name = "idbitacora")
	private Integer idbitacora  ;

    @Column(name = "tabla")
    private String tabla;

    @Column(name = "campo")
    private String campo;

    @Column(name = "llaveprimaria")
    private String llaveprimaria;

    @Column(name = "valoranterior", length = 255)
    private String valoranterior;

    @Column(name = "valornuevo", length = 255)
    private String valornuevo;

    @Column(name = "fechacreacion")
    private Date fechacreacion;

    @Column(name = "usuariocreacion", length = 50)
    private String usuariocreacion;

    @Column(name = "tipomovimiento", length = 40)
    private String tipomovimiento;

    @Column(name = "ipregistro", length = 50)
    private String ipregistro;


    public Integer getIdbitacora() {
        return this.idbitacora;
    }

    public void setIdbitacora(Integer idbitacora) {
        this.idbitacora = idbitacora;
    }

    public String getTabla() {
        return this.tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    public String getCampo() {
        return this.campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getLlaveprimaria() {
        return this.llaveprimaria;
    }

    public void setLlaveprimaria(String llaveprimaria) {
        this.llaveprimaria = llaveprimaria;
    }

    public String getValoranterior() {
        return this.valoranterior;
    }

    public void setValoranterior(String valoranterior) {
        this.valoranterior = valoranterior;
    }

    public String getValornuevo() {
        return this.valornuevo;
    }

    public void setValornuevo(String valornuevo) {
        this.valornuevo = valornuevo;
    }

    public Date getFechacreacion() {
        return this.fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public String getUsuariocreacion() {
        return this.usuariocreacion;
    }

    public void setUsuariocreacion(String usuariocreacion) {
        this.usuariocreacion = usuariocreacion;
    }

    public String getTipomovimiento() {
        return this.tipomovimiento;
    }

    public void setTipomovimiento(String tipomovimiento) {
        this.tipomovimiento = tipomovimiento;
    }

    public String getIpregistro() {
        return this.ipregistro;
    }

    public void setIpregistro(String ipregistro) {
        this.ipregistro = ipregistro;
    }
    

}