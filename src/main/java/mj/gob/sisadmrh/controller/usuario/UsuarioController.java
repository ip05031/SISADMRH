package mj.gob.sisadmrh.controller.usuario;

import mj.gob.sisadmrh.repository.UsuarioRepository;
import mj.gob.sisadmrh.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author dialv
 * 
 */
@Controller
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    private final String PREFIX = "fragments/usuario/";
    @RequestMapping(value = "/usuarios", method=RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("usuarios", usuarioService.listAllUsuarios());
        return PREFIX + "usuarios";
    }
}
