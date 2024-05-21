package com.fc.testcicd.controller;

import com.fc.testcicd.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class testController {
    private final TestService testService;

    @GetMapping("/test")
    public String test(){
        System.out.println();
        return testService.getTestString();
    }
}
