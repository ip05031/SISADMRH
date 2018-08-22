/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.service;

import java.util.Optional;

import mj.gob.sisadmrh.model.Mision;

/**
 *
 * @author jorge
 */
public interface MisionService {
     Iterable <Mision> listAllMision();
    
    Optional<Mision> getMisionById(Integer id);

   Mision saveMision(Mision mision);

    void deleteMision(Integer id);
    
}
