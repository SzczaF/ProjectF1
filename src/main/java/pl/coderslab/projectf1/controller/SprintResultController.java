package pl.coderslab.projectf1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.projectf1.repository.SprintResultRepository;

@RequestMapping("/sprintResult")
@Controller
@RequiredArgsConstructor
public class SprintResultController {

    private final SprintResultRepository sprintResultRepository;

    @RequestMapping("/all")
    public String all(Model model){
        model.addAttribute("sprintResults", sprintResultRepository.findAll());
        return "/sprintResult/list";
    }
}
