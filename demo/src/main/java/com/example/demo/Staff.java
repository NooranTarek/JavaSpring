package com.example.demo;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;


public class Staff {
    @NotBlank(message="staff name can not be blank ")
    private String staffName;
    @NotBlank(message="staff title can not be blank ")
    private String staffJobTitle;
    private double staffSalary;
    private String id;
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public Staff() {
        this.id=UUID.randomUUID().toString();
    }
    public String getStaffName() {
        return staffName;
    }
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }
    public String getStaffJobTitle() {
        return staffJobTitle;
    }
    public void setStaffJobTitle(String staffJobTitle) {
        this.staffJobTitle = staffJobTitle;
    }
    public double getStaffSalary() {
        return staffSalary;
    }
    public void setStaffSalary(double staffSalary) {
        this.staffSalary = staffSalary;
    }


}
