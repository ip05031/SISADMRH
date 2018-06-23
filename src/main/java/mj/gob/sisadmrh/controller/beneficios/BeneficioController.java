package mj.gob.sisadmrh.controller.beneficios;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import mj.gob.sisadmrh.controller.UtilsController;
import mj.gob.sisadmrh.model.Beneficio;
import mj.gob.sisadmrh.service.BeneficioService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author dialv
 * 
 */
@Controller
@RequestMapping(value = "beneficios")
public class BeneficioController extends UtilsController{
    
    private BeneficioService beneficioService;
    
    @Autowired
    DataSource dataSource;

    
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
    
    	@RequestMapping(value = "pdf/{nfolio}", method = { RequestMethod.POST, RequestMethod.GET })
	public void pdf(@PathVariable("nfolio") Long cdeclaracion, HttpServletRequest request,
			@RequestParam(required = false) Boolean download, HttpServletResponse response)
			throws ServletException, IOException, ClassNotFoundException, SQLException, JRException, Exception {
            
            Map<String, Object> params = new HashMap<String, Object>();
		params.put("N_FOLIO", cdeclaracion.toString());

		generatePdf("beneficios", "rpt_beneficios", params, dataSource.getConnection(), request, download,
				response);

	}

    
}
