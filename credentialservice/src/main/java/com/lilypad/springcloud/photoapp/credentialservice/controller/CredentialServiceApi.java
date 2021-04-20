package com.lilypad.springcloud.photoapp.credentialservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/credentialservice/v1")
public class CredentialServiceApi {
    @GetMapping("/status")
    public String hello() {
        return "I am good !";
    }
}
