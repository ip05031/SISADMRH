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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author daniel
 */
@Entity
@Table(name = "EMPLEADO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado_1.findAll", query = "SELECT e FROM Empleado_1 e"),
    @NamedQuery(name = "Empleado_1.findByCodigoempleado", query = "SELECT e FROM Empleado_1 e WHERE e.codigoempleado = :codigoempleado"),
    @NamedQuery(name = "Empleado_1.findByNombreempleado", query = "SELECT e FROM Empleado_1 e WHERE e.nombreempleado = :nombreempleado"),
    @NamedQuery(name = "Empleado_1.findByApellidoempleado", query = "SELECT e FROM Empleado_1 e WHERE e.apellidoempleado = :apellidoempleado"),
    @NamedQuery(name = "Empleado_1.findByFechanacimientoempleado", query = "SELECT e FROM Empleado_1 e WHERE e.fechanacimientoempleado = :fechanacimientoempleado"),
    @NamedQuery(name = "Empleado_1.findByNacionalidad", query = "SELECT e FROM Empleado_1 e WHERE e.nacionalidad = :nacionalidad"),
    @NamedQuery(name = "Empleado_1.findByTiponacionalidad", query = "SELECT e FROM Empleado_1 e WHERE e.tiponacionalidad = :tiponacionalidad"),
    @NamedQuery(name = "Empleado_1.findByDepartamentonacimiento", query = "SELECT e FROM Empleado_1 e WHERE e.departamentonacimiento = :departamentonacimiento"),
    @NamedQuery(name = "Empleado_1.findByMunicipionacimiento", query = "SELECT e FROM Empleado_1 e WHERE e.municipionacimiento = :municipionacimiento"),
    @NamedQuery(name = "Empleado_1.findByGruposanquineo", query = "SELECT e FROM Empleado_1 e WHERE e.gruposanquineo = :gruposanquineo"),
    @NamedQuery(name = "Empleado_1.findByTelefonomovilempleado", query = "SELECT e FROM Empleado_1 e WHERE e.telefonomovilempleado = :telefonomovilempleado"),
    @NamedQuery(name = "Empleado_1.findByTelefonofijoempleado", query = "SELECT e FROM Empleado_1 e WHERE e.telefonofijoempleado = :telefonofijoempleado"),
    @NamedQuery(name = "Empleado_1.findByRecidenciapermanente", query = "SELECT e FROM Empleado_1 e WHERE e.recidenciapermanente = :recidenciapermanente"),
    @NamedQuery(name = "Empleado_1.findByEstadofamiliar", query = "SELECT e FROM Empleado_1 e WHERE e.estadofamiliar = :estadofamiliar"),
    @NamedQuery(name = "Empleado_1.findByDepartamentorecidencia", query = "SELECT e FROM Empleado_1 e WHERE e.departamentorecidencia = :departamentorecidencia"),
    @NamedQuery(name = "Empleado_1.findByMunicipioresidencia", query = "SELECT e FROM Empleado_1 e WHERE e.municipioresidencia = :municipioresidencia"),
    @NamedQuery(name = "Empleado_1.findByDuiempleado", query = "SELECT e FROM Empleado_1 e WHERE e.duiempleado = :duiempleado"),
    @NamedQuery(name = "Empleado_1.findByNitempleador", query = "SELECT e FROM Empleado_1 e WHERE e.nitempleador = :nitempleador"),
    @NamedQuery(name = "Empleado_1.findByIsssempleado", query = "SELECT e FROM Empleado_1 e WHERE e.isssempleado = :isssempleado"),
    @NamedQuery(name = "Empleado_1.findByFechaingresosecpub", query = "SELECT e FROM Empleado_1 e WHERE e.fechaingresosecpub = :fechaingresosecpub"),
    @NamedQuery(name = "Empleado_1.findByFechaingresosecpriv", query = "SELECT e FROM Empleado_1 e WHERE e.fechaingresosecpriv = :fechaingresosecpriv"),
    @NamedQuery(name = "Empleado_1.findByFechaingresoministerio", query = "SELECT e FROM Empleado_1 e WHERE e.fechaingresoministerio = :fechaingresoministerio"),
    @NamedQuery(name = "Empleado_1.findByAfiliacionpension", query = "SELECT e FROM Empleado_1 e WHERE e.afiliacionpension = :afiliacionpension"),
    @NamedQuery(name = "Empleado_1.findByNumeroafiliacion", query = "SELECT e FROM Empleado_1 e WHERE e.numeroafiliacion = :numeroafiliacion"),
    @NamedQuery(name = "Empleado_1.findByTipocuenta", query = "SELECT e FROM Empleado_1 e WHERE e.tipocuenta = :tipocuenta"),
    @NamedQuery(name = "Empleado_1.findByNombreinstiuciondepositar", query = "SELECT e FROM Empleado_1 e WHERE e.nombreinstiuciondepositar = :nombreinstiuciondepositar"),
    @NamedQuery(name = "Empleado_1.findByEmailempleado", query = "SELECT e FROM Empleado_1 e WHERE e.emailempleado = :emailempleado"),
    @NamedQuery(name = "Empleado_1.findByEstadoempleado", query = "SELECT e FROM Empleado_1 e WHERE e.estadoempleado = :estadoempleado"),
    @NamedQuery(name = "Empleado_1.findBySexoempleado", query = "SELECT e FROM Empleado_1 e WHERE e.sexoempleado = :sexoempleado")})
public class Empleado implements Serializable {
    @Size(max = 50)
    @Column(name = "NOMBREEMPLEADO")
    private String nombreempleado;
    @Size(max = 50)
    @Column(name = "APELLIDOEMPLEADO")
    private String apellidoempleado;
    @Size(max = 50)
    @Column(name = "NACIONALIDAD")
    private String nacionalidad;
    @Size(max = 50)
    @Column(name = "TIPONACIONALIDAD")
    private String tiponacionalidad;
    @Size(max = 50)
    @Column(name = "DEPARTAMENTONACIMIENTO")
    private String departamentonacimiento;
    @Size(max = 50)
    @Column(name = "MUNICIPIONACIMIENTO")
    private String municipionacimiento;
    @Size(max = 20)
    @Column(name = "GRUPOSANQUINEO")
    private String gruposanquineo;
    @Size(max = 11)
    @Column(name = "TELEFONOMOVILEMPLEADO")
    private String telefonomovilempleado;
    @Size(max = 11)
    @Column(name = "TELEFONOFIJOEMPLEADO")
    private String telefonofijoempleado;
    @Size(max = 50)
    @Column(name = "RECIDENCIAPERMANENTE")
    private String recidenciapermanente;
    @Size(max = 50)
    @Column(name = "ESTADOFAMILIAR")
    private String estadofamiliar;
    @Size(max = 50)
    @Column(name = "DEPARTAMENTORECIDENCIA")
    private String departamentorecidencia;
    @Size(max = 50)
    @Column(name = "MUNICIPIORESIDENCIA")
    private String municipioresidencia;
    @Size(max = 10)
    @Column(name = "DUIEMPLEADO")
    private String duiempleado;
    @Size(max = 17)
    @Column(name = "NITEMPLEADOR")
    private String nitempleador;
    @Size(max = 9)
    @Column(name = "ISSSEMPLEADO")
    private String isssempleado;
    @Size(max = 6)
    @Column(name = "AFILIACIONPENSION")
    private String afiliacionpension;
    @Size(max = 12)
    @Column(name = "NUMEROAFILIACION")
    private String numeroafiliacion;
    @Size(max = 2)
    @Column(name = "TIPOCUENTA")
    private String tipocuenta;
    @Size(max = 50)
    @Column(name = "NOMBREINSTIUCIONDEPOSITAR")
    private String nombreinstiuciondepositar;
    @Size(max = 50)
    @Column(name = "EMAILEMPLEADO")
    private String emailempleado;
    @Size(max = 1)
    @Column(name = "SEXOEMPLEADO")
    private String sexoempleado;
    @JoinTable(name = "EMPLEADOCAPACITACION", joinColumns = {
        @JoinColumn(name = "CODIGOEMPLEADO", referencedColumnName = "CODIGOEMPLEADO")}, inverseJoinColumns = {
        @JoinColumn(name = "CODIGOCAPACITACION", referencedColumnName = "CODIGOCAPACITACION")})
    @ManyToMany
    private Collection<Capacitacion> capacitacionCollection;
    @JoinTable(name = "EMPLEADOASISTENCIACAPACITACION", joinColumns = {
        @JoinColumn(name = "CODIGOEMPLEADO", referencedColumnName = "CODIGOEMPLEADO")}, inverseJoinColumns = {
        @JoinColumn(name = "CODIGOASISTENCIACAPACITACION", referencedColumnName = "CODIGOASISTENCIACAPACITACION")})
    @ManyToMany
    private Collection<Asistenciacapaciation> asistenciacapaciationCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoempleado")
    private Collection<Capacitador> capacitadorCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGOEMPLEADO")
    private Integer codigoempleado;
    @Column(name = "FECHANACIMIENTOEMPLEADO")
    @Temporal(TemporalType.DATE)
    private Date fechanacimientoempleado;
    @Column(name = "FECHAINGRESOSECPUB")
    @Temporal(TemporalType.DATE)
    private Date fechaingresosecpub;
    @Column(name = "FECHAINGRESOSECPRIV")
    @Temporal(TemporalType.DATE)
    private Date fechaingresosecpriv;
    @Column(name = "FECHAINGRESOMINISTERIO")
    @Temporal(TemporalType.DATE)
    private Date fechaingresoministerio;
    @Column(name = "ESTADOEMPLEADO")
    private Integer estadoempleado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoempleado")
    private Collection<Comite> comiteCollection;

    public Empleado() {
    }

    public Empleado(Integer codigoempleado) {
        this.codigoempleado = codigoempleado;
    }

    public Integer getCodigoempleado() {
        return codigoempleado;
    }

    public void setCodigoempleado(Integer codigoempleado) {
        this.codigoempleado = codigoempleado;
    }


    public Date getFechanacimientoempleado() {
        return fechanacimientoempleado;
    }

    public void setFechanacimientoempleado(Date fechanacimientoempleado) {
        this.fechanacimientoempleado = fechanacimientoempleado;
    }
    public Date getFechaingresosecpub() {
        return fechaingresosecpub;
    }
    public void setFechaingresosecpub(Date fechaingresosecpub) {
        this.fechaingresosecpub = fechaingresosecpub;
    }
    public Date getFechaingresosecpriv() {
        return fechaingresosecpriv;
    }
    public void setFechaingresosecpriv(Date fechaingresosecpriv) {
        this.fechaingresosecpriv = fechaingresosecpriv;
    }
    public Date getFechaingresoministerio() {
        return fechaingresoministerio;
    }
    public void setFechaingresoministerio(Date fechaingresoministerio) {
        this.fechaingresoministerio = fechaingresoministerio;
    }
    public Integer getEstadoempleado() {
        return estadoempleado;
    }
    public void setEstadoempleado(Integer estadoempleado) {
        this.estadoempleado = estadoempleado;
    }
    @XmlTransient
    public Collection<Comite> getComiteCollection() {
        return comiteCollection;
    }
    public void setComiteCollection(Collection<Comite> comiteCollection) {
        this.comiteCollection = comiteCollection;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoempleado != null ? codigoempleado.hashCode() : 0);
        return hash;
    }
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.codigoempleado == null && other.codigoempleado != null) || (this.codigoempleado != null && !this.codigoempleado.equals(other.codigoempleado))) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "mj.gob.sisadmrh.model.Empleado_1[ codigoempleado=" + codigoempleado + " ]";
    }

    public String getNombreempleado() {
        return nombreempleado;
    }

    public void setNombreempleado(String nombreempleado) {
        this.nombreempleado = nombreempleado;
    }

    public String getApellidoempleado() {
        return apellidoempleado;
    }

    public void setApellidoempleado(String apellidoempleado) {
        this.apellidoempleado = apellidoempleado;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTiponacionalidad() {
        return tiponacionalidad;
    }

    public void setTiponacionalidad(String tiponacionalidad) {
        this.tiponacionalidad = tiponacionalidad;
    }

    public String getDepartamentonacimiento() {
        return departamentonacimiento;
    }

    public void setDepartamentonacimiento(String departamentonacimiento) {
        this.departamentonacimiento = departamentonacimiento;
    }

    public String getMunicipionacimiento() {
        return municipionacimiento;
    }

    public void setMunicipionacimiento(String municipionacimiento) {
        this.municipionacimiento = municipionacimiento;
    }

    public String getGruposanquineo() {
        return gruposanquineo;
    }

    public void setGruposanquineo(String gruposanquineo) {
        this.gruposanquineo = gruposanquineo;
    }

    public String getTelefonomovilempleado() {
        return telefonomovilempleado;
    }

    public void setTelefonomovilempleado(String telefonomovilempleado) {
        this.telefonomovilempleado = telefonomovilempleado;
    }

    public String getTelefonofijoempleado() {
        return telefonofijoempleado;
    }

    public void setTelefonofijoempleado(String telefonofijoempleado) {
        this.telefonofijoempleado = telefonofijoempleado;
    }

    public String getRecidenciapermanente() {
        return recidenciapermanente;
    }

    public void setRecidenciapermanente(String recidenciapermanente) {
        this.recidenciapermanente = recidenciapermanente;
    }

    public String getEstadofamiliar() {
        return estadofamiliar;
    }

    public void setEstadofamiliar(String estadofamiliar) {
        this.estadofamiliar = estadofamiliar;
    }

    public String getDepartamentorecidencia() {
        return departamentorecidencia;
    }

    public void setDepartamentorecidencia(String departamentorecidencia) {
        this.departamentorecidencia = departamentorecidencia;
    }

    public String getMunicipioresidencia() {
        return municipioresidencia;
    }

    public void setMunicipioresidencia(String municipioresidencia) {
        this.municipioresidencia = municipioresidencia;
    }

    public String getDuiempleado() {
        return duiempleado;
    }

    public void setDuiempleado(String duiempleado) {
        this.duiempleado = duiempleado;
    }

    public String getNitempleador() {
        return nitempleador;
    }

    public void setNitempleador(String nitempleador) {
        this.nitempleador = nitempleador;
    }

    public String getIsssempleado() {
        return isssempleado;
    }

    public void setIsssempleado(String isssempleado) {
        this.isssempleado = isssempleado;
    }

    public String getAfiliacionpension() {
        return afiliacionpension;
    }

    public void setAfiliacionpension(String afiliacionpension) {
        this.afiliacionpension = afiliacionpension;
    }

    public String getNumeroafiliacion() {
        return numeroafiliacion;
    }

    public void setNumeroafiliacion(String numeroafiliacion) {
        this.numeroafiliacion = numeroafiliacion;
    }

    public String getTipocuenta() {
        return tipocuenta;
    }

    public void setTipocuenta(String tipocuenta) {
        this.tipocuenta = tipocuenta;
    }

    public String getNombreinstiuciondepositar() {
        return nombreinstiuciondepositar;
    }

    public void setNombreinstiuciondepositar(String nombreinstiuciondepositar) {
        this.nombreinstiuciondepositar = nombreinstiuciondepositar;
    }

    public String getEmailempleado() {
        return emailempleado;
    }

    public void setEmailempleado(String emailempleado) {
        this.emailempleado = emailempleado;
    }

    public String getSexoempleado() {
        return sexoempleado;
    }

    public void setSexoempleado(String sexoempleado) {
        this.sexoempleado = sexoempleado;
    }

    @XmlTransient
    public Collection<Capacitacion> getCapacitacionCollection() {
        return capacitacionCollection;
    }

    public void setCapacitacionCollection(Collection<Capacitacion> capacitacionCollection) {
        this.capacitacionCollection = capacitacionCollection;
    }

    @XmlTransient
    public Collection<Asistenciacapaciation> getAsistenciacapaciationCollection() {
        return asistenciacapaciationCollection;
    }

    public void setAsistenciacapaciationCollection(Collection<Asistenciacapaciation> asistenciacapaciationCollection) {
        this.asistenciacapaciationCollection = asistenciacapaciationCollection;
    }

    @XmlTransient
    public Collection<Capacitador> getCapacitadorCollection() {
        return capacitadorCollection;
    }

    public void setCapacitadorCollection(Collection<Capacitador> capacitadorCollection) {
        this.capacitadorCollection = capacitadorCollection;
    }
    
}
