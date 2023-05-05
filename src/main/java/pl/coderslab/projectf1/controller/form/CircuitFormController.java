package pl.coderslab.projectf1.controller.form;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.projectf1.model.Circuit;
import pl.coderslab.projectf1.repository.CircuitRepository;

import jakarta.validation.Valid;


@Controller
@RequestMapping("/circuit/form")
@RequiredArgsConstructor

public class CircuitFormController {

    private final CircuitRepository circuitRepository;
//    private static final Logger logger = LoggerFactory.getLogger(CircuitFormController.class);
    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("circuit", new Circuit());
//        model.asMap().forEach((k, v) -> logger.debug(k + ": " + v));
        return "/circuit/form";
    }

    @PostMapping("/add")
    public String addSave(@Valid Circuit circuit, BindingResult result) {
        if (result.hasErrors()) {
            return "circuit/form";
        }
        circuitRepository.save(circuit);
        return "redirect:/circuit/all";
    }
}

