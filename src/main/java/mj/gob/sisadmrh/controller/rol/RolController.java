package mj.gob.sisadmrh.controller.rol;

import mj.gob.sisadmrh.model.Rol;
import mj.gob.sisadmrh.repository.RolRepository;
import mj.gob.sisadmrh.service.RolService;
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
@RequestMapping(value = "roles")
public class RolController {
    
    private RolService rolService;
    
    @Autowired
    public void setRolService(RolService rolService) {
        this.rolService = rolService;
    }
    
    private final String PREFIX = "fragments/rol/";
    @RequestMapping(value = "/", method=RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("roles", rolService.listAllRoles());
        return PREFIX + "roles";
    }
    
    @RequestMapping("edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("rol", rolService.getRolById(id));
        return PREFIX + "rolform";
    }

    @RequestMapping("new")
    public String newRol(Model model) {
        model.addAttribute("rol", new Rol());
        return PREFIX + "rolform";
    }

    @RequestMapping(value = "rol")
    public String saveRol(Rol rol) {
        rolService.saveRol(rol);
        return "redirect:./show/" + rol.getCodigorol();
    }
    
    @RequestMapping("show/{id}")
    public String showRol(@PathVariable Integer id, Model model) {
        model.addAttribute("rol", rolService.getRolById(id).get());
        return PREFIX +"rolshow";
    }

    @RequestMapping("delete/{id}")
    public String delete(@PathVariable Integer id) {
        rolService.deleteRol(id);
        return "redirect:/roles/";
    }
}
