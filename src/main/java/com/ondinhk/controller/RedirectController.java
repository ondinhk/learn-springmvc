package com.ondinhk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RedirectController {
    @RequestMapping("/page1")
    public String page1() {
        return "page1";
    }

    @RequestMapping("/redirect")
    public String redirectPage2(RedirectAttributes re) {
        String name = "OnKhang";
        re.addAttribute("name", name);
        return "redirect:page2";
    }

    @RequestMapping("/page2")
    public String page2(@RequestParam("name") String name, Model model) {
        // page2 return home;
        model.addAttribute("name", name);
        return "home";
    }
}
