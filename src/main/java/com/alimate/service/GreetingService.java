package com.alimate.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class GreetingService {
    @RequestMapping(value = "/public/greeting", method = GET)
    public String doGreetPublicly() {
        return "This is public";
    }

    @RequestMapping(value = "/greeting", method = GET)
    public String doGreetSecurely() {
        return "This is protected";
    }
}