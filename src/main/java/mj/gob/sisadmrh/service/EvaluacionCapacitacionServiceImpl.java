/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.service;

import java.util.Optional;
import mj.gob.sisadmrh.model.Capacitacion;
import mj.gob.sisadmrh.model.Evaluacioncapacitacion;
import mj.gob.sisadmrh.repository.EvaluacionCapacitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jorge
 */
@Service
public class EvaluacionCapacitacionServiceImpl  implements EvaluacionCapacitacionService{
    
private EvaluacionCapacitacionRepository evaCapacitacionRep;

@Autowired
public void SetEvaluacionCapacitacionRepository(EvaluacionCapacitacionRepository evaluacionCapacitacionRepository){
this.evaCapacitacionRep=evaluacionCapacitacionRepository;
}
    @Override
    public Iterable<Evaluacioncapacitacion> listAllEvualuacionCapacitacion() {
      return evaCapacitacionRep.findAll();
    }

    @Override
    public Optional<Evaluacioncapacitacion> getEvualuacionCapacitacionById(Integer id) {
      return evaCapacitacionRep.findById(id);
    }

    @Override
    public void deleteEvualuacionCapacitacion(Integer id) {
        evaCapacitacionRep.deleteById(id);
    }

    @Override
    public Iterable<Capacitacion> findByCapacitacion(String dato) {
     return evaCapacitacionRep.findByCapacitacion(dato);
    }

    @Override
    public Evaluacioncapacitacion saveEvualuacionCapacitacion(Evaluacioncapacitacion evualuacionCapacitacion) {
        return evaCapacitacionRep.save(evualuacionCapacitacion);   
    }

  

 
    
}
