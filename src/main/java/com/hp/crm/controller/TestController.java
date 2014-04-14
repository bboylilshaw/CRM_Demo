package com.hp.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/")
    public String home(ModelMap modelMap) {
        modelMap.addAttribute("title", "CRM Demo");
        return "forward:/user/home";
    }
}
