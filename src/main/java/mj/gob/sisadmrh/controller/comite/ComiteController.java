/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.controller.comite;

<<<<<<< HEAD
import java.util.HashMap;
import java.util.Map;
import mj.gob.sisadmrh.controller.UtilsController;
import javax.servlet.http.HttpServletResponse;
=======
import javax.validation.Valid;
>>>>>>> origin/master
import mj.gob.sisadmrh.model.Comite;
import mj.gob.sisadmrh.service.ComiteService;
import mj.gob.sisadmrh.service.EmpleadoBeneficioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author daniel
 */
@Controller
@RequestMapping(value = "comites")
public class ComiteController extends UtilsController{
    
    
    private ComiteService comiteService;
     
       @Autowired
    public void setComiteService(ComiteService comiteService) {
        this.comiteService = comiteService;
    }
    
    
  
    private final String PREFIX = "fragments/comite/";
    @RequestMapping(value = "/", method=RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("comites", comiteService.listAllComite());
        return PREFIX + "comites";
    }
    
     @RequestMapping("edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("comite", comiteService.getComiteById(id));
        return PREFIX + "comiteform";
    }
    
    @RequestMapping("new/comite")
    public String newComite(Model model) {
        model.addAttribute("comite", new Comite());
        model.addAttribute("comite", new Comite());
        return PREFIX + "comiteform";
    }
    
    @RequestMapping(value = "comite")
    public String saveComite(Comite comite) {
        comiteService.saveComite(comite);
       
        return "redirect:./show/" + comite.getCodigocomite();
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
    public String showComite(@PathVariable Integer id, Model model) {
        model.addAttribute("comite", comiteService.getComiteById(id).get());
        return PREFIX +"comiteshow";
    }
     @RequestMapping("delete/{id}")
    public String delete(@PathVariable Integer id) {
        comiteService.deleteComite(id);
        return "redirect:/comites/";
    }
    
    @RequestMapping("report/")
    public String reporte() {
        return PREFIX + "comitereport";
    }
    
    @RequestMapping(value = "pdf/{indice}", method = { RequestMethod.POST, RequestMethod.GET })
    public void pdf(@PathVariable("indice") Long indice, 
            @RequestParam(required = false) Boolean download, 
            @RequestParam(value="fechainicio",required = false) String fechainicio, 
            @RequestParam(value="fechafin", required = false) String fechafin, 
                HttpServletResponse response) throws Exception {
                Map<String, Object> params = new HashMap<>();
		params.put("CODIGO", indice.toString());
		params.put("FECAINICIO", fechainicio);
		params.put("FECHAFIN", fechafin);
        	generatePdf("comites", "rpt_comite", params, download,response);
    }
    
}
