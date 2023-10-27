package com.basics.lambda;

import java.util.Arrays;
import java.util.List;

public class Employees {
    public static List<Employee> inputs()
    {
        Employee e1 = new Employee(102,"Rakesh Roshan",25000, Arrays.asList("Java","PHP","DBMS"));
        Employee e2 = new Employee(103,"Ramesh Ojha",26000, Arrays.asList("Java","React","DBMS"));
        Employee e3 = new Employee(104,"Hitesh Sen",23000, Arrays.asList("Java","HTML","CSS"));
        Employee e4 = new Employee(105,"Prakash Roy",28000, Arrays.asList("Java","JavaScript","DBMS"));
        Employee e5 = new Employee(106,"Ram Gupta",29000, Arrays.asList("Java","PHP","AWS"));
        List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5);
        return list;
    }
}
