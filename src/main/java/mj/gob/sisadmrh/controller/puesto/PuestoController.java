package mj.gob.sisadmrh.controller.puesto;

import mj.gob.sisadmrh.model.Puesto;
import mj.gob.sisadmrh.repository.PuestoRepository;
import mj.gob.sisadmrh.service.PuestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author dialv
 * 
 */
@Controller
@RequestMapping(value = "puestos")
public class PuestoController {
    
    private PuestoService puestoService;
    
    @Autowired
    public void setPuestoService(PuestoService puestoService) {
        this.puestoService = puestoService;
    }
    
    private final String PREFIX = "fragments/puesto/";
    @RequestMapping(value = "/", method=RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("puestos", puestoService.listAllPuestos());
        return PREFIX + "puestos";
    }
    
    @RequestMapping("edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("puesto", puestoService.getPuestoById(id));
        return PREFIX + "puestoform";
    }

    @RequestMapping("new/puesto")
    public String newPuesto(Model model) {
        model.addAttribute("puesto", new Puesto());
        return PREFIX + "puestoform";
    }

    @RequestMapping(value = "puesto")
    public String savePuesto(Puesto puesto) {
        puestoService.savePuesto(puesto);
        return "redirect:./show/" + puesto.getCodigopuesto();
    }
    
    @RequestMapping("show/{id}")
    public String showPuesto(@PathVariable Integer id, Model model) {
        model.addAttribute("puesto", puestoService.getPuestoById(id).get());
        return PREFIX +"puestoshow";
    }

    @RequestMapping("delete/{id}")
    public String delete(@PathVariable Integer id) {
        puestoService.deletePuesto(id);
        return "redirect:/puestos/";
    }
    
    @RequestMapping("reporte/puesto")
    public String newReportePuesto(Model model) {
        model.addAttribute("puesto", new Puesto());
        return PREFIX + "puestoreporte";
    }
}
