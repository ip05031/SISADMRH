/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "CAPACITADOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Capacitador.findAll", query = "SELECT c FROM Capacitador c"),
    @NamedQuery(name = "Capacitador.findByCodigocapacitador", query = "SELECT c FROM Capacitador c WHERE c.codigocapacitador = :codigocapacitador"),
    @NamedQuery(name = "Capacitador.findByTemadominio", query = "SELECT c FROM Capacitador c WHERE c.temadominio = :temadominio"),
    @NamedQuery(name = "Capacitador.findByTipocapacitador", query = "SELECT c FROM Capacitador c WHERE c.tipocapacitador = :tipocapacitador"),
    @NamedQuery(name = "Capacitador.findByDuicapacitador", query = "SELECT c FROM Capacitador c WHERE c.duicapacitador = :duicapacitador"),
    @NamedQuery(name = "Capacitador.findByNitcapacitador", query = "SELECT c FROM Capacitador c WHERE c.nitcapacitador = :nitcapacitador"),
    @NamedQuery(name = "Capacitador.findByCarnetresidencia", query = "SELECT c FROM Capacitador c WHERE c.carnetresidencia = :carnetresidencia"),
    @NamedQuery(name = "Capacitador.findByTelefonocapacitador", query = "SELECT c FROM Capacitador c WHERE c.telefonocapacitador = :telefonocapacitador"),
    @NamedQuery(name = "Capacitador.findByTelefonomovilcapacitador", query = "SELECT c FROM Capacitador c WHERE c.telefonomovilcapacitador = :telefonomovilcapacitador"),
    @NamedQuery(name = "Capacitador.findByEmailcapacitador", query = "SELECT c FROM Capacitador c WHERE c.emailcapacitador = :emailcapacitador"),
    @NamedQuery(name = "Capacitador.findByNombrecapacitador", query = "SELECT c FROM Capacitador c WHERE c.nombrecapacitador = :nombrecapacitador")})
public class Capacitador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGOCAPACITADOR")
    private Integer codigocapacitador;
    @Size(max = 200)
    @Column(name = "TEMADOMINIO")
    private String temadominio;
    @Size(max = 100)
    @Column(name = "TIPOCAPACITADOR")
    private String tipocapacitador;
    @Size(max = 10)
    @Column(name = "DUICAPACITADOR")
    private String duicapacitador;
    @Size(max = 17)
    @Column(name = "NITCAPACITADOR")
    private String nitcapacitador;
    @Column(name = "CARNETRESIDENCIA")
    private Integer carnetresidencia;
    @Size(max = 11)
    @Column(name = "TELEFONOCAPACITADOR")
    private String telefonocapacitador;
    @Size(max = 11)
    @Column(name = "TELEFONOMOVILCAPACITADOR")
    private String telefonomovilcapacitador;
    @Size(max = 50)
    @Column(name = "EMAILCAPACITADOR")
    private String emailcapacitador;
    @Size(max = 100)
    @Column(name = "NOMBRECAPACITADOR")
    private String nombrecapacitador;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigocapacitador")
    private Collection<Capacitacion> capacitacionCollection;
    @JoinColumn(name = "CODIGOEMPLEADO", referencedColumnName = "CODIGOEMPLEADO")
    @ManyToOne(optional = false)
    private Empleado codigoempleado;

    public Capacitador() {
    }

    public Capacitador(Integer codigocapacitador) {
        this.codigocapacitador = codigocapacitador;
    }

    public Integer getCodigocapacitador() {
        return codigocapacitador;
    }

    public void setCodigocapacitador(Integer codigocapacitador) {
        this.codigocapacitador = codigocapacitador;
    }

    public String getTemadominio() {
        return temadominio;
    }

    public void setTemadominio(String temadominio) {
        this.temadominio = temadominio;
    }

    public String getTipocapacitador() {
        return tipocapacitador;
    }

    public void setTipocapacitador(String tipocapacitador) {
        this.tipocapacitador = tipocapacitador;
    }

    public String getDuicapacitador() {
        return duicapacitador;
    }

    public void setDuicapacitador(String duicapacitador) {
        this.duicapacitador = duicapacitador;
    }

    public String getNitcapacitador() {
        return nitcapacitador;
    }

    public void setNitcapacitador(String nitcapacitador) {
        this.nitcapacitador = nitcapacitador;
    }

    public Integer getCarnetresidencia() {
        return carnetresidencia;
    }

    public void setCarnetresidencia(Integer carnetresidencia) {
        this.carnetresidencia = carnetresidencia;
    }

    public String getTelefonocapacitador() {
        return telefonocapacitador;
    }

    public void setTelefonocapacitador(String telefonocapacitador) {
        this.telefonocapacitador = telefonocapacitador;
    }

    public String getTelefonomovilcapacitador() {
        return telefonomovilcapacitador;
    }

    public void setTelefonomovilcapacitador(String telefonomovilcapacitador) {
        this.telefonomovilcapacitador = telefonomovilcapacitador;
    }

    public String getEmailcapacitador() {
        return emailcapacitador;
    }

    public void setEmailcapacitador(String emailcapacitador) {
        this.emailcapacitador = emailcapacitador;
    }

    public String getNombrecapacitador() {
        return nombrecapacitador;
    }

    public void setNombrecapacitador(String nombrecapacitador) {
        this.nombrecapacitador = nombrecapacitador;
    }

    @XmlTransient
    public Collection<Capacitacion> getCapacitacionCollection() {
        return capacitacionCollection;
    }

    public void setCapacitacionCollection(Collection<Capacitacion> capacitacionCollection) {
        this.capacitacionCollection = capacitacionCollection;
    }

    public Empleado getCodigoempleado() {
        return codigoempleado;
    }

    public void setCodigoempleado(Empleado codigoempleado) {
        this.codigoempleado = codigoempleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigocapacitador != null ? codigocapacitador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Capacitador)) {
            return false;
        }
        Capacitador other = (Capacitador) object;
        if ((this.codigocapacitador == null && other.codigocapacitador != null) || (this.codigocapacitador != null && !this.codigocapacitador.equals(other.codigocapacitador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mj.gob.sisadmrh.model.Capacitador[ codigocapacitador=" + codigocapacitador + " ]";
    }
    
}
