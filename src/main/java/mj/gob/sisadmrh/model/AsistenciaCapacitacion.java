/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "asistenciacapacitacion")
@NamedQueries({
    @NamedQuery(name = "AsistenciaCapacitacion.findAll", query = "SELECT a FROM AsistenciaCapacitacion a")})
public class AsistenciaCapacitacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "codigoasistenciacapacitacion")
    private Integer codigoasistenciacapacitacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "horasrecibidas")
    private int horasrecibidas;
    @Size(max = 50)
    @Column(name = "ubicacionasistenciacapacitacion")
    private String ubicacionasistenciacapacitacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigocapacitacion")
    private int codigocapacitacion;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "email")
    private String email;
    @Size(max = 11)
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigoempleado")
    private int codigoempleado;

    public AsistenciaCapacitacion() {
    }

    public AsistenciaCapacitacion(Integer codigoasistenciacapacitacion) {
        this.codigoasistenciacapacitacion = codigoasistenciacapacitacion;
    }

    public AsistenciaCapacitacion(Integer codigoasistenciacapacitacion, int horasrecibidas, int codigocapacitacion, int codigoempleado) {
        this.codigoasistenciacapacitacion = codigoasistenciacapacitacion;
        this.horasrecibidas = horasrecibidas;
        this.codigocapacitacion = codigocapacitacion;
        this.codigoempleado = codigoempleado;
    }

    public Integer getCodigoasistenciacapacitacion() {
        return codigoasistenciacapacitacion;
    }

    public void setCodigoasistenciacapacitacion(Integer codigoasistenciacapacitacion) {
        this.codigoasistenciacapacitacion = codigoasistenciacapacitacion;
    }

    public int getHorasrecibidas() {
        return horasrecibidas;
    }

    public void setHorasrecibidas(int horasrecibidas) {
        this.horasrecibidas = horasrecibidas;
    }

    public String getUbicacionasistenciacapacitacion() {
        return ubicacionasistenciacapacitacion;
    }

    public void setUbicacionasistenciacapacitacion(String ubicacionasistenciacapacitacion) {
        this.ubicacionasistenciacapacitacion = ubicacionasistenciacapacitacion;
    }

    public int getCodigocapacitacion() {
        return codigocapacitacion;
    }

    public void setCodigocapacitacion(int codigocapacitacion) {
        this.codigocapacitacion = codigocapacitacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCodigoempleado() {
        return codigoempleado;
    }

    public void setCodigoempleado(int codigoempleado) {
        this.codigoempleado = codigoempleado;
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
        if (!(object instanceof AsistenciaCapacitacion)) {
            return false;
        }
        AsistenciaCapacitacion other = (AsistenciaCapacitacion) object;
        if ((this.codigoasistenciacapacitacion == null && other.codigoasistenciacapacitacion != null) || (this.codigoasistenciacapacitacion != null && !this.codigoasistenciacapacitacion.equals(other.codigoasistenciacapacitacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mj.gob.sisadmrh.model.AsistenciaCapacitacion[ codigoasistenciacapacitacion=" + codigoasistenciacapacitacion + " ]";
    }
    
}
