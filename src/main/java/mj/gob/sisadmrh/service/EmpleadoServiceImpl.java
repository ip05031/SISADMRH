package mj.gob.sisadmrh.service;

import java.util.Optional;
import mj.gob.sisadmrh.model.Empleado;
import mj.gob.sisadmrh.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dialv
 */
@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    
    private EmpleadoRepository empleadoRep;

    @Autowired
    public void setEmpleadoRepository(EmpleadoRepository empleadoRepository) {
        this.empleadoRep = empleadoRepository;
    }

    @Override
    public Iterable<Empleado> listAllEmpleados() {
        return empleadoRep.findAll();
    }

    @Override
    public Optional<Empleado> getEmpleadoById(Integer id) {
        return empleadoRep.findById(id);
    }

    @Override
    public Empleado saveEmpleado(Empleado empleado) {
        return empleadoRep.save(empleado);
    }

    @Override
    public void deleteEmpleado(Integer id) {
        empleadoRep.deleteById(id);
    }

}
