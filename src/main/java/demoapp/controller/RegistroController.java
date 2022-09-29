package demoapp.controller;

import demoapp.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")

public class RegistroController {

    @Autowired
    private RegistroService service;

    @RequestMapping("/user/{nombre}")
    public String showUserForm(Model model){
        model.addAttribute("usuario", new Usuario());
        return "userForm";
    }
    public @ResponseBody String usuario(@PathVariable(value="nombre") String nombre) {
        return service.saluda(nombre);
    }


}