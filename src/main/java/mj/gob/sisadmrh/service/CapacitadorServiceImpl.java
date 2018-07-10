/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.service;

import java.util.Optional;
import mj.gob.sisadmrh.model.Capacitador;
import mj.gob.sisadmrh.repository.CapacitadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author daniel
 */
@Service
public class CapacitadorServiceImpl implements CapacitadorService{
    private CapacitadorRepository capacitadorRep;
    @Autowired
    public void SetEstadoRepositorio(CapacitadorRepository capacitadorRepository){
    this.capacitadorRep=capacitadorRepository;
    }

    @Override
    public Iterable<Capacitador> listAllCapacitador() {
        return capacitadorRep.findAll();
      
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Capacitador> getCapacitadorById(Integer id) {
      return capacitadorRep.findById(id);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Capacitador saveCapacaitador(Capacitador capacitador) {
return capacitadorRep.save(capacitador);
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCapacitador(Integer id) {
      capacitadorRep.deleteById(id);
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
