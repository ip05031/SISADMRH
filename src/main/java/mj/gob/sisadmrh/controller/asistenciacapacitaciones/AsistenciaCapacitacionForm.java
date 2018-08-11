package mj.gob.sisadmrh.controller.asistenciacapacitaciones;

import java.io.Serializable;
import mj.gob.sisadmrh.model.AsistenciaCapacitacion;
import mj.gob.sisadmrh.model.Capacitacion;
import mj.gob.sisadmrh.model.Empleado;

/**
 *
 * @author root
 */
public class AsistenciaCapacitacionForm implements Serializable {
    private Iterable<Capacitacion> capacitaciones ;
    private Iterable<Empleado> empleados ;
    private AsistenciaCapacitacion asistenciaCapacitacion;
    private Object[] complement;
    
    
    public Iterable<Capacitacion> getCapacitaciones() {
        return capacitaciones;
    }

    public void setCapacitaciones(Iterable<Capacitacion> capacitaciones) {
        this.capacitaciones = capacitaciones;
    }

    public Iterable<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Iterable<Empleado> empleados) {
        this.empleados = empleados;
    }

    public AsistenciaCapacitacion getAsistenciaCapacitacion() {
        return asistenciaCapacitacion;
    }

    public void setAsistenciaCapacitacion(AsistenciaCapacitacion asistenciaCapacitacion) {
        this.asistenciaCapacitacion = asistenciaCapacitacion;
    }

    public Object[] getComplement() {
        return complement;
    }

    public void setComplement(Object[] complement) {
        this.complement = complement;
    }
    
    
}
