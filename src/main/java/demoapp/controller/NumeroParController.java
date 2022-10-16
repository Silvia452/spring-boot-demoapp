package demoapp.controller;

import demoapp.service.NumeroParService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class NumeroParController {

    @Autowired
    private NumeroParService service;


    @GetMapping("/esPar")
    public String saludoForm(NumeroEsPar numeroEsPar) {
        return "formGetNum";
    }

    @PostMapping("/esPar")
    public String esPar(@ModelAttribute @Valid NumeroEsPar numero, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "formGetNum";
        }
        else {
            model.addAttribute("numero", numero.getNumero());
            model.addAttribute("esPar", service.esPar(numero.getNumero()));
            return "esParResult";
        }
    }
}
