/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author root
 */
@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODIGOUSUARIO")
    private String codigousuario;
    @Size(max = 50)
    @Column(name = "NOMBREUSUARIO")
    private String nombreusuario;
    @Size(max = 100)
    @Column(name = "CONTRASENIAUSUARIO")
    private String contraseniausuario;
    @Column(name = "CONTROLCONTRASENIA")
    private Integer controlcontrasenia;
    @Column(name = "ESTADOUSUARIO")
    private Integer estadousuario;
    @Column(name = "FECHAINGRESO")
    @Temporal(TemporalType.DATE)
    private Date fechaingreso;
    @Column(name = "FECHACADUCIDAD")
    @Temporal(TemporalType.DATE)
    private Date fechacaducidad;
    @Column(name = "FECHABAJA")
    @Temporal(TemporalType.DATE)
    private Date fechabaja;
    @ManyToMany(mappedBy = "usuarioCollection", fetch = FetchType.LAZY)
    private Collection<Rol> rolCollection;

    public Usuario() {
    }

    public Usuario(String codigousuario) {
        this.codigousuario = codigousuario;
    }

    public String getCodigousuario() {
        return codigousuario;
    }

    public void setCodigousuario(String codigousuario) {
        this.codigousuario = codigousuario;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getContraseniausuario() {
        return contraseniausuario;
    }

    public void setContraseniausuario(String contraseniausuario) {
        this.contraseniausuario = contraseniausuario;
    }

    public Integer getControlcontrasenia() {
        return controlcontrasenia;
    }

    public void setControlcontrasenia(Integer controlcontrasenia) {
        this.controlcontrasenia = controlcontrasenia;
    }

    public Integer getEstadousuario() {
        return estadousuario;
    }

    public void setEstadousuario(Integer estadousuario) {
        this.estadousuario = estadousuario;
    }

    public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public Date getFechacaducidad() {
        return fechacaducidad;
    }

    public void setFechacaducidad(Date fechacaducidad) {
        this.fechacaducidad = fechacaducidad;
    }

    public Date getFechabaja() {
        return fechabaja;
    }

    public void setFechabaja(Date fechabaja) {
        this.fechabaja = fechabaja;
    }

    public Collection<Rol> getRolCollection() {
        return rolCollection;
    }

    public void setRolCollection(Collection<Rol> rolCollection) {
        this.rolCollection = rolCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigousuario != null ? codigousuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.codigousuario == null && other.codigousuario != null) || (this.codigousuario != null && !this.codigousuario.equals(other.codigousuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mj.gob.sisadmrh.model.Usuario[ codigousuario=" + codigousuario + " ]";
    }
    
}
