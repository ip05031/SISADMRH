/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.service;

import java.util.Optional;
import mj.gob.sisadmrh.model.AsistenciaCapacitacion;
import mj.gob.sisadmrh.model.Capacitacion;

import mj.gob.sisadmrh.model.Evaluacioncapacitacion;

/**
 *
 * @author jorge
 */
public interface EvaluacionCapacitacionService {
     Iterable <Evaluacioncapacitacion> listAllEvualuacionCapacitacion();
    
    Optional<Evaluacioncapacitacion> getEvualuacionCapacitacionById(Integer id);

    Evaluacioncapacitacion saveEvualuacionCapacitacion(Evaluacioncapacitacion evualuacionCapacitacion);

    void deleteEvualuacionCapacitacion(Integer id);
  
    Iterable<Capacitacion> findByCapacitacion(String dato);
    
}
