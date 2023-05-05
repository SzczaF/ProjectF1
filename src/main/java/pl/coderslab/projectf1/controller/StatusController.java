package pl.coderslab.projectf1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.projectf1.repository.StatusRepository;

@RequestMapping("/status")
@Controller
@RequiredArgsConstructor
public class StatusController {

    private final StatusRepository statusRepository;

    @RequestMapping("/all")
    public String all(Model model){
        model.addAttribute("statuses", statusRepository.findAll());
        return "/status/list";
    }
}
