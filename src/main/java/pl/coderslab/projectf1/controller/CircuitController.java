package pl.coderslab.projectf1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.projectf1.repository.CircuitRepository;

@RequestMapping("/circuit")
@Controller
@RequiredArgsConstructor
public class CircuitController {

    private final CircuitRepository circuitRepository;

    @RequestMapping("/all")
    public String all(Model model){
        model.addAttribute("circuits", circuitRepository.findAll());
        return "/circuit/list";
    }
}
