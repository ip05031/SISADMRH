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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
 * @author daniel
 */
@Entity
@Table(name = "CAPACITACION")
@NamedQueries({
@NamedQuery(name = "Capacitacion.findAll", query = "SELECT c FROM Capacitacion c")})
public class Capacitacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGOCAPACITACION")
    private Integer codigocapacitacion;
    @Size(max = 50)
    @Column(name = "NOMBRECAPACITACION")
    private String nombrecapacitacion;
    @Size(max = 500)
    @Column(name = "DESCRIPCIONCAPACITACION")
    private String descripcioncapacitacion;
    @Size(max = 30)
    @Column(name = "CATEGORIACAPACITACION")
    private String categoriacapacitacion;
    @Size(max = 500)
    @Column(name = "DESCRIPCIONCATEGORIA")
    private String descripcioncategoria;
    @Size(max = 100)
    @Column(name = "DEPARTAMENTORESPONSABLE")
    private String departamentoresponsable;
    @Column(name = "DURACIONHORACAPACITACION")
    private Integer duracionhoracapacitacion;
    @Column(name = "DURACIONDIACAPACITACION")
    private Integer duraciondiacapacitacion;
    @Size(max = 200)
    @Column(name = "ORGANISMOPATROCINADOR")
    private String organismopatrocinador;
    @Size(max = 200)
    @Column(name = "TIPOEVENTO")
    private String tipoevento;
    @Size(max = 200)
    @Column(name = "ESPECIALIDADEVENTO")
    private String especialidadevento;
    @Size(max = 50)
    @Column(name = "PAISCAPACITACION")
    private String paiscapacitacion;
    @Column(name = "FECHACAPACITACION")
    @Temporal(TemporalType.DATE)
    private Date fechacapacitacion;
    @Size(max = 20)
    @Column(name = "TIPOCAPACITACION")
    private String tipocapacitacion;
    @Column(name = "ESTADOCAPACITACION")
    private Integer estadocapacitacion;
    @ManyToMany(mappedBy = "capacitacionList")
    private List<Empleado> empleadoList;
    @JoinColumn(name = "CODIGOCAPACITADOR", referencedColumnName = "CODIGOCAPACITADOR")
    @ManyToOne(optional = false)
    private Capacitador codigocapacitador;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigocapacitacion")
    private List<EvualuacionCapacitacion> evualuacioncapacitacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigocapacitacion")
    private List<AsistenciaCapacitacion> asistenciacapacitacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigocapacitacion")
    private List<DiagnosticoCapacitacion> diagnosticocapacitacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigocapacitacion")
    private List<CostoCapacitacion> costocapacitacionList;

    public Capacitacion() {
    }

    public Capacitacion(Integer codigocapacitacion) {
        this.codigocapacitacion = codigocapacitacion;
    }

    public Integer getCodigocapacitacion() {
        return codigocapacitacion;
    }

    public void setCodigocapacitacion(Integer codigocapacitacion) {
        this.codigocapacitacion = codigocapacitacion;
    }

    public String getNombrecapacitacion() {
        return nombrecapacitacion;
    }

    public void setNombrecapacitacion(String nombrecapacitacion) {
        this.nombrecapacitacion = nombrecapacitacion;
    }

    public String getDescripcioncapacitacion() {
        return descripcioncapacitacion;
    }

    public void setDescripcioncapacitacion(String descripcioncapacitacion) {
        this.descripcioncapacitacion = descripcioncapacitacion;
    }

    public String getCategoriacapacitacion() {
        return categoriacapacitacion;
    }

    public void setCategoriacapacitacion(String categoriacapacitacion) {
        this.categoriacapacitacion = categoriacapacitacion;
    }

    public String getDescripcioncategoria() {
        return descripcioncategoria;
    }

    public void setDescripcioncategoria(String descripcioncategoria) {
        this.descripcioncategoria = descripcioncategoria;
    }

    public String getDepartamentoresponsable() {
        return departamentoresponsable;
    }

    public void setDepartamentoresponsable(String departamentoresponsable) {
        this.departamentoresponsable = departamentoresponsable;
    }

    public Integer getDuracionhoracapacitacion() {
        return duracionhoracapacitacion;
    }

    public void setDuracionhoracapacitacion(Integer duracionhoracapacitacion) {
        this.duracionhoracapacitacion = duracionhoracapacitacion;
    }

    public Integer getDuraciondiacapacitacion() {
        return duraciondiacapacitacion;
    }

    public void setDuraciondiacapacitacion(Integer duraciondiacapacitacion) {
        this.duraciondiacapacitacion = duraciondiacapacitacion;
    }

    public String getOrganismopatrocinador() {
        return organismopatrocinador;
    }

    public void setOrganismopatrocinador(String organismopatrocinador) {
        this.organismopatrocinador = organismopatrocinador;
    }

    public String getTipoevento() {
        return tipoevento;
    }

    public void setTipoevento(String tipoevento) {
        this.tipoevento = tipoevento;
    }

    public String getEspecialidadevento() {
        return especialidadevento;
    }

    public void setEspecialidadevento(String especialidadevento) {
        this.especialidadevento = especialidadevento;
    }

    public String getPaiscapacitacion() {
        return paiscapacitacion;
    }

    public void setPaiscapacitacion(String paiscapacitacion) {
        this.paiscapacitacion = paiscapacitacion;
    }

    public Date getFechacapacitacion() {
        return fechacapacitacion;
    }

    public void setFechacapacitacion(Date fechacapacitacion) {
        this.fechacapacitacion = fechacapacitacion;
    }

    public String getTipocapacitacion() {
        return tipocapacitacion;
    }

    public void setTipocapacitacion(String tipocapacitacion) {
        this.tipocapacitacion = tipocapacitacion;
    }

    public Integer getEstadocapacitacion() {
        return estadocapacitacion;
    }

    public void setEstadocapacitacion(Integer estadocapacitacion) {
        this.estadocapacitacion = estadocapacitacion;
    }

    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }

    public Capacitador getCodigocapacitador() {
        return codigocapacitador;
    }

    public void setCodigocapacitador(Capacitador codigocapacitador) {
        this.codigocapacitador = codigocapacitador;
    }

    public List<EvualuacionCapacitacion> getEvualuacioncapacitacionList() {
        return evualuacioncapacitacionList;
    }

    public void setEvualuacioncapacitacionList(List<EvualuacionCapacitacion> evualuacioncapacitacionList) {
        this.evualuacioncapacitacionList = evualuacioncapacitacionList;
    }

    public List<AsistenciaCapacitacion> getAsistenciacapacitacionList() {
        return asistenciacapacitacionList;
    }

    public void setAsistenciacapacitacionList(List<AsistenciaCapacitacion> asistenciacapacitacionList) {
        this.asistenciacapacitacionList = asistenciacapacitacionList;
    }

    public List<DiagnosticoCapacitacion> getDiagnosticocapacitacionList() {
        return diagnosticocapacitacionList;
    }

    public void setDiagnosticocapacitacionList(List<DiagnosticoCapacitacion> diagnosticocapacitacionList) {
        this.diagnosticocapacitacionList = diagnosticocapacitacionList;
    }

    public List<CostoCapacitacion> getCostocapacitacionList() {
        return costocapacitacionList;
    }

    public void setCostocapacitacionList(List<CostoCapacitacion> costocapacitacionList) {
        this.costocapacitacionList = costocapacitacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigocapacitacion != null ? codigocapacitacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Capacitacion)) {
            return false;
        }
        Capacitacion other = (Capacitacion) object;
        if ((this.codigocapacitacion == null && other.codigocapacitacion != null) || (this.codigocapacitacion != null && !this.codigocapacitacion.equals(other.codigocapacitacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mj.gob.sisadmrh.model.Capacitacion[ codigocapacitacion=" + codigocapacitacion + " ]";
    }
    
}