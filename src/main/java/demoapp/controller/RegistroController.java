package demoapp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

@Controller
@RequestMapping("/user")

public class RegistroController {

    @RequestMapping("/form")
    public String showUserForm(Model model){
        model.addAttribute("usuario", new Usuario());
        return "userForm";
    }



}




