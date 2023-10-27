package com.basics.lambda;

import java.util.List;
import java.util.function.Predicate;

public class MethodReferenceOnTourist {
    public static void main(String[] args) {
        List<Tourist> list = Tourists.customersList();
        Predicate<Tourist> p = MethodReferenceOnTourist::check;
        list.forEach(customer ->{
            if(p.test(customer))
                System.out.println(customer.getLocation());
        });

    }
        public static boolean check(Tourist tourist){
            if(tourist.getPackageType() == "Platinum")
                return true;
            else
                return false;
        }
    }

