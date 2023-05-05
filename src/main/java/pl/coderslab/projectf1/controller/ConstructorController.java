package pl.coderslab.projectf1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.projectf1.repository.ConstructorRepository;

@RequestMapping("/constructor")
@Controller
@RequiredArgsConstructor
public class ConstructorController {

    private final ConstructorRepository constructorRepository;

    @RequestMapping("/all")
    public String all(Model model){
        model.addAttribute("constructors", constructorRepository.findAll());
        return "/constructor/list";
    }
}
