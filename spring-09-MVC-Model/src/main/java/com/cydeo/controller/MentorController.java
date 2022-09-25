package com.cydeo.controller;

import com.cydeo.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MentorController {

    @RequestMapping("/mentor")
    public String mentor(Model model){

        model.addAttribute("mentor1", new Mentor("Mike", "Smith", 45, Gender.Male));
        model.addAttribute("mentor2", new Mentor("Tom", "Hanks", 65, Gender.Male));
        model.addAttribute("mentor3", new Mentor("Ammy", "Bryan", 25, Gender.Female));

        return "student/mentor";
    }
}
