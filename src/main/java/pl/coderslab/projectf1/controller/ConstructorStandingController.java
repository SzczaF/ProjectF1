package pl.coderslab.projectf1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.projectf1.repository.ConstructorStandingRepository;

@RequestMapping("/constructorStanding")
@Controller
@RequiredArgsConstructor
public class ConstructorStandingController {

    private final ConstructorStandingRepository ConstructorResultRepository;

    @RequestMapping("/all")
    public String all(Model model){
        model.addAttribute("constructorStanding", ConstructorResultRepository.findAll());
        return "/constructorStanding/list";
    }
}
