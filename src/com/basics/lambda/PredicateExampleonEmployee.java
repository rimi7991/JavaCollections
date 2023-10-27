package com.basics.lambda;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExampleonEmployee {
    public static void main(String[] args) {
        Predicate<Employee> p1 = val -> val.getSalary() > 25000;

        Predicate<Employee> p2 = val2 -> val2.getName() == "Rakesh Roshan";

        List<Employee> list = Employees.inputs(); //input() :  static method already defined in Employees class
        list.forEach(employee -> {                // employee is a variable for lambda
            if(p1.test(employee))
            {
                System.out.println("Salary greater than 25000 : " + employee.getName());
            }
        });

        list.forEach(employee -> {
            if(p2.test(employee))
            {
                System.out.println("Is employee name is Rakesh : " + employee.getName());
            }
        });



    }
}
