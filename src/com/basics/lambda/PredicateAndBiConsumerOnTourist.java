package com.basics.lambda;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndBiConsumerOnTourist {
    public static void main(String[] args) {
        List<Tourist> list = Tourists.customersList();
        Predicate<Tourist> p1 = val -> val.getPackageType() == "Platinum";

        list.forEach(customer ->
        {
           if(p1.test(customer))
               System.out.println("Platinum Package Type customers : " + customer.getTourist_id() + " " +customer.getLocation());

        });

        BiConsumer<String,List<String>> place = (location, spots) -> System.out.println( "Location : "+ location + " || " + "Spots : "+ spots);
        list.forEach(customer -> {
            place.accept(customer.getLocation(),customer.getTouristSpots());
        });


        System.out.println("PLATINUM PACKAGE TRIPS");

        list.forEach(customer -> {
            if(p1.test(customer) == true)
            {
                place.accept(customer.getLocation(),customer.touristSpots);
            }
        });
    }
}
