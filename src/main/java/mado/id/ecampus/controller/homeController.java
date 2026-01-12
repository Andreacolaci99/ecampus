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
        model.addAttribute("pageTitle", "MADO • Polo e-Campus");
        return "homepage";
    }

    @GetMapping("/chisiamo")
    public String chiSiamo(Model model) {
        model.addAttribute("pageTitle", "Chi siamo • MADO");
        return "chisiamo";
    }

    @GetMapping("/contatti")
    public String contatti(Model model) {
        model.addAttribute("pageTitle", "Contatti • MADO");
        return "contatti";
    }

    @GetMapping("/corsi")
    public String corsi(Model model) {
        model.addAttribute("servizi", servizirepo.findAll());
        model.addAttribute("pageTitle", "Corsi • MADO");
        return "corsi";
    }

    @GetMapping("/lingue")
    public String certificazioniLingue() {
        return "subpages/cert-lingue";
    }

    @GetMapping("/eipass")
    public String eipass() {
        return "subpages/eipass";
    }

    @GetMapping("/ecampus")
    public String ecampus() {
        return "subpages/ecampus";
    }

     @GetMapping("/link")
    public String link() {
        return "subpages/link";
    }
}
