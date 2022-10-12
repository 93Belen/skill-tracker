package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloSpringController {
    @RequestMapping(value="hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello(@RequestParam String name, Model model){
        String greeting = "Hello, " + name;
        model.addAttribute("greeting", greeting);
        return "hello";
    }
    @GetMapping("form")
    public String helloForm(){
        return "form";
    }
}
