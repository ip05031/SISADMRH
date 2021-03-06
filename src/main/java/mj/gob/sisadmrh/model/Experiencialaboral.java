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
import javax.validation.constraints.Size;

/**
 *
 * @author developer
 */
@Entity
@Table(name = "experiencialaboral")
@NamedQueries({
    @NamedQuery(name = "Experiencialaboral.findAll", query = "SELECT e FROM Experiencialaboral e")})
public class Experiencialaboral implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoexperiencialaboral", nullable = false)
    private Integer codigoexperiencialaboral;
    @Size(max = 50)
    @Column(name = "nombreinstitucion", length = 50)
    private String nombreinstitucion;
    @Column(name = "fechadesdeexperiencialaboral")
    @Temporal(TemporalType.DATE)
    private Date fechadesdeexperiencialaboral;
    @Column(name = "fechahastaexperiencialaboral")
    @Temporal(TemporalType.DATE)
    private Date fechahastaexperiencialaboral;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "salarioinicial", precision = 12)
    private Float salarioinicial;
    @Column(name = "salariofinal", precision = 12)
    private Float salariofinal;
    @Size(max = 200)
    @Column(name = "motivoretiro", length = 200)
    private String motivoretiro;
    @Size(max = 20)
    @Column(name = "sectorexperiencialaboral", length = 20)
    private String sectorexperiencialaboral;

    public Experiencialaboral() {
    }

    public Experiencialaboral(Integer codigoexperiencialaboral) {
        this.codigoexperiencialaboral = codigoexperiencialaboral;
    }

    public Integer getCodigoexperiencialaboral() {
        return codigoexperiencialaboral;
    }

    public void setCodigoexperiencialaboral(Integer codigoexperiencialaboral) {
        this.codigoexperiencialaboral = codigoexperiencialaboral;
    }

    public String getNombreinstitucion() {
        return nombreinstitucion;
    }

    public void setNombreinstitucion(String nombreinstitucion) {
        this.nombreinstitucion = nombreinstitucion;
    }

    public Date getFechadesdeexperiencialaboral() {
        return fechadesdeexperiencialaboral;
    }

    public void setFechadesdeexperiencialaboral(Date fechadesdeexperiencialaboral) {
        this.fechadesdeexperiencialaboral = fechadesdeexperiencialaboral;
    }

    public Date getFechahastaexperiencialaboral() {
        return fechahastaexperiencialaboral;
    }

    public void setFechahastaexperiencialaboral(Date fechahastaexperiencialaboral) {
        this.fechahastaexperiencialaboral = fechahastaexperiencialaboral;
    }

    public Float getSalarioinicial() {
        return salarioinicial;
    }

    public void setSalarioinicial(Float salarioinicial) {
        this.salarioinicial = salarioinicial;
    }

    public Float getSalariofinal() {
        return salariofinal;
    }

    public void setSalariofinal(Float salariofinal) {
        this.salariofinal = salariofinal;
    }

    public String getMotivoretiro() {
        return motivoretiro;
    }

    public void setMotivoretiro(String motivoretiro) {
        this.motivoretiro = motivoretiro;
    }

    public String getSectorexperiencialaboral() {
        return sectorexperiencialaboral;
    }

    public void setSectorexperiencialaboral(String sectorexperiencialaboral) {
        this.sectorexperiencialaboral = sectorexperiencialaboral;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoexperiencialaboral != null ? codigoexperiencialaboral.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Experiencialaboral)) {
            return false;
        }
        Experiencialaboral other = (Experiencialaboral) object;
        if ((this.codigoexperiencialaboral == null && other.codigoexperiencialaboral != null) || (this.codigoexperiencialaboral != null && !this.codigoexperiencialaboral.equals(other.codigoexperiencialaboral))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mj.gob.sisadmrh.model.Experiencialaboral[ codigoexperiencialaboral=" + codigoexperiencialaboral + " ]";
    }
    
}
