package pl.coderslab.projectf1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.projectf1.repository.ConstructorResultRepository;

@RequestMapping("/constructorResult")
@Controller
@RequiredArgsConstructor
public class ConstructorResultController {

    private final ConstructorResultRepository constructorResultRepository;

    @RequestMapping("/all")
    public String all(Model model){
        model.addAttribute("constructorResults", constructorResultRepository.findFirst10ByOrderById());
        return "/constructorResult/list";
    }
}
