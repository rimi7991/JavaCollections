package com.basics.lambda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionOnTourist {
    public static void main(String[] args) {
        Predicate<Tourist> p = val -> val.getPackageType() == "Platinum";
        Function<List<Tourist>, Map<Integer,String>> function = list -> {
            Map map = new HashMap();
            list.forEach(customer -> {
                if(p.test(customer))
                    map.put(customer.getTourist_id(),customer.getLocation());
            });
            return map;
        };

        List<Tourist> list = Tourists.customersList();
        System.out.println(function.apply(list));
    }
}
