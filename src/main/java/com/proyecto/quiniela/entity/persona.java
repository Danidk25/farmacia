package com.proyecto.quiniela.entity;
import java.io.Serializable;
import java.util.List;
import java.util.Date;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;

@Entity
@Table(name = "persona")
public class Persona implements Serializable{

        private static final long serialVersionUID = 13L;

    @Id
	
	@Basic(optional = false)
    @Column(name = "codigopersona")
	private Integer codigopersona;
    
    @Column(name = "primernombre")
	private String primernombre;

    @Column(name = "segundonombre")
	private String segundonombre;

    @Column(name = "tercernombre")
	private String tercernombre;

    @Column(name = "primerapellido")
	private String primerapellido;

    @Column(name = "segundoapellido")
	private String segundoapellido;

    @Column(name = "apellidocasada")
	private String apellidocasada;

    @Column(name = "numdocidentificacion")
	private Integer numdocidentificacion;

    @Column(name = "nit")
	private Integer nit;

    @Column(name = "dpi")
	private Integer dpi;

    @Column(name = "numerotelefono")
	private Integer numerotelefono;

    @Column(name = "fechanacimiento")
	private Date fechanacimiento;

    @Column(name = "correo")
	private String correo;

    @Column(name = "direccion")
	private String direccion;

    @Column(name = "departamento")
	private String departamento;

    @Column(name = "nombrepais")
	private String nombrepais;


 @OneToMany(mappedBy = "codigopersona")
    private List<Cliente> clientes;
 
  
    public List<Cliente> getClientes() {
    return clientes;
}

public void setClientes(List<Cliente> clientes) {
    this.clientes = clientes;
}

    public Integer getCodigopersona() {
        return codigopersona;
    }

    public void setCodigopersona(Integer codigopersona) {
        this.codigopersona = codigopersona;
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

    public String getTercernombre() {
        return tercernombre;
    }

    public void setTercernombre(String tercernombre) {
        this.tercernombre = tercernombre;
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

    public String getApellidocasada() {
        return apellidocasada;
    }

    public void setApellidocasada(String apellidocasada) {
        this.apellidocasada = apellidocasada;
    }

    public Integer getNumdocidentificacion() {
        return numdocidentificacion;
    }

    public void setNumdocidentificacion(Integer numdocidentificacion) {
        this.numdocidentificacion = numdocidentificacion;
    }

    public Integer getNit() {
        return nit;
    }

    public void setNit(Integer nit) {
        this.nit = nit;
    }

    public Integer getDpi() {
        return dpi;
    }

    public void setDpi(Integer dpi) {
        this.dpi = dpi;
    }

    public Integer getNumerotelefono() {
        return numerotelefono;
    }

    public void setNumerotelefono(Integer numerotelefono) {
        this.numerotelefono = numerotelefono;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNombrepais() {
        return nombrepais;
    }

    public void setNombrepais(String nombrepais) {
        this.nombrepais = nombrepais;
    }


    
}