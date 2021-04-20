package com.lilypad.springcloud.photoapp.useridentityservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("identityservice/v1")
public class IdentityServiceApi {
    @GetMapping("/status")
    public String Hello() {
        return "Running correctly";
    }
}
