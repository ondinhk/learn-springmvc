package com.ondinhk.controller;

import java.util.ArrayList;
import java.util.List;

import com.ondinhk.model.UserModel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @RequestMapping(value = { "/", "/add-user" }, method = RequestMethod.GET)
    public String addUser(Model model) {
        model.addAttribute("userModel", new UserModel());
        List<String> listFavorite = new ArrayList<String>();
        listFavorite.add("Book");
        listFavorite.add("Music");
        listFavorite.add("Computer");
        listFavorite.add("Film");
        model.addAttribute("listFavorite", listFavorite);

        List<String> listPosition = new ArrayList<String>();
        listPosition.add("Fresher");
        listPosition.add("Dev");
        listPosition.add("Junior");
        model.addAttribute("listPosition", listPosition);
        return "addUser";
    }

    @RequestMapping(value = "/add-user", method = RequestMethod.POST)
    public String viewUser(@ModelAttribute("userModel") UserModel user) {
        // model.addAttribute("userModel", user);
        return "viewUser";
    }
}
