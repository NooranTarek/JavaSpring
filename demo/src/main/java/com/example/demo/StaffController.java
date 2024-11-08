package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class StaffController {

    //get method
    @GetMapping("/staffDetails")
    public String getStaffDetails(Model model) {
        Staff myStaff=new Staff("nouran","develoepr",20000);
        model.addAttribute("staff", myStaff);
        //using View Resolver(Thymeleaf template engine) to know the file of this name
        return "staffDetails";
    }
    
}
