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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author daniel
 */
@Entity
@Table(name = "ASISTENCIACAPACIATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Asistenciacapaciation.findAll", query = "SELECT a FROM Asistenciacapaciation a"),
    @NamedQuery(name = "Asistenciacapaciation.findByCodigoasistenciacapacitacion", query = "SELECT a FROM Asistenciacapaciation a WHERE a.codigoasistenciacapacitacion = :codigoasistenciacapacitacion"),
    @NamedQuery(name = "Asistenciacapaciation.findByHorasrecibidas", query = "SELECT a FROM Asistenciacapaciation a WHERE a.horasrecibidas = :horasrecibidas"),
    @NamedQuery(name = "Asistenciacapaciation.findByUbicacionasistenciacapacitacion", query = "SELECT a FROM Asistenciacapaciation a WHERE a.ubicacionasistenciacapacitacion = :ubicacionasistenciacapacitacion")})
public class Asistenciacapaciation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGOASISTENCIACAPACITACION")
    private Integer codigoasistenciacapacitacion;
    @Column(name = "HORASRECIBIDAS")
    private Integer horasrecibidas;
    @Size(max = 50)
    @Column(name = "UBICACIONASISTENCIACAPACITACION")
    private String ubicacionasistenciacapacitacion;
    @ManyToMany(mappedBy = "asistenciacapaciationCollection")
    private Collection<Empleado> empleadoCollection;
    @JoinColumn(name = "CODIGOCAPACITACION", referencedColumnName = "CODIGOCAPACITACION")
    @ManyToOne(optional = false)
    private Capacitacion codigocapacitacion;

    public Asistenciacapaciation() {
    }

    public Asistenciacapaciation(Integer codigoasistenciacapacitacion) {
        this.codigoasistenciacapacitacion = codigoasistenciacapacitacion;
    }

    public Integer getCodigoasistenciacapacitacion() {
        return codigoasistenciacapacitacion;
    }

    public void setCodigoasistenciacapacitacion(Integer codigoasistenciacapacitacion) {
        this.codigoasistenciacapacitacion = codigoasistenciacapacitacion;
    }

    public Integer getHorasrecibidas() {
        return horasrecibidas;
    }

    public void setHorasrecibidas(Integer horasrecibidas) {
        this.horasrecibidas = horasrecibidas;
    }

    public String getUbicacionasistenciacapacitacion() {
        return ubicacionasistenciacapacitacion;
    }

    public void setUbicacionasistenciacapacitacion(String ubicacionasistenciacapacitacion) {
        this.ubicacionasistenciacapacitacion = ubicacionasistenciacapacitacion;
    }

    @XmlTransient
    public Collection<Empleado> getEmpleadoCollection() {
        return empleadoCollection;
    }

    public void setEmpleadoCollection(Collection<Empleado> empleadoCollection) {
        this.empleadoCollection = empleadoCollection;
    }

    public Capacitacion getCodigocapacitacion() {
        return codigocapacitacion;
    }

    public void setCodigocapacitacion(Capacitacion codigocapacitacion) {
        this.codigocapacitacion = codigocapacitacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoasistenciacapacitacion != null ? codigoasistenciacapacitacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asistenciacapaciation)) {
            return false;
        }
        Asistenciacapaciation other = (Asistenciacapaciation) object;
        if ((this.codigoasistenciacapacitacion == null && other.codigoasistenciacapacitacion != null) || (this.codigoasistenciacapacitacion != null && !this.codigoasistenciacapacitacion.equals(other.codigoasistenciacapacitacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mj.gob.sisadmrh.model.Asistenciacapaciation[ codigoasistenciacapacitacion=" + codigoasistenciacapacitacion + " ]";
    }
    
}
