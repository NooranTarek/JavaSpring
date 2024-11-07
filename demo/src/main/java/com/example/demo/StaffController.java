package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class StaffController {

    //get method
    @GetMapping("/staffnames")
    public String getStaffNames() {
        return "staffnames";
    }
    
}
