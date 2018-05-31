/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author root
 */
@Entity
@Table(name = "ROL")
@NamedQueries({
    @NamedQuery(name = "Rol.findAll", query = "SELECT r FROM Rol r")})
public class Rol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODIGOROL")
    private String codigorol;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODIGOGRUPOUSUARIO")
    private String codigogrupousuario;
    @Size(max = 100)
    @Column(name = "NOMBREROL")
    private String nombrerol;
    @JoinTable(name = "USUARIOROL", joinColumns = {
        @JoinColumn(name = "CODIGOROL", referencedColumnName = "CODIGOROL")}, inverseJoinColumns = {
        @JoinColumn(name = "CODIGOUSUARIO", referencedColumnName = "CODIGOUSUARIO")})
    @ManyToMany(fetch = FetchType.LAZY)
    private Collection<Usuario> usuarioCollection;

    public Rol() {
    }

    public Rol(String codigorol) {
        this.codigorol = codigorol;
    }

    public Rol(String codigorol, String codigogrupousuario) {
        this.codigorol = codigorol;
        this.codigogrupousuario = codigogrupousuario;
    }

    public String getCodigorol() {
        return codigorol;
    }

    public void setCodigorol(String codigorol) {
        this.codigorol = codigorol;
    }

    public String getCodigogrupousuario() {
        return codigogrupousuario;
    }

    public void setCodigogrupousuario(String codigogrupousuario) {
        this.codigogrupousuario = codigogrupousuario;
    }

    public String getNombrerol() {
        return nombrerol;
    }

    public void setNombrerol(String nombrerol) {
        this.nombrerol = nombrerol;
    }

    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigorol != null ? codigorol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rol)) {
            return false;
        }
        Rol other = (Rol) object;
        if ((this.codigorol == null && other.codigorol != null) || (this.codigorol != null && !this.codigorol.equals(other.codigorol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mj.gob.sisadmrh.model.Rol[ codigorol=" + codigorol + " ]";
    }
    
}
