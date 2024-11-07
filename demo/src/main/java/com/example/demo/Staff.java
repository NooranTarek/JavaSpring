package com.example.demo;

public class Staff {
    private String staffName;
    private String staffJobTitle;
    private double staffSalary;
    public Staff(String staffName, String staffJobTitle, double staffSalary) {
        this.staffName = staffName;
        this.staffJobTitle = staffJobTitle;
        this.staffSalary = staffSalary;
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
