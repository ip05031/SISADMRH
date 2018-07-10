/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.repository;

import mj.gob.sisadmrh.model.Capacitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author daniel
 */
public interface CapacitacionRepository extends CrudRepository<Capacitacion, Integer>{
    
    
    @Query(value = "SELECT c.* FROM capacitacion c "
            + "WHERE c.nombrecapacitacion LIKE :nom ", nativeQuery = true)

    Iterable<Capacitacion> findByDato(@Param("nom") String dato);
    
}
