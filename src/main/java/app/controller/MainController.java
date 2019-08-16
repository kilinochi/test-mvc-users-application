package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public final class MainController {
    @RequestMapping("/")
    public String index (){
        return "index";
    }
}
