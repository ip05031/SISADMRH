/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.service;

import java.util.Optional;
import mj.gob.sisadmrh.model.Mision;

import mj.gob.sisadmrh.repository.MisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jorge
 */
@Service
public class MisionServiceImpl  implements MisionService{
    
    private MisionRepository misionRep;
    @Autowired
    public void setMisionRepository(MisionRepository misionRepository) {
        this.misionRep = misionRepository;
    }

    @Override
    public Iterable<Mision> listAllMision() {
        return misionRep.findAll();
      
    }

    @Override
    public Optional<Mision> getMisionById(Integer id) {
        return misionRep.findById(id);
      
    }

    @Override
    public Mision saveMision(Mision mision) {
        return misionRep.save(mision);
      
    }

    @Override
    public void deleteMision(Integer id) {
        misionRep.deleteById(id);
     
    }
    
}
