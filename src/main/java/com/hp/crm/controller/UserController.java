package com.hp.crm.controller;

import com.hp.crm.model.User;
import com.hp.crm.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired private UserServiceImpl userService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String listAllUsers(ModelMap modelMap){
        List<User> allUsers = userService.listAllUsers();
        modelMap.addAttribute("allUsers", allUsers);
        return "home";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(@ModelAttribute User user) {
        userService.addUser(user);
        return "redirect:/user/home";
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public String getUser(@PathVariable int id, ModelMap modelMap) {
        User user = userService.getUserById(id);
        modelMap.addAttribute("user", user);
        return "user_detail";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateUser(@ModelAttribute User user) {
        userService.updateUser(user);
        return "redirect:/user/home";
    }
}
