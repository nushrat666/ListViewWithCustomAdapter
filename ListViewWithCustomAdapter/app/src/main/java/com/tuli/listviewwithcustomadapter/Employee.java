package com.tuli.listviewwithcustomadapter;

import java.util.ArrayList;

public class Employee {
    private int employeeImage;
    private String employeeName;
    private String employeeDesignation;


    public Employee(int employeeImage, String employeeName, String employeeDesignation) {
        this.employeeImage = employeeImage;
        this.employeeName = employeeName;
        this.employeeDesignation = employeeDesignation;
    }

    public Employee() {
    }

    public int getEmployeeImage() {
        return employeeImage;
    }

    public void setEmployeeImage(int employeeImage) {
        this.employeeImage = employeeImage;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public ArrayList<Employee> getAllEmployees(){
        ArrayList<Employee> employees=new ArrayList<>();
        employees.add(new Employee(R.mipmap.ic_launcher_round,"Hasan","software engineer"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"kamal","software engineer"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"jamal","software engineer"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"rahim","Designation"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"maruf","Designation"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"titli","Designation"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"Hasan","Designation"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"Hasan","Designation"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"titli","Designation"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"Hasan","Designation"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"titli","Designation"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"Hasan","Designation"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"titli","Designation"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"Hasan","Designation"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"kamal","Designation"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"Hasan","Designation"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"kamal","Designation"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"Hasan","Designation"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"kamal","Designation"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"Hasan","Designation"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"kamal","Designation"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"Hasan","Designation"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"kamal","Designation"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"Hasan","Designation"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"kamal","Designation"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"Hasan","Designation"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"kamal","Designation"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"Hasan","Designation"));
        employees.add(new Employee(R.mipmap.ic_launcher_round,"kamal","Designation"));
        return employees;
    }
}
