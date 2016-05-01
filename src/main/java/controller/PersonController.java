package controller;

import modelo.PersonModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hector on 01/05/16.
 */
@Controller
public class PersonController {
    @RequestMapping("/person")
    public String person(Model model){
        PersonModel person = new PersonModel("carlos","benavides",20);
        model.addAttribute("person",person);
        return "personview";

    }

    @ResponseBody
    @RequestMapping("/")
    String entry(){
        return "cualquier cosa";
    }
}
