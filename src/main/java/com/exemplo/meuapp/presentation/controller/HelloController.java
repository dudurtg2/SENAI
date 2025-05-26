package com.exemplo.meuapp.presentation.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @GetMapping
    String hello(@AuthenticationPrincipal OidcUser user) {
        return "Hello, World! " + user.getFullName() + "!";
    }
}
