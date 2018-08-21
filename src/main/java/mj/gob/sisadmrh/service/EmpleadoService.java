package mj.gob.sisadmrh.service;

import java.util.Optional;
import mj.gob.sisadmrh.model.Empleado;

/**
 *
 * @author dialv
 */
public interface EmpleadoService {
    Iterable <Empleado> listAllEmpleado();
    
    Optional<Empleado> getEmpleadoById(Integer id);

    Empleado saveEmpleado(Empleado beneficio);

    void deleteEmpleado(Integer id);
}
