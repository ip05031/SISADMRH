/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.service;

import java.util.Optional;
import mj.gob.sisadmrh.model.AsistenciaCapacitacion;
import mj.gob.sisadmrh.repository.AsistenciaCapacitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsistenciaCapacitacionImpl implements AsistenciaCapacitacionService{
private AsistenciaCapacitacionRepository asistenciaCapacitacionRep;
@Autowired
public void SetAsistenciaCapacitacionRepository(AsistenciaCapacitacionRepository asistenciaCapacitacionRepository){
this.asistenciaCapacitacionRep=asistenciaCapacitacionRepository;
}
    @Override
    public Iterable<AsistenciaCapacitacion> listAllAsistenciaCapacitacion() {
      return asistenciaCapacitacionRep.findAll();
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<AsistenciaCapacitacion> getAsistenciaCapacitacionById(Integer id) {
    
return asistenciaCapacitacionRep.findById(id);
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AsistenciaCapacitacion saveAsistenciaCapacitacion(AsistenciaCapacitacion asistenciaCapacitacion) {
      return asistenciaCapacitacionRep.save(asistenciaCapacitacion);
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAsistenciaCapacitacion(Integer id) {
     asistenciaCapacitacionRep.deleteById(id);
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
