package com.basics.lambda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionOnTourists {
    public static void main(String[] args) {
        List<Tourist> list = Tourists.customersList();
        Predicate<Tourist> p = val -> val.getPackageType() == "Platinum" || val.getPackageType() == "Gold";
        BiFunction<List<Tourist>, Predicate<Tourist>, Map<Integer,String>> biFunction = ((tourists, touristPredicate) -> {
            Map map = new HashMap();
            list.forEach(customer ->{
               if(p.test(customer) == true)
                   map.put(customer.getTourist_id(),customer.getLocation());
            });
            return map;
        });

        System.out.println(biFunction.apply(list,p));
    }
}
