/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author root
 */
@Entity
@Table(name = "COMISION")
@NamedQueries({
    @NamedQuery(name = "Comision.findAll", query = "SELECT c FROM Comision c")})
public class Comision implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODIGOCOMISION")
    private Integer codigocomision;
    @Size(max = 50)
    @Column(name = "NOMBRECOMISION")
    private String nombrecomision;
    @Column(name = "NUMEROACUERDOCOMISION")
    private Integer numeroacuerdocomision;
    @Column(name = "FECHADESDECOMISION")
   // @Temporal(TemporalType.DATE)
     @DateTimeFormat(pattern = "YYYY-MM-dd")
    private Date fechadesdecomision;
    @Column(name = "FECHAHASTACOMISION")
   // @Temporal(TemporalType.DATE)
     @DateTimeFormat(pattern = "YYYY-MM-dd")
    private Date fechahastacomision;
    @Column(name = "NIVELCOMISION")
    private Integer nivelcomision;

    public Comision() {
    }

    public Comision(Integer codigocomision) {
        this.codigocomision = codigocomision;
    }

    public Integer getCodigocomision() {
        return codigocomision;
    }

    public void setCodigocomision(Integer codigocomision) {
        this.codigocomision = codigocomision;
    }

    public String getNombrecomision() {
        return nombrecomision;
    }

    public void setNombrecomision(String nombrecomision) {
        this.nombrecomision = nombrecomision;
    }

    public Integer getNumeroacuerdocomision() {
        return numeroacuerdocomision;
    }

    public void setNumeroacuerdocomision(Integer numeroacuerdocomision) {
        this.numeroacuerdocomision = numeroacuerdocomision;
    }

    public Date getFechadesdecomision() {
        return fechadesdecomision;
    }

    public void setFechadesdecomision(Date fechadesdecomision) {
        this.fechadesdecomision = fechadesdecomision;
    }

    public Date getFechahastacomision() {
        return fechahastacomision;
    }

    public void setFechahastacomision(Date fechahastacomision) {
        this.fechahastacomision = fechahastacomision;
    }

    public Integer getNivelcomision() {
        return nivelcomision;
    }

    public void setNivelcomision(Integer nivelcomision) {
        this.nivelcomision = nivelcomision;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigocomision != null ? codigocomision.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comision)) {
            return false;
        }
        Comision other = (Comision) object;
        if ((this.codigocomision == null && other.codigocomision != null) || (this.codigocomision != null && !this.codigocomision.equals(other.codigocomision))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mj.gob.sisadmrh.model.Comision[ codigocomision=" + codigocomision + " ]";
    }
    
}
