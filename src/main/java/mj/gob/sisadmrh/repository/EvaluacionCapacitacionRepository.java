/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.repository;

import mj.gob.sisadmrh.model.Capacitacion;
import mj.gob.sisadmrh.model.CostoCapacitacion;
import mj.gob.sisadmrh.model.Evaluacioncapacitacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author jorge
 */
public interface EvaluacionCapacitacionRepository extends CrudRepository<Evaluacioncapacitacion, Integer>{
   @Query(value = "SELECT ec.* FROM EvualuacionCapacitacion ec WHERE ec.nombrecapacitacion LIKE :nom ", nativeQuery = true)
    Iterable<Capacitacion> findByCapacitacion(@Param("nom") String dato);  
}
