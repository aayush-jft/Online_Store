package com.jft.onlinestore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping(value = "/index")
    public String login() {
        //System.out.println("Username.................... " + username);
        return "index";
    }

    @RequestMapping(value = "/cust_reg")
    public String customerRegistration() {
        return "customer_registration";
    }

    @RequestMapping(value = "/admin_reg")
    public String adminRegistration() {
        return "admin_registration";
    }

    @RequestMapping(value = "/home")
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/customer_profile")
    public String customerProfile() {
        return "customer_profile";
    }
}