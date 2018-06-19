package mj.gob.sisadmrh.controller.beneficios;

import mj.gob.sisadmrh.model.Beneficio;
import mj.gob.sisadmrh.service.BeneficioService;
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
@RequestMapping(value = "beneficios")
public class BeneficioControler {
    
    private BeneficioService beneficioService;
    
    @Autowired
    public void setBeneficioService(BeneficioService beneficioService) {
        this.beneficioService = beneficioService;
    }
    
    private final String PREFIX = "fragments/beneficio/";
    @RequestMapping(value = "/", method=RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("beneficios", beneficioService.listAllBeneficios());
        return PREFIX + "beneficios";
    }
    
    @RequestMapping("edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("beneficio", beneficioService.getBeneficioById(id));
        return PREFIX + "beneficioform";
    }

    @RequestMapping("new/beneficio")
    public String newBeneficio(Model model) {
        model.addAttribute("beneficio", new Beneficio());
        return PREFIX + "beneficioform";
    }

    @RequestMapping(value = "beneficio")
    public String saveBeneficio(Beneficio beneficio) {
        beneficioService.saveBeneficio(beneficio);
        return "redirect:./show/" + beneficio.getCodigobeneficio();
    }
    
    @RequestMapping("show/{id}")
    public String showBeneficio(@PathVariable Integer id, Model model) {
        model.addAttribute("beneficio", beneficioService.getBeneficioById(id).get());
        return PREFIX +"beneficioshow";
    }

    @RequestMapping("delete/{id}")
    public String delete(@PathVariable Integer id) {
        beneficioService.deleteBeneficio(id);
        return "redirect:/beneficios/";
    }
}
