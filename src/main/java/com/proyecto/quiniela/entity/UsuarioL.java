package com.proyecto.quiniela.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "usuario")
public class UsuarioL implements Serializable{



    private static final long serialVersionUID = 1L;

    @Id
	
	@Basic(optional = false)
	@Column(name = "idusuario")
	private Integer idusuario;

    @Column(name = "nombreusuario")
    private String nombreusuario;
    
    @Column(name = "password")
    private String password;

    @Column(name = "rol")
    private String rol;

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
}
