package pl.coderslab.projectf1.controller.form;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.projectf1.model.Constructor;
import pl.coderslab.projectf1.model.ConstructorResult;
import pl.coderslab.projectf1.model.Race;
import pl.coderslab.projectf1.repository.ConstructorRepository;
import pl.coderslab.projectf1.repository.ConstructorResultRepository;
import pl.coderslab.projectf1.repository.RaceRepository;

import java.util.List;

@Controller
@RequestMapping("/constructorResult/form")
@RequiredArgsConstructor
public class ConstructorResultsFormController {

    private final ConstructorResultRepository constructorResultRepository;
    private final ConstructorRepository constructorRepository;
    private final RaceRepository raceRepository;
    //    private static final Logger logger = LoggerFactory.getLogger(ConstructorResultFormController.class);
    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("constructorResults", new ConstructorResult());
//        model.asMap().forEach((k, v) -> logger.debug(k + ": " + v));
        return "/constructorResult/form";
    }

    @PostMapping("/add")
    public String addSave(@Valid ConstructorResult constructorResults, BindingResult result) {
        if (result.hasErrors()) {
            return "constructorResult/form";
        }
        constructorResultRepository.save(constructorResults);
        return "redirect:/constructorResult/all";
    }

    @ModelAttribute("constructorList")
    public List<Constructor> getConstructors() {
        return constructorRepository.findAll();
    }
    @ModelAttribute("raceList")
    public List<Race> getRaces() {
        return raceRepository.findAll();
    }

}
