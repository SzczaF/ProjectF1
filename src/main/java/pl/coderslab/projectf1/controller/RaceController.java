package pl.coderslab.projectf1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.projectf1.repository.RaceRepository;

@RequestMapping("/race")
@Controller
@RequiredArgsConstructor
public class RaceController {

    private final RaceRepository raceRepository;

    @RequestMapping("/all")
    public String all(Model model){
        model.addAttribute("races", raceRepository.findAll());
        return "/race/list";
    }
}
