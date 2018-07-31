/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.repository;

import mj.gob.sisadmrh.model.Capacitador;
import mj.gob.sisadmrh.model.Comite;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author daniel
 */
public interface ComiteRepository extends CrudRepository<Comite, Integer>{
       @Query(value = "SELECT c.* FROM comite c WHERE c.nombreempleado LIKE :nom ", nativeQuery = true)
    Iterable<Comite> findByDato(@Param("nom") String dato);
    
}
