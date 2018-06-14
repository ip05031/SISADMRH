package mj.gob.sisadmrh.controller.usuario;

import mj.gob.sisadmrh.model.Usuario;
import mj.gob.sisadmrh.repository.UsuarioRepository;
import mj.gob.sisadmrh.service.UsuarioService;
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
@RequestMapping(value = "usuarios")
public class UsuarioController {
    
    private UsuarioService usuarioService;
    
    @Autowired
    public void setUsuarioService(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    
    private final String PREFIX = "fragments/usuario/";
    @RequestMapping(value = "/", method=RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("usuarios", usuarioService.listAllUsuarios());
        return PREFIX + "usuarios";
    }
    
    @RequestMapping("edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("usuario", usuarioService.getUsuarioById(id));
        return PREFIX + "usuarioform";
    }

    @RequestMapping("new/usuario")
    public String newUsuario(Model model) {
        model.addAttribute("usuario", new Usuario());
        return PREFIX + "usuarioform";
    }

    @RequestMapping(value = "usuario")
    public String saveUsuario(Usuario usuario) {
        usuarioService.saveUsuario(usuario);
        return "redirect:./show/" + usuario.getCodigousuario();
    }
    
    @RequestMapping("show/{id}")
    public String showUsuario(@PathVariable Integer id, Model model) {
        model.addAttribute("usuario", usuarioService.getUsuarioById(id).get());
        return PREFIX +"usuarioshow";
    }

    @RequestMapping("delete/{id}")
    public String delete(@PathVariable Integer id) {
        usuarioService.deleteUsuario(id);
        return "redirect:/usuarios/";
    }
}
