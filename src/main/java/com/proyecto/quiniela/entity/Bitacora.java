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

    @Column(name = "valoranterior")
    private String valoranterior;

    @Column(name = "valornuevo")
    private String valornuevo;

    @Column(name = "fechacreacion")
    private Date fechacreacion;

    @Column(name = "usuariocreacion")
    private String usuariocreacion;

    @Column(name = "tipomovimiento")
    private String tipomovimiento;

        @Column(name = "ipregistro")
    private String ipregistro;


    public Integer getIdbitacora() {
        return idbitacora;
    }

    public void setIdbitacora(Integer idbitacora) {
        this.idbitacora = idbitacora;
    }

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getLlaveprimaria() {
        return llaveprimaria;
    }

    public void setLlaveprimaria(String llaveprimaria) {
        this.llaveprimaria = llaveprimaria;
    }

    public String getValoranterior() {
        return valoranterior;
    }

    public void setValoranterior(String valoranterior) {
        this.valoranterior = valoranterior;
    }

    public String getValornuevo() {
        return valornuevo;
    }

    public void setValornuevo(String valornuevo) {
        this.valornuevo = valornuevo;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public String getUsuariocreacion() {
        return usuariocreacion;
    }

    public void setUsuariocreacion(String usuariocreacion) {
        this.usuariocreacion = usuariocreacion;
    }

    public String getTipomovimiento() {
        return tipomovimiento;
    }

    public void setTipomovimiento(String tipomovimiento) {
        this.tipomovimiento = tipomovimiento;
    }

    public String getIpregistro() {
        return ipregistro;
    }

    public void setIpregistro(String ipregistro) {
        this.ipregistro = ipregistro;
    }


    

}