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
 * @author root
 */
@Entity
@Table(name = "evaluacioncapacitacion")
@NamedQueries({
    @NamedQuery(name = "Evaluacioncapacitacion.findAll", query = "SELECT e FROM Evaluacioncapacitacion e")})
public class Evaluacioncapacitacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "codigoevaluacioncapacitacion")
    private Integer codigoevaluacioncapacitacion;
    @Size(max = 2)
    @Column(name = "alclaradudas")
    private String alclaradudas;
    @Size(max = 2)
    @Column(name = "claridadtema")
    private String claridadtema;
    @Size(max = 100)
    @Column(name = "comentario")
    private String comentario;
    @Size(max = 2)
    @Column(name = "comprenciondetema")
    private String comprenciondetema;
    @Size(max = 4)
    @Column(name = "contenidoaplicadotrabajo")
    private String contenidoaplicadotrabajo;
    @Size(max = 4)
    @Column(name = "contenidoclaro")
    private String contenidoclaro;
    @Size(max = 4)
    @Column(name = "distribuciontiempo")
    private String distribuciontiempo;
    @Size(max = 4)
    @Column(name = "dominiotema")
    private String dominiotema;
    @Size(max = 2)
    @Column(name = "equipotecnologico")
    private String equipotecnologico;
    @Size(max = 2)
    @Column(name = "espectativa")
    private String espectativa;
    @Size(max = 2)
    @Column(name = "habilidadcomunicacion")
    private String habilidadcomunicacion;
    @Column(name = "horaevualuacioncapacitacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaevualuacioncapacitacion;
    @Size(max = 2)
    @Column(name = "interestema")
    private String interestema;
    @Size(max = 100)
    @Column(name = "lugarcapacitacion")
    private String lugarcapacitacion;
    @Size(max = 2)
    @Column(name = "materialutilizado")
    private String materialutilizado;
    @Size(max = 2)
    @Column(name = "necesariocapacitacion")
    private String necesariocapacitacion;
    @Size(max = 4)
    @Column(name = "planeaciontiempo")
    private String planeaciontiempo;
    @Size(max = 2)
    @Column(name = "puntualidad")
    private String puntualidad;
    @Size(max = 2)
    @Column(name = "satifacciondetema")
    private String satifacciondetema;
    @Size(max = 2)
    @Column(name = "satisfechocontenido")
    private String satisfechocontenido;
    @Size(max = 2)
    @Column(name = "tiempocapacitacionoptimo")
    private String tiempocapacitacionoptimo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigocapacitacion")
    private int codigocapacitacion;

    public Evaluacioncapacitacion() {
    }

    public Evaluacioncapacitacion(Integer codigoevaluacioncapacitacion) {
        this.codigoevaluacioncapacitacion = codigoevaluacioncapacitacion;
    }

    public Evaluacioncapacitacion(Integer codigoevaluacioncapacitacion, int codigocapacitacion) {
        this.codigoevaluacioncapacitacion = codigoevaluacioncapacitacion;
        this.codigocapacitacion = codigocapacitacion;
    }

    public Integer getCodigoevaluacioncapacitacion() {
        return codigoevaluacioncapacitacion;
    }

    public void setCodigoevaluacioncapacitacion(Integer codigoevaluacioncapacitacion) {
        this.codigoevaluacioncapacitacion = codigoevaluacioncapacitacion;
    }

    public String getAlclaradudas() {
        return alclaradudas;
    }

    public void setAlclaradudas(String alclaradudas) {
        this.alclaradudas = alclaradudas;
    }

    public String getClaridadtema() {
        return claridadtema;
    }

    public void setClaridadtema(String claridadtema) {
        this.claridadtema = claridadtema;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getComprenciondetema() {
        return comprenciondetema;
    }

    public void setComprenciondetema(String comprenciondetema) {
        this.comprenciondetema = comprenciondetema;
    }

    public String getContenidoaplicadotrabajo() {
        return contenidoaplicadotrabajo;
    }

    public void setContenidoaplicadotrabajo(String contenidoaplicadotrabajo) {
        this.contenidoaplicadotrabajo = contenidoaplicadotrabajo;
    }

    public String getContenidoclaro() {
        return contenidoclaro;
    }

    public void setContenidoclaro(String contenidoclaro) {
        this.contenidoclaro = contenidoclaro;
    }

    public String getDistribuciontiempo() {
        return distribuciontiempo;
    }

    public void setDistribuciontiempo(String distribuciontiempo) {
        this.distribuciontiempo = distribuciontiempo;
    }

    public String getDominiotema() {
        return dominiotema;
    }

    public void setDominiotema(String dominiotema) {
        this.dominiotema = dominiotema;
    }

    public String getEquipotecnologico() {
        return equipotecnologico;
    }

    public void setEquipotecnologico(String equipotecnologico) {
        this.equipotecnologico = equipotecnologico;
    }

    public String getEspectativa() {
        return espectativa;
    }

    public void setEspectativa(String espectativa) {
        this.espectativa = espectativa;
    }

    public String getHabilidadcomunicacion() {
        return habilidadcomunicacion;
    }

    public void setHabilidadcomunicacion(String habilidadcomunicacion) {
        this.habilidadcomunicacion = habilidadcomunicacion;
    }

    public Date getHoraevualuacioncapacitacion() {
        return horaevualuacioncapacitacion;
    }

    public void setHoraevualuacioncapacitacion(Date horaevualuacioncapacitacion) {
        this.horaevualuacioncapacitacion = horaevualuacioncapacitacion;
    }

    public String getInterestema() {
        return interestema;
    }

    public void setInterestema(String interestema) {
        this.interestema = interestema;
    }

    public String getLugarcapacitacion() {
        return lugarcapacitacion;
    }

    public void setLugarcapacitacion(String lugarcapacitacion) {
        this.lugarcapacitacion = lugarcapacitacion;
    }

    public String getMaterialutilizado() {
        return materialutilizado;
    }

    public void setMaterialutilizado(String materialutilizado) {
        this.materialutilizado = materialutilizado;
    }

    public String getNecesariocapacitacion() {
        return necesariocapacitacion;
    }

    public void setNecesariocapacitacion(String necesariocapacitacion) {
        this.necesariocapacitacion = necesariocapacitacion;
    }

    public String getPlaneaciontiempo() {
        return planeaciontiempo;
    }

    public void setPlaneaciontiempo(String planeaciontiempo) {
        this.planeaciontiempo = planeaciontiempo;
    }

    public String getPuntualidad() {
        return puntualidad;
    }

    public void setPuntualidad(String puntualidad) {
        this.puntualidad = puntualidad;
    }

    public String getSatifacciondetema() {
        return satifacciondetema;
    }

    public void setSatifacciondetema(String satifacciondetema) {
        this.satifacciondetema = satifacciondetema;
    }

    public String getSatisfechocontenido() {
        return satisfechocontenido;
    }

    public void setSatisfechocontenido(String satisfechocontenido) {
        this.satisfechocontenido = satisfechocontenido;
    }

    public String getTiempocapacitacionoptimo() {
        return tiempocapacitacionoptimo;
    }

    public void setTiempocapacitacionoptimo(String tiempocapacitacionoptimo) {
        this.tiempocapacitacionoptimo = tiempocapacitacionoptimo;
    }

    public int getCodigocapacitacion() {
        return codigocapacitacion;
    }

    public void setCodigocapacitacion(int codigocapacitacion) {
        this.codigocapacitacion = codigocapacitacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoevaluacioncapacitacion != null ? codigoevaluacioncapacitacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evaluacioncapacitacion)) {
            return false;
        }
        Evaluacioncapacitacion other = (Evaluacioncapacitacion) object;
        if ((this.codigoevaluacioncapacitacion == null && other.codigoevaluacioncapacitacion != null) || (this.codigoevaluacioncapacitacion != null && !this.codigoevaluacioncapacitacion.equals(other.codigoevaluacioncapacitacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mj.gob.sisadmrh.model.Evaluacioncapacitacion[ codigoevaluacioncapacitacion=" + codigoevaluacioncapacitacion + " ]";
    }
    
}
