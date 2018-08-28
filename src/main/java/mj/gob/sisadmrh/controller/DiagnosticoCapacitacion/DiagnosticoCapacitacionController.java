/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.controller.DiagnosticoCapacitacion;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import mj.gob.sisadmrh.controller.UtilsController;
import mj.gob.sisadmrh.model.Comite;
import mj.gob.sisadmrh.model.DiagnosticoCapacitacion;
import mj.gob.sisadmrh.model.Empleado;

import mj.gob.sisadmrh.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import mj.gob.sisadmrh.service.DiagnosticoCapacitacionService;

/**
 *
 * @author jorge
 */
@Controller
@RequestMapping(value = "diagnosticos")
public class DiagnosticoCapacitacionController extends UtilsController{
 private DiagnosticoCapacitacionService diagnosticoCapacitacionService;  
 
// private EmpleadoService empleadoService; 

 @Autowired
    public void setDiagnosticoCapacitacionService(DiagnosticoCapacitacionService diagnosticoCapacitacionService) {
        this.diagnosticoCapacitacionService = diagnosticoCapacitacionService;
    } 
    
    private final String PREFIX = "fragments/diagnostico/";
    @RequestMapping(value = "/", method=RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("diagnosticos", diagnosticoCapacitacionService.listAllDiagnosticoCapacitacion());
        return PREFIX + "diagnosticos";
    }
    
    @RequestMapping("edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("diagnostico", diagnosticoCapacitacionService.getDiagnosticoCapacitacionById(id));
        return PREFIX + "diagnosticoform";
    }
     @RequestMapping("new/diagnostico")
    public String newDiagnosticoCapacitacion(Model model) {
      model.addAttribute("diagnostico", new DiagnosticoCapacitacion());
//        Iterable<Empleado> empleados = empleadoService.listAllEmpleado();
//        model.addAttribute("empleados", empleados);
       return PREFIX + "diagnosticoform";
    }
    
     @RequestMapping(value = "diagnostico")
    public String saveDiagnosticoCapacitacion(DiagnosticoCapacitacion diagnosticoCapacitacion, Model model) {
        try{
         diagnosticoCapacitacionService.saveDiagnosticoCapacitacion(diagnosticoCapacitacion);
         model.addAttribute("msg", 0);
        }
        catch(Exception e)
        {
        model.addAttribute("msg", 0);
        }
      
        return PREFIX + "diagnosticoform";
        //return "redirect:./show/" + comite.getCodigocomite();
    }
    
//      @RequestMapping(value = "comite",method=RequestMethod.POST)
//    public String saveComite(@Valid @ModelAttribute(name = "comite") Comite comite) {
//        comiteService.saveComite(comite);
//       
//        return "redirect:./show/" + comite.getCodigocomite();
//    }
//    
//    
     @RequestMapping("show/{id}")
    public String showDiagnosticoCapacitacion(@PathVariable Integer id, Model model) {
        model.addAttribute("diagnostico",diagnosticoCapacitacionService.getDiagnosticoCapacitacionById(id));
        return PREFIX +"diagnosticoshow";
    }
     @RequestMapping("delete/{id}")
    public String delete(@PathVariable Integer id, Model model) {
         try{
          diagnosticoCapacitacionService.deleteDiagnosticoCapacitacion(id);
        model.addAttribute("msg", 3);
        }
        catch(Exception e){
        model.addAttribute("msg", 4);
        }
        return PREFIX + "diagnosticos";
     
       // return "redirect:/comites/";
    }
    
    @RequestMapping("report/")
    public String reporte(Model model) {
        model.addAttribute("diganosticos", diagnosticoCapacitacionService.listAllDiagnosticoCapacitacion());
        return PREFIX + "diagnosticoreport";
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
        	generatePdf("diagnosticos", "rpt_diagnosticos", params, download,response);
    }
}
