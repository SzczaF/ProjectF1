package pl.coderslab.projectf1.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.projectf1.repository.NewsRepository;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final NewsRepository newsRepository;

    @RequestMapping("/")
    //@ResponseBody
    public String home(Model model) {
        model.addAttribute("newsList", newsRepository.findAll());
        return "index";
    }

//    @GetMapping("/hello")
//    public String hello(Model model) {
//        model.addAttribute(new Person("Marek"));
//        return "hello";
//    }
}