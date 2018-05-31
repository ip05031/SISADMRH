package mj.gob.sisadmrh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author dialv
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {

        return "index";
    }

}
