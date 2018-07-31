/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.controller.nivelescolaridad;

import mj.gob.sisadmrh.model.NivelEscolaridad;

import mj.gob.sisadmrh.service.NivelEscolaridadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//beneficio=nivelescolaridad y beneficios=nivelescolaridades
@Controller
@RequestMapping(value = "nivelescolaridades")
public class NivelEscolaridadController {
    
    
    private NivelEscolaridadService nivelEscolaridadService;
     
       @Autowired
    public void setNivelEscolaridadService(NivelEscolaridadService nivelEscolaridadService) {
        this.nivelEscolaridadService = nivelEscolaridadService;
    }
    
    
    private final String PREFIX = "fragments/nivelescolaridad/";
    @RequestMapping(value = "/", method=RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("nivelescolaridades", nivelEscolaridadService.listAllNivelEscolaridad());
        return PREFIX + "nivelescolaridades";
    }
    
     @RequestMapping("edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("nivelescolaridad", nivelEscolaridadService.getNivelEscolaridadById(id));
        return PREFIX + "nivelescolaridadform";
    }
    
    @RequestMapping("new/nivelescolaridad")
    public String newNivelEscolaridad(Model model) {
        model.addAttribute("nivelescolaridad", new NivelEscolaridad());
        return PREFIX + "nivelescolaridadform";
    }
    
    @RequestMapping(value = "nivelescolaridad")
    public String saveNivelEscolaridad(NivelEscolaridad nivelEscolaridad,Model model) {
        try{
         nivelEscolaridadService.saveNivelEscolaridad(nivelEscolaridad);
          model.addAttribute("msg", 0);
        } catch(Exception e){
             model.addAttribute("msg", 1);
        }
        
       return "redirect:/nivelescolaridades/"; 
       // return PREFIX + "nivelescolaridades";
        //return "redirect:./show/" + nivelEscolaridad.getCodigonivelnivelescolaridad();
    }
    
    
     @RequestMapping("show/{id}")
    public String showNivelEscolaridad(@PathVariable Integer id, Model model) {
        model.addAttribute("nivelescolaridad", nivelEscolaridadService.getNivelEscolaridadById(id).get());
        return PREFIX +"nivelescolaridadshow";
    }
     @RequestMapping("delete/{id}")
    public String delete(@PathVariable Integer id, Model model) {
        try{
         nivelEscolaridadService.deleteNivelEscolaridad(id);
          model.addAttribute("msg", 3);
        }
        catch(Exception e){
         model.addAttribute("msg", 4);
        }
     
        return "redirect:/nivelescolaridades/";
    }
}
