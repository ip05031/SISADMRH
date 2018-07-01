/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.controller.comite;

import mj.gob.sisadmrh.model.Comite;
import mj.gob.sisadmrh.service.ComiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author daniel
 */
@Controller
@RequestMapping(value = "comites")
public class ComiteController {
    
    
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
        return PREFIX + "comiteform";
    }
    
    @RequestMapping(value = "comite")
    public String saveComite(Comite comite) {
        comiteService.saveComite(comite);
       
        return "redirect:./show/" + comite.getCodigocomite();
    }
    
    
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
    
}
