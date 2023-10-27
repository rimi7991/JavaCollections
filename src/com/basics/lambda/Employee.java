package com.basics.lambda;

import java.util.List;

public class Employee {
    int EmpId;
    String Name;
    int Salary;
    List<String> Skills;

    public Employee(int empId, String name, int salary, List<String> skills) {
        EmpId = empId;
        Name = name;
        Salary = salary;
        Skills = skills;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public List<String> getSkills() {
        return Skills;
    }

    public void setSkills(List<String> skills) {
        Skills = skills;
    }
}
