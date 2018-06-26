/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author root
 */
@Embeddable
public class EmpleadobeneficioPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGOEMPLEADO")
    private int codigoempleado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGOBENEFICIO")
    private int codigobeneficio;

    public EmpleadobeneficioPK() {
    }

    public EmpleadobeneficioPK(int codigoempleado, int codigobeneficio) {
        this.codigoempleado = codigoempleado;
        this.codigobeneficio = codigobeneficio;
    }

    public int getCodigoempleado() {
        return codigoempleado;
    }

    public void setCodigoempleado(int codigoempleado) {
        this.codigoempleado = codigoempleado;
    }

    public int getCodigobeneficio() {
        return codigobeneficio;
    }

    public void setCodigobeneficio(int codigobeneficio) {
        this.codigobeneficio = codigobeneficio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codigoempleado;
        hash += (int) codigobeneficio;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpleadobeneficioPK)) {
            return false;
        }
        EmpleadobeneficioPK other = (EmpleadobeneficioPK) object;
        if (this.codigoempleado != other.codigoempleado) {
            return false;
        }
        if (this.codigobeneficio != other.codigobeneficio) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mj.gob.sisadmrh.model.EmpleadobeneficioPK[ codigoempleado=" + codigoempleado + ", codigobeneficio=" + codigobeneficio + " ]";
    }
    
}
