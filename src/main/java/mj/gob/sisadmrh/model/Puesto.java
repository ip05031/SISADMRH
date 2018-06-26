/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.model;

//import java.io.Serializable;
//import java.util.Date;
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
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
 * @author developer
 */
@Entity
@Table(name = "puesto")
@NamedQueries({
    @NamedQuery(name = "Puesto.findAll", query = "SELECT p FROM Puesto p")})
public class Puesto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODIGOPUESTO")
    private Integer codigopuesto;
    @Size(max = 50)
    @Column(name = "CATEGORIAPUESTO")
    private String categoriapuesto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SUELDOBASE")
    private Float sueldobase;
    @Size(max = 50)
    @Column(name = "NOMBREPUESTO")
    private String nombrepuesto;
    @Size(max = 50)
    @Column(name = "NOMBREJERARQUIA")
    private String nombrejerarquia;
    @Size(max = 10)
    @Column(name = "ESTADOPLANILLA")
    private String estadoplanilla;
    @Column(name = "FECHAAUTORIZACIONPUESTO")
    @Temporal(TemporalType.DATE)
    private Date fechaautorizacionpuesto;
    @Column(name = "FECHABAJA")
    @Temporal(TemporalType.DATE)
    private Date fechabaja;
    @Column(name = "FECHACONTRATACIONDESDE")
    @Temporal(TemporalType.DATE)
    private Date fechacontrataciondesde;
    @Column(name = "FECHACONTRATACIONHASTA")
    @Temporal(TemporalType.DATE)
    private Date fechacontratacionhasta;
    @Column(name = "FECHANOMBRAMIENTO")
    @Temporal(TemporalType.DATE)
    private Date fechanombramiento;
    @Column(name = "FECHAMODIFICACION")
    @Temporal(TemporalType.DATE)
    private Date fechamodificacion;
    @Size(max = 25)
    @Column(name = "NIVELPUESTO")
    private String nivelpuesto;
    @Size(max = 75)
    @Column(name = "SUBLINEA")
    private String sublinea;
    @Size(max = 50)
    @Column(name = "TIPOFINANZA")
    private String tipofinanza;
    @Size(max = 50)
    @Column(name = "UBICACIONPUESTO")
    private String ubicacionpuesto;
    @Size(max = 20)
    @Column(name = "FORMAPAGO")
    private String formapago;
    @Size(max = 50)
    @Column(name = "CATEGORIASUELDO")
    private String categoriasueldo;
    @Column(name = "FECHAVACANTE")
    @Temporal(TemporalType.DATE)
    private Date fechavacante;
    @Size(max = 50)
    @Column(name = "ULTIMOEMPLEADO")
    private String ultimoempleado;
    @Size(max = 10)
    @Column(name = "NUMEROPARTIDAPUESTO")
    private String numeropartidapuesto;
    @Size(max = 10)
    @Column(name = "NUMEROSUBPARTIDAPUESTO")
    private String numerosubpartidapuesto;
    @Column(name = "SUELDOTOPEPUESTO")
    private Float sueldotopepuesto;
    @Size(max = 10)
    @Column(name = "CODIGOCARGOPUESTO")
    private String codigocargopuesto;
    @Column(name = "FECHAAPROBACION")
    @Temporal(TemporalType.DATE)
    private Date fechaaprobacion;
    @Column(name = "FECHACREACION")
    @Temporal(TemporalType.DATE)
    private Date fechacreacion;
    @Column(name = "ESTADOPUESTO")
    private Integer estadopuesto;

    public Puesto() {
    }

    public Puesto(Integer codigopuesto) {
        this.codigopuesto = codigopuesto;
    }

    public Integer getCodigopuesto() {
        return codigopuesto;
    }

    public void setCodigopuesto(Integer codigopuesto) {
        this.codigopuesto = codigopuesto;
    }

    public String getCategoriapuesto() {
        return categoriapuesto;
    }

    public void setCategoriapuesto(String categoriapuesto) {
        this.categoriapuesto = categoriapuesto;
    }

    public Float getSueldobase() {
        return sueldobase;
    }

    public void setSueldobase(Float sueldobase) {
        this.sueldobase = sueldobase;
    }

    public String getNombrepuesto() {
        return nombrepuesto;
    }

    public void setNombrepuesto(String nombrepuesto) {
        this.nombrepuesto = nombrepuesto;
    }

    public String getNombrejerarquia() {
        return nombrejerarquia;
    }

    public void setNombrejerarquia(String nombrejerarquia) {
        this.nombrejerarquia = nombrejerarquia;
    }

    public String getEstadoplanilla() {
        return estadoplanilla;
    }

    public void setEstadoplanilla(String estadoplanilla) {
        this.estadoplanilla = estadoplanilla;
    }

    public Date getFechaautorizacionpuesto() {
        return fechaautorizacionpuesto;
    }

    public void setFechaautorizacionpuesto(Date fechaautorizacionpuesto) {
        this.fechaautorizacionpuesto = fechaautorizacionpuesto;
    }

    public Date getFechabaja() {
        return fechabaja;
    }

    public void setFechabaja(Date fechabaja) {
        this.fechabaja = fechabaja;
    }

    public Date getFechacontrataciondesde() {
        return fechacontrataciondesde;
    }

    public void setFechacontrataciondesde(Date fechacontrataciondesde) {
        this.fechacontrataciondesde = fechacontrataciondesde;
    }

    public Date getFechacontratacionhasta() {
        return fechacontratacionhasta;
    }

    public void setFechacontratacionhasta(Date fechacontratacionhasta) {
        this.fechacontratacionhasta = fechacontratacionhasta;
    }

    public Date getFechanombramiento() {
        return fechanombramiento;
    }

    public void setFechanombramiento(Date fechanombramiento) {
        this.fechanombramiento = fechanombramiento;
    }

    public Date getFechamodificacion() {
        return fechamodificacion;
    }

    public void setFechamodificacion(Date fechamodificacion) {
        this.fechamodificacion = fechamodificacion;
    }

    public String getNivelpuesto() {
        return nivelpuesto;
    }

    public void setNivelpuesto(String nivelpuesto) {
        this.nivelpuesto = nivelpuesto;
    }

    public String getSublinea() {
        return sublinea;
    }

    public void setSublinea(String sublinea) {
        this.sublinea = sublinea;
    }

    public String getTipofinanza() {
        return tipofinanza;
    }

    public void setTipofinanza(String tipofinanza) {
        this.tipofinanza = tipofinanza;
    }

    public String getUbicacionpuesto() {
        return ubicacionpuesto;
    }

    public void setUbicacionpuesto(String ubicacionpuesto) {
        this.ubicacionpuesto = ubicacionpuesto;
    }

    public String getFormapago() {
        return formapago;
    }

    public void setFormapago(String formapago) {
        this.formapago = formapago;
    }

    public String getCategoriasueldo() {
        return categoriasueldo;
    }

    public void setCategoriasueldo(String categoriasueldo) {
        this.categoriasueldo = categoriasueldo;
    }

    public Date getFechavacante() {
        return fechavacante;
    }

    public void setFechavacante(Date fechavacante) {
        this.fechavacante = fechavacante;
    }

    public String getUltimoempleado() {
        return ultimoempleado;
    }

    public void setUltimoempleado(String ultimoempleado) {
        this.ultimoempleado = ultimoempleado;
    }

    public String getNumeropartidapuesto() {
        return numeropartidapuesto;
    }

    public void setNumeropartidapuesto(String numeropartidapuesto) {
        this.numeropartidapuesto = numeropartidapuesto;
    }

    public String getNumerosubpartidapuesto() {
        return numerosubpartidapuesto;
    }

    public void setNumerosubpartidapuesto(String numerosubpartidapuesto) {
        this.numerosubpartidapuesto = numerosubpartidapuesto;
    }

    public Float getSueldotopepuesto() {
        return sueldotopepuesto;
    }

    public void setSueldotopepuesto(Float sueldotopepuesto) {
        this.sueldotopepuesto = sueldotopepuesto;
    }

    public String getCodigocargopuesto() {
        return codigocargopuesto;
    }

    public void setCodigocargopuesto(String codigocargopuesto) {
        this.codigocargopuesto = codigocargopuesto;
    }

    public Date getFechaaprobacion() {
        return fechaaprobacion;
    }

    public void setFechaaprobacion(Date fechaaprobacion) {
        this.fechaaprobacion = fechaaprobacion;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Integer getEstadopuesto() {
        return estadopuesto;
    }

    public void setEstadopuesto(Integer estadopuesto) {
        this.estadopuesto = estadopuesto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigopuesto != null ? codigopuesto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Puesto)) {
            return false;
        }
        Puesto other = (Puesto) object;
        if ((this.codigopuesto == null && other.codigopuesto != null) || (this.codigopuesto != null && !this.codigopuesto.equals(other.codigopuesto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mj.gob.sisadmrh.model.Puesto[ codigopuesto=" + codigopuesto + " ]";
    }
    
}
