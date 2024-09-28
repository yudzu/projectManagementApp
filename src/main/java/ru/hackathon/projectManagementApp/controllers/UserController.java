package ru.hackathon.projectManagementApp.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hackathon.projectManagementApp.services.UserService;

import java.security.Principal;

@RestController
@RequiredArgsConstructor
@RequestMapping("/secured")
public class UserController {
    private final UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/user")
    public String userAccess(Principal principal) {
        if (principal == null) {
            return null;
        }
        return principal.getName();
    }

}
