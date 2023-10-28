package com.proyecto.quiniela.entity;
import java.io.Serializable;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {
    private static final long serialVersionUID = 4L;

    @Id
	
	@Basic(optional = false)
    @Column(name = "codigocliente")
	private Integer codigocliente;
    
    @Column(name = "fecharegistro")
    private Date fecharegistro;
/* 
    @Column(name ="codigopersona")
    private Integer codigopersona; */

@ManyToOne
    @JoinColumn(name = "codigopersona")
    private Persona persona;


    public Integer getCodigocliente() {
        return codigocliente;
    }

    public void setCodigocliente(Integer codigocliente) {
        this.codigocliente = codigocliente;
    }

    public Date getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

   /*  public Integer getCodigopersona() {
        return codigopersona;
    }

    public void setCodigopersona(Integer codigopersona) {
        this.codigopersona = codigopersona;
    }
 */
}
