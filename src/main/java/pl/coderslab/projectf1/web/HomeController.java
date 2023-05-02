package pl.coderslab.projectf1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    //@ResponseBody
    public String home() {
        return "index";
    }

//    @GetMapping("/hello")
//    public String hello(Model model) {
//        model.addAttribute(new Person("Marek"));
//        return "hello";
//    }
}