package mado.id.ecampus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mado.id.ecampus.repo.Servizirepo;

@Controller
@RequestMapping("/")
public class homeController {

    @Autowired
    private Servizirepo servizirepo;

    @GetMapping
    public String home(Model model) {
        model.addAttribute("servizi", servizirepo.findAll());
        return "homepage";
    }

}
