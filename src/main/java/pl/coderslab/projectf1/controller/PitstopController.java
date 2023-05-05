package pl.coderslab.projectf1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.projectf1.repository.PitstopRepository;

@RequestMapping("/pitstop")
@Controller
@RequiredArgsConstructor
public class PitstopController {

    private final PitstopRepository pitstopRepository;

    @RequestMapping("/all")
    public String all(Model model){
        model.addAttribute("pitstops", pitstopRepository.findAll());
        return "/pitstop/list";
    }
}
