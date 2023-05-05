package pl.coderslab.projectf1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.projectf1.repository.SeasonRepository;

@RequestMapping("/season")
@Controller
@RequiredArgsConstructor
public class SeasonController {

    private final SeasonRepository seasonRepository;

    @RequestMapping("/all")
    public String all(Model model){
        model.addAttribute("seasons", seasonRepository.findAll());
        return "/season/list";
    }
}
