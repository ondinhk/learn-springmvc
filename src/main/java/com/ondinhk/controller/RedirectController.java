package com.ondinhk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
    @RequestMapping("/page1")
    public String page1() {
        return "page1";
    }

    @RequestMapping("/redirect")
    public String redirectPage2() {
        return "redirect:page2";
    }

    @RequestMapping("/page2")
    public String page2(Model model) {
        // page2 return home;
        String name = "OnKhang";
        model.addAttribute("name", name);
        return "home";
    }
}
