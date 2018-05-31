package mj.gob.sisadmrh.controller;

import mj.gob.sisadmrh.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author dialv
 * 
 */
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRep;
    
    @RequestMapping(value="/usuarios", method=RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("usuarios", usuarioRep.findAll());
        return "usuarios";
    }
}
