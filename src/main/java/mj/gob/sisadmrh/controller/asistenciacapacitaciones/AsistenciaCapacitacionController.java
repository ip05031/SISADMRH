/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.controller.asistenciacapacitaciones;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import mj.gob.sisadmrh.controller.UtilsController;
import mj.gob.sisadmrh.model.AsistenciaCapacitacion;
import mj.gob.sisadmrh.model.Capacitacion;
import mj.gob.sisadmrh.model.Comite;
import mj.gob.sisadmrh.model.Empleado;
import mj.gob.sisadmrh.service.AsistenciaCapacitacionService;
import mj.gob.sisadmrh.service.CapacitacionService;
import mj.gob.sisadmrh.service.ComiteService;
import mj.gob.sisadmrh.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "asistenciacapacitaciones")
public class AsistenciaCapacitacionController extends UtilsController{
    
    
    private AsistenciaCapacitacionService asistenciaCapacitacionService; 
      @Autowired
    public void SetAsistenciaCapacitacionService(AsistenciaCapacitacionService asistenciaCapacitacionService){
    this.asistenciaCapacitacionService=asistenciaCapacitacionService;
    }
    
     private CapacitacionService capacitacionService; 
      @Autowired
    public void SetCapacitacionService(CapacitacionService capacitacionService){
    this.capacitacionService=capacitacionService;
    }
    
     private EmpleadoService empleadoService; 
      @Autowired
    public void SetCapacitacionService(EmpleadoService empleadoService){
    this.empleadoService=empleadoService;
    }
    
 
    private final String PREFIX = "fragments/asistenciacapacitacion/";
    @RequestMapping(value = "/", method=RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("asistenciacapacitaciones", asistenciaCapacitacionService.listAllAsistenciaCapacitacion());
        return PREFIX + "asistenciacapacitaciones";
    }
    
     @RequestMapping("edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("asistenciacapacitacion", asistenciaCapacitacionService.getAsistenciaCapacitacionById(id));
        return PREFIX + "asistenciacapacitacionform";
    }
    
    @RequestMapping("new/asistenciacapacitacion")
    public String newAsistenciaCapacitacion(Model model) {
        //model.addAttribute("asistenciacapacitacion", new AsistenciaCapacitacion());
        AsistenciaCapacitacionForm form = new AsistenciaCapacitacionForm();
        //para jalar el nombre de capacitaciones
        form.setCapacitaciones(capacitacionService.listAllCapacitacion());
        form.setEmpleados(empleadoService.listAllEmpleado());
        //para jalar los nombres de los empleados 
        model.addAttribute("formasistenciacapacitancion", form);
        return PREFIX + "asistenciacapacitacionform";
        
    }
    
    @RequestMapping(value = "asistenciacapacitacion")
    public String saveAsistenciaCapacitacion(AsistenciaCapacitacion asistencia,Model model) {
        try{
         asistenciaCapacitacionService.saveAsistenciaCapacitacion(asistencia);
        model.addAttribute("msg", 0);
         
        }
        catch(Exception e){}
       model.addAttribute("msg", 1);
       return PREFIX + "asistenciacapacitaciones";
       
       // return "redirect:./show/" + asistencia.getCodigoasistenciacapacitacion();
    }
    
   
     @RequestMapping("show/{id}")
    public String showAsistenciaCapacitacion(@PathVariable Integer id, Model model) {
        model.addAttribute("asistenciacapacitacion", asistenciaCapacitacionService.getAsistenciaCapacitacionById(id).get());
        return PREFIX +"asistenciacapacitacionshow";
    }
     @RequestMapping("delete/{id}")
    public String delete(@PathVariable Integer id,Model model) {
        try{
        asistenciaCapacitacionService.deleteAsistenciaCapacitacion(id);
        model.addAttribute("msg", 3);
        }
        catch(Exception e){
         model.addAttribute("msg", 4);
        }
           return "redirect:/asistenciacapacitaciones/";
        //return "redirect:/asistenciacapacitaciones/";
    }
    
    @RequestMapping("llenadocombo/{cemp}")
    public @ResponseBody
        Object[] llenacombo(@PathVariable String cemp, Model model) {
        return asistenciaCapacitacionService.findnamesBycemp(cemp).get(0);
    }
    
    @RequestMapping("report/")
    public String reporte() {
        return PREFIX + "asistenciacapacitacionesreport";
    }
    
    @RequestMapping(value = "pdf/{indice}", method = { RequestMethod.POST, RequestMethod.GET })
    public void pdf(@PathVariable("indice") Long indice, 
            @RequestParam(required = false) Boolean download, 
            @RequestParam(value="fechainicial",required = false) String fechainicio, 
            @RequestParam(value="fechafinal", required = false) String fechafin, 
                HttpServletResponse response) throws Exception {
                Map<String, Object> params = new HashMap<>();
		params.put("CODIGO", indice.toString());
		params.put("FECHAINICIO", fechainicio);
		params.put("FECHAFIN", fechafin);
        	generatePdf("asistenciacapacitaciones", "rpt_asistenciacapacitaciones", params, download,response);
    }
}
