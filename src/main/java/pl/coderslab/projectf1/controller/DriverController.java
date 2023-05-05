package pl.coderslab.projectf1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.projectf1.repository.DriverRepository;

@RequestMapping("/driver")
@Controller
@RequiredArgsConstructor
public class DriverController {

    private final DriverRepository driverRepository;

    @RequestMapping("/all")
    public String all(Model model){
        model.addAttribute("drivers", driverRepository.findAll());
        return "/driver/list";
    }
}
