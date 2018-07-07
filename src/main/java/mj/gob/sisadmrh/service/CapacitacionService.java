/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.service;

import java.util.Optional;
import mj.gob.sisadmrh.model.Capacitacion;



public interface CapacitacionService {
 
              Iterable<Capacitacion> listAllCapacitacion();

    Optional<Capacitacion> getCapacitacionById(Integer id);

    Capacitacion saveCapacitacion(Capacitacion capacitacion);

    void deleteCapacitacion(Integer id);
}
