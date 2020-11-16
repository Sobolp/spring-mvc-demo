package com.example.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        model.addAttribute("message","Yo! " + request.getParameter("studentName").toUpperCase());

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionTree(@RequestParam("studentName") String theName, Model model) {

        model.addAttribute("message","Hey My Friend! " + theName.toUpperCase());

        return "helloworld";
    }
}
