/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "estado")

@NamedQueries({
    @NamedQuery(name = "Estado.findAll", query = "SELECT e FROM Estado e")})
public class Estado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODIGOESTADO")
    private Integer codigoestado;
    @Size(max = 50)
    @Column(name = "NOMBREESTADO")
    private String nombreestado;
    @Size(max = 100)
    @Column(name = "VALORESTADO")
    private String valorestado;
     public Estado() {
    }

    public Integer getCodigoestado() {
        return codigoestado;
    }

    public void setCodigoestado(Integer codigoestado) {
        this.codigoestado = codigoestado;
    }

    public String getNombreestado() {
        return nombreestado;
    }

    public void setNombreestado(String nombreestado) {
        this.nombreestado = nombreestado;
    }

    public String getValorestado() {
        return valorestado;
    }

    public void setValorestado(String valorestado) {
        this.valorestado = valorestado;
    }



    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoestado != null ? codigoestado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estado)) {
            return false;
        }
        Estado other = (Estado) object;
        if ((this.codigoestado == null && other.codigoestado != null) || (this.codigoestado != null && !this.codigoestado.equals(other.codigoestado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mj.gob.sisadmrh.model.Usuario[ codigousuario=" + codigoestado + " ]";
    }
    
}
