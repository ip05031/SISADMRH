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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author developer
 */
@Entity
@Table(name = "contacto")
@NamedQueries({
    @NamedQuery(name = "Contacto.findAll", query = "SELECT c FROM Contacto c")})
public class Contacto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigocontacto", nullable = false)
    private Integer codigocontacto;
    @Size(max = 50)
    @Column(name = "nombrecontacto", length = 50)
    private String nombrecontacto;
    @Size(max = 50)
    @Column(name = "apellidocontacto", length = 50)
    private String apellidocontacto;
    @Size(max = 100)
    @Column(name = "direccion", length = 100)
    private String direccion;
    @Size(max = 100)
    @Column(name = "emailcontacto", length = 100)
    private String emailcontacto;
    @Size(max = 100)
    @Column(name = "sexocontacto", length = 100)
    private String sexocontacto;
    @Size(max = 11)
    @Column(name = "telefonofijocontacto", length = 11)
    private String telefonofijocontacto;
    @Size(max = 11)
    @Column(name = "telefonomovilcontacto", length = 11)
    private String telefonomovilcontacto;

    public Contacto() {
    }

    public Contacto(Integer codigocontacto) {
        this.codigocontacto = codigocontacto;
    }

    public Integer getCodigocontacto() {
        return codigocontacto;
    }

    public void setCodigocontacto(Integer codigocontacto) {
        this.codigocontacto = codigocontacto;
    }

    public String getNombrecontacto() {
        return nombrecontacto;
    }

    public void setNombrecontacto(String nombrecontacto) {
        this.nombrecontacto = nombrecontacto;
    }

    public String getApellidocontacto() {
        return apellidocontacto;
    }

    public void setApellidocontacto(String apellidocontacto) {
        this.apellidocontacto = apellidocontacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmailcontacto() {
        return emailcontacto;
    }

    public void setEmailcontacto(String emailcontacto) {
        this.emailcontacto = emailcontacto;
    }

    public String getSexocontacto() {
        return sexocontacto;
    }

    public void setSexocontacto(String sexocontacto) {
        this.sexocontacto = sexocontacto;
    }

    public String getTelefonofijocontacto() {
        return telefonofijocontacto;
    }

    public void setTelefonofijocontacto(String telefonofijocontacto) {
        this.telefonofijocontacto = telefonofijocontacto;
    }

    public String getTelefonomovilcontacto() {
        return telefonomovilcontacto;
    }

    public void setTelefonomovilcontacto(String telefonomovilcontacto) {
        this.telefonomovilcontacto = telefonomovilcontacto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigocontacto != null ? codigocontacto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contacto)) {
            return false;
        }
        Contacto other = (Contacto) object;
        if ((this.codigocontacto == null && other.codigocontacto != null) || (this.codigocontacto != null && !this.codigocontacto.equals(other.codigocontacto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mj.gob.sisadmrh.model.Contacto[ codigocontacto=" + codigocontacto + " ]";
    }
    
}
