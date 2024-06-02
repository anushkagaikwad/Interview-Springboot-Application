package com.example.microservice.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroserviceRestController {
    @Value("${passingMarks}")
    private int passingMarks;
    @GetMapping("/result")
    public String getResult(@RequestParam int marks){
        if(marks<passingMarks){
            return "Failed:(";
        }
        return "Passed!";
    }
}
