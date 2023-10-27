package com.basics.lambda;

import java.util.List;
import java.util.function.Consumer;

public class CallEmplloyees {
    public static void main(String[] args) {
        List<Employee> list = Employees.inputs();
        System.out.println(list);

        Consumer<Employee> c = s -> System.out.println(s);
        list.forEach(c);

        Consumer<Employee> c2 = s -> System.out.println(s.getName());
        list.forEach(c2);

        Consumer<Employee> c3 = s -> System.out.println(s.getSkills());
        list.forEach(c3);

        Consumer<Employee> c4 = s -> System.out.println(s.getEmpId() + " "+s.getName() + " " + s.getSalary() + " " + s.getSkills());
        list.forEach(c4);

        list.forEach(c2.andThen(c3));

        list.forEach( s -> {
            if(s.Salary > 20000)
                c.accept(s);
        });
    }
}
