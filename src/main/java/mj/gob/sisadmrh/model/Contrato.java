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
@Table(name = "contrato")
@NamedQueries({
    @NamedQuery(name = "Contrato.findAll", query = "SELECT c FROM Contrato c")})
public class Contrato implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigocontrato", nullable = false)
    private Integer codigocontrato;
    @Column(name = "fechafincontrato")
    @Temporal(TemporalType.DATE)
    private Date fechafincontrato;
    @Column(name = "fechainiciocontrato")
    @Temporal(TemporalType.DATE)
    private Date fechainiciocontrato;
    @Size(max = 100)
    @Column(name = "lineatrabajo", length = 100)
    private String lineatrabajo;
    @Size(max = 9)
    @Column(name = "partidacontrato", length = 9)
    private String partidacontrato;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "salarioactual", precision = 12)
    private Float salarioactual;
    @Size(max = 100)
    @Column(name = "subpartidacontrato", length = 100)
    private String subpartidacontrato;
    @Size(max = 100)
    @Column(name = "unidadprecide", length = 100)
    private String unidadprecide;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigoempleado", nullable = false)
    private int codigoempleado;
    @Size(max = 100)
    @Column(name = "plazanominal", length = 100)
    private String plazanominal;
    @Size(max = 50)
    @Column(name = "sistemapago", length = 50)
    private String sistemapago;

    public Contrato() {
    }

    public Contrato(Integer codigocontrato) {
        this.codigocontrato = codigocontrato;
    }

    public Contrato(Integer codigocontrato, int codigoempleado) {
        this.codigocontrato = codigocontrato;
        this.codigoempleado = codigoempleado;
    }

    public Integer getCodigocontrato() {
        return codigocontrato;
    }

    public void setCodigocontrato(Integer codigocontrato) {
        this.codigocontrato = codigocontrato;
    }

    public Date getFechafincontrato() {
        return fechafincontrato;
    }

    public void setFechafincontrato(Date fechafincontrato) {
        this.fechafincontrato = fechafincontrato;
    }

    public Date getFechainiciocontrato() {
        return fechainiciocontrato;
    }

    public void setFechainiciocontrato(Date fechainiciocontrato) {
        this.fechainiciocontrato = fechainiciocontrato;
    }

    public String getLineatrabajo() {
        return lineatrabajo;
    }

    public void setLineatrabajo(String lineatrabajo) {
        this.lineatrabajo = lineatrabajo;
    }

    public String getPartidacontrato() {
        return partidacontrato;
    }

    public void setPartidacontrato(String partidacontrato) {
        this.partidacontrato = partidacontrato;
    }

    public Float getSalarioactual() {
        return salarioactual;
    }

    public void setSalarioactual(Float salarioactual) {
        this.salarioactual = salarioactual;
    }

    public String getSubpartidacontrato() {
        return subpartidacontrato;
    }

    public void setSubpartidacontrato(String subpartidacontrato) {
        this.subpartidacontrato = subpartidacontrato;
    }

    public String getUnidadprecide() {
        return unidadprecide;
    }

    public void setUnidadprecide(String unidadprecide) {
        this.unidadprecide = unidadprecide;
    }

    public int getCodigoempleado() {
        return codigoempleado;
    }

    public void setCodigoempleado(int codigoempleado) {
        this.codigoempleado = codigoempleado;
    }

    public String getPlazanominal() {
        return plazanominal;
    }

    public void setPlazanominal(String plazanominal) {
        this.plazanominal = plazanominal;
    }

    public String getSistemapago() {
        return sistemapago;
    }

    public void setSistemapago(String sistemapago) {
        this.sistemapago = sistemapago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigocontrato != null ? codigocontrato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contrato)) {
            return false;
        }
        Contrato other = (Contrato) object;
        if ((this.codigocontrato == null && other.codigocontrato != null) || (this.codigocontrato != null && !this.codigocontrato.equals(other.codigocontrato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mj.gob.sisadmrh.model.Contrato[ codigocontrato=" + codigocontrato + " ]";
    }
    
}
