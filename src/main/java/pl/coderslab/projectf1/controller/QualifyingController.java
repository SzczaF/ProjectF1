package pl.coderslab.projectf1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.projectf1.repository.QualifyingRepository;

@RequestMapping("/qualifying")
@Controller
@RequiredArgsConstructor
public class QualifyingController {

    private final QualifyingRepository qualifyingRepository;

    @RequestMapping("/all")
    public String all(Model model){
        model.addAttribute("qualifyings", qualifyingRepository.findAll());
        return "/qualifying/list";
    }
}
