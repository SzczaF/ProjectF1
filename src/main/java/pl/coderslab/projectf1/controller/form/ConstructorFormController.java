package pl.coderslab.projectf1.controller.form;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.projectf1.model.Constructor;
import pl.coderslab.projectf1.repository.ConstructorRepository;

@Controller
@RequestMapping("/constructor/form")
@RequiredArgsConstructor
public class ConstructorFormController {

    private final ConstructorRepository constructorRepository;
    //    private static final Logger logger = LoggerFactory.getLogger(ConstructorFormController.class);
    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("constructor", new Constructor());
//        model.asMap().forEach((k, v) -> logger.debug(k + ": " + v));
        return "/constructor/form";
    }

    @PostMapping("/add")
    public String addSave(@Valid Constructor constructor, BindingResult result) {
        if (result.hasErrors()) {
            return "constructor/form";
        }
        constructorRepository.save(constructor);
        return "redirect:/constructor/all";
    }
}
