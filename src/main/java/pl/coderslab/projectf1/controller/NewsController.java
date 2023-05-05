package pl.coderslab.projectf1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.projectf1.model.News;
import pl.coderslab.projectf1.repository.NewsRepository;

@RequestMapping("/news-details")
@Controller
@RequiredArgsConstructor
public class NewsController {

    private final NewsRepository newsRepository;

    @RequestMapping("/{id}")
    public String all(@PathVariable long id, Model model){
        model.addAttribute("news", newsRepository.findById(id).get());
        return "news-details/show";
    }
}