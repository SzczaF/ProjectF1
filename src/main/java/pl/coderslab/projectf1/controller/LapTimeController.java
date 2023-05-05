package pl.coderslab.projectf1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.projectf1.repository.LapTimeRepository;

@RequestMapping("/lapTime")
@Controller
@RequiredArgsConstructor
public class LapTimeController {

    private final LapTimeRepository lapTimeRepository;

    @RequestMapping("/all")
    public String all(Model model){
        model.addAttribute("lapTimes", lapTimeRepository.findAll());
        return "/lapTime/list";
    }
}
