package com.example.date;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController

public class MyController {
    @GetMapping("/")
    public String getDate(){
        return "16-12-2023";
    }
    
}
