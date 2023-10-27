package com.basics.lambda;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<Tourist> list = Tourists.customersList();
        Predicate<Tourist> p = Tourist::isId_proof;
        list.forEach(customer ->{
            if(p.test(customer) == true)
            {
                System.out.println(customer.getLocation() + "  TRUE for Id_Proof");
            }
        });

        Function<Integer,Double> func = Math::sqrt;
        System.out.println(func.apply(64));

        Function<String,String> str = String::toLowerCase;
        System.out.println(str.apply("DEBARATI"));

    }
}
