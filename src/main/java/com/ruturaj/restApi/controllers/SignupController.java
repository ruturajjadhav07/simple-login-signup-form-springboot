package com.ruturaj.restApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.ruturaj.restApi.modal.SignupModal;
import com.ruturaj.restApi.service.SignupService;

@Controller
public class SignupController {

    @Autowired
    private SignupService signupService;

    @GetMapping("/signup")
    public String showSignupForm(Model model) {
        model.addAttribute("signup", new SignupModal());
        return "signup";
    }

    @PostMapping("/signup")
    public String processSignup(@ModelAttribute SignupModal signupModal, Model model) {
        boolean isValid = signupService.validateSignup(signupModal.getUsername(), signupModal.getPassword(),
                signupModal.getEmail());

        if (isValid) {
            return "redirect:/login";
        } else {
            model.addAttribute("error", "Username or Email already exists.");
            return "signup";
        }
    }
}
