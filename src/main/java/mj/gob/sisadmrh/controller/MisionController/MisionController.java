/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.controller.MisionController;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import mj.gob.sisadmrh.controller.UtilsController;
import mj.gob.sisadmrh.model.Comite;
import mj.gob.sisadmrh.model.Empleado;
import mj.gob.sisadmrh.model.Mision;
import mj.gob.sisadmrh.service.EmpleadoService;
import mj.gob.sisadmrh.service.MisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author jorge
 */
@Controller
@RequestMapping(value = "misiones")
public class MisionController extends UtilsController{
 private MisionService misionService;  
 
 private EmpleadoService empleadoService; 

 @Autowired
    public void setMisionService(MisionService misionService) {
        this.misionService = misionService;
    } 
    
    private final String PREFIX = "fragments/mision/";
    @RequestMapping(value = "/", method=RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("misiones", misionService.listAllMision());
        return PREFIX + "misiones";
    }
    
    @RequestMapping("edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("mision", misionService.getMisionById(id));
        return PREFIX + "misionform";
    }
     @RequestMapping("new/mision")
    public String newMision(Model model) {
        model.addAttribute("mision", new Mision());
        Iterable<Empleado> empleados = empleadoService.listAllEmpleado();
        model.addAttribute("empleados", empleados);
       return PREFIX + "misionform";
    }
    
     @RequestMapping(value = "mision")
    public String saveMision(Mision mision, Model model) {
        try{
         misionService.saveMision(mision);
         model.addAttribute("msg", 0);
        }
        catch(Exception e)
        {
        model.addAttribute("msg", 0);
        }
      
        return PREFIX + "misionform";
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
    public String showMision(@PathVariable Integer id, Model model) {
        model.addAttribute("mision", misionService.getMisionById(id).get());
        return PREFIX +"misionshow";
    }
     @RequestMapping("delete/{id}")
    public String delete(@PathVariable Integer id, Model model) {
         try{
           misionService.deleteMision(id);;
        model.addAttribute("msg", 3);
        }
        catch(Exception e){
        model.addAttribute("msg", 4);
        }
        return PREFIX + "misiones";
     
       // return "redirect:/comites/";
    }
    
    @RequestMapping("report/")
    public String reporte(Model model) {
        model.addAttribute("misiones", misionService.listAllMision());
        return PREFIX + "misionesreport";
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
        	generatePdf("misiones", "rpt_misiones", params, download,response);
    }
}
