package com.jft.onlinestore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/index")
    public String login() {
        return "index";
    }

    @RequestMapping(value = "/admin-auth")
    public String adminRegistration() {
        return "admin_reg";
    }

    @RequestMapping(value = "/user-auth")
    public String userRegistration() {
        return "user_reg";
    }

}