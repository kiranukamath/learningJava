package com.learning.chapter3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@SessionAttributes("name")
public class WelcomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String goToLoginPage(ModelMap model) {
        model.put("name", "kiran");
        return "welcome";
    }

    /* @RequestMapping(value = "login", method = RequestMethod.POST)
    public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
        if (authenticationService.authenticate(name, password)) {
            model.put("name", name);
            return "welcome";
        }
        model.put("errorMessage","Invalid Username/Password, Please retry");
        return "login";
    } */

}
