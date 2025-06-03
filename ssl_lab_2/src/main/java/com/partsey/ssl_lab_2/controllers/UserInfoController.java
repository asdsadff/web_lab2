package com.partsey.ssl_lab_2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    @GetMapping("/name")
    public String getFullName() {
        return "Ihor Partsey KP-21";
    }
}
