package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){
        model.addAttribute("name", "Cydeo");
        model.addAttribute("course", "MVC");

        model.addAttribute("id", new Random().nextInt());
        model.addAttribute("numbers", List.of(4, 5, 6, 7));
        model.addAttribute("date", LocalDate.now());
        model.addAttribute("student", new Student(1, "Yusuf", "Abakli"));

        return "/student/welcome";
    }


}
