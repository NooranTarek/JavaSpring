package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class StaffController {

    //get method
    @GetMapping("/staffDetails")
    public String getStaffDetails(Model model) {
        //A Staff object (myStaff) is created with specific details.
        Staff myStaff=new Staff("nouran","develoepr",1000);
        //add an object named staffData to the model
        //This name (staffData) will act as a key to reference the (myStaff) object in the view
        model.addAttribute("staffData", myStaff);
        List <Staff> allStaff= new  ArrayList<Staff>();
        allStaff.add(new Staff("nouran","develoepr",20000));
        allStaff.add(new Staff("sara","pharmacist",50));
        allStaff.add(new Staff("lobna","teacher",1000));

        model.addAttribute("staff", allStaff);
        model.addAttribute("str", "i LOVE java");
        //using View Resolver(Thymeleaf template engine) to know the file of this name
         return "staffDetails";
    }
    //get method
    @GetMapping("/staffForm")
    public String getStaffDataForm(Model model) {
        Staff myStaff=new Staff("nouran","develoepr",1000);
        model.addAttribute("staff",myStaff);
        return "staffForm";
   
    }
    
}
