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

/**
 *
 * @author developer
 */
@Entity
@Table(name = "empleado", catalog = "SISADMRH", schema = "")
@NamedQueries({
    @NamedQuery(name = "Empleado_1.findAll", query = "SELECT e FROM Empleado_1 e")})
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 50)
    @Column(name = "NOMBREEMPLEADO", length = 50)
    private String nombreempleado;
    @Size(max = 50)
    @Column(name = "APELLIDOEMPLEADO", length = 50)
    private String apellidoempleado;
    @Column(name = "FECHANACIMIENTOEMPLEADO")
    @Temporal(TemporalType.DATE)
    private Date fechanacimientoempleado;
    @Size(max = 50)
    @Column(name = "NACIONALIDAD", length = 50)
    private String nacionalidad;
    @Size(max = 50)
    @Column(name = "TIPONACIONALIDAD", length = 50)
    private String tiponacionalidad;
    @Size(max = 50)
    @Column(name = "DEPARTAMENTONACIMIENTO", length = 50)
    private String departamentonacimiento;
    @Size(max = 50)
    @Column(name = "MUNICIPIONACIMIENTO", length = 50)
    private String municipionacimiento;
    @Size(max = 20)
    @Column(name = "GRUPOSANQUINEO", length = 20)
    private String gruposanquineo;
    @Size(max = 11)
    @Column(name = "TELEFONOMOVILEMPLEADO", length = 11)
    private String telefonomovilempleado;
    @Size(max = 11)
    @Column(name = "TELEFONOFIJOEMPLEADO", length = 11)
    private String telefonofijoempleado;
    @Size(max = 50)
    @Column(name = "RESIDENCIAPERMANENTE", length = 50)
    private String residenciapermanente;
    @Size(max = 50)
    @Column(name = "ESTADOFAMILIAR", length = 50)
    private String estadofamiliar;
    @Size(max = 50)
    @Column(name = "DEPARTAMENTORECIDENCIA", length = 50)
    private String departamentorecidencia;
    @Size(max = 50)
    @Column(name = "MUNICIPIORESIDENCIA", length = 50)
    private String municipioresidencia;
    @Size(max = 10)
    @Column(name = "DUIEMPLEADO", length = 10)
    private String duiempleado;
    @Size(max = 17)
    @Column(name = "NITEMPLEADOR", length = 17)
    private String nitempleador;
    @Size(max = 9)
    @Column(name = "ISSSEMPLEADO", length = 9)
    private String isssempleado;
    @Column(name = "FECHAINGRESOSECPUB")
    @Temporal(TemporalType.DATE)
    private Date fechaingresosecpub;
    @Column(name = "FECHAINGRESOSECPRIV")
    @Temporal(TemporalType.DATE)
    private Date fechaingresosecpriv;
    @Column(name = "FECHAINGRESOMINISTERIO")
    @Temporal(TemporalType.DATE)
    private Date fechaingresoministerio;
    @Size(max = 6)
    @Column(name = "AFILIACIONPENSION", length = 6)
    private String afiliacionpension;
    @Size(max = 12)
    @Column(name = "NUMEROAFILIACION", length = 12)
    private String numeroafiliacion;
    @Size(max = 2)
    @Column(name = "TIPOCUENTA", length = 2)
    private String tipocuenta;
    @Size(max = 50)
    @Column(name = "NOMBREINSTIUCIONDEPOSITAR", length = 50)
    private String nombreinstiuciondepositar;
    @Size(max = 50)
    @Column(name = "EMAILEMPLEADO", length = 50)
    private String emailempleado;
    @Column(name = "ESTADOEMPLEADO")
    private Integer estadoempleado;
    @Size(max = 1)
    @Column(name = "SEXOEMPLEADO", length = 1)
    private String sexoempleado;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODIGOEMPLEADO", nullable = false)
    private Integer codigoempleado;
    @Size(max = 50)
    @Column(name = "recidenciapermanente", length = 50)
    private String recidenciapermanente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigopuesto", nullable = false)
    private int codigopuesto;

    public Empleado() {
    }

    public Empleado(Integer codigoempleado) {
        this.codigoempleado = codigoempleado;
    }

    public Empleado(Integer codigoempleado, int codigopuesto) {
        this.codigoempleado = codigoempleado;
        this.codigopuesto = codigopuesto;
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

    public Date getFechanacimientoempleado() {
        return fechanacimientoempleado;
    }

    public void setFechanacimientoempleado(Date fechanacimientoempleado) {
        this.fechanacimientoempleado = fechanacimientoempleado;
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

    public String getResidenciapermanente() {
        return residenciapermanente;
    }

    public void setResidenciapermanente(String residenciapermanente) {
        this.residenciapermanente = residenciapermanente;
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

    public Integer getEstadoempleado() {
        return estadoempleado;
    }

    public void setEstadoempleado(Integer estadoempleado) {
        this.estadoempleado = estadoempleado;
    }

    public String getSexoempleado() {
        return sexoempleado;
    }

    public void setSexoempleado(String sexoempleado) {
        this.sexoempleado = sexoempleado;
    }

    public Integer getCodigoempleado() {
        return codigoempleado;
    }

    public void setCodigoempleado(Integer codigoempleado) {
        this.codigoempleado = codigoempleado;
    }

    public String getRecidenciapermanente() {
        return recidenciapermanente;
    }

    public void setRecidenciapermanente(String recidenciapermanente) {
        this.recidenciapermanente = recidenciapermanente;
    }

    public int getCodigopuesto() {
        return codigopuesto;
    }

    public void setCodigopuesto(int codigopuesto) {
        this.codigopuesto = codigopuesto;
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
    
}
