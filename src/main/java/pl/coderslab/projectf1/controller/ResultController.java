package pl.coderslab.projectf1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.projectf1.repository.ResultRepository;

@RequestMapping("/result")
@Controller
@RequiredArgsConstructor
public class ResultController {

    private final ResultRepository resultRepository;

    @RequestMapping("/all")
    public String all(Model model){
        model.addAttribute("results", resultRepository.findAll());
        return "/result/list";
    }
}
