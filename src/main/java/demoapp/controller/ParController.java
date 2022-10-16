package demoapp.controller;

import demoapp.service.ParService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


@Controller
public class ParController {

    @Autowired
    private ParService service;

    @PostMapping("/esPar")
    public String esPar(@ModelAttribute @Valid BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "formGetNum";
        }

        else {
            return "esParResult";
        }
    }
}
