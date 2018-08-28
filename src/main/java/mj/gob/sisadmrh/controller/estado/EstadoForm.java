/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.controller.estado;

import java.io.Serializable;
import mj.gob.sisadmrh.model.Estado;

/**
 *
 * @author dialv
 */
public class EstadoForm implements Serializable{
    private Iterable<Estado> estados ;
    private Estado estado;

    public Iterable<Estado> getEstados() {
        return estados;
    }

    public void setEstados(Iterable<Estado> estados) {
        this.estados = estados;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
}
