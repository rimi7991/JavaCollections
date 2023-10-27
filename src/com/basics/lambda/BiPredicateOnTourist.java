package com.basics.lambda;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateOnTourist {
    public static void main(String[] args) {
        List<Tourist> list = Tourists.customersList();

        BiPredicate<Boolean, String> biPredicate = (idProof, packageType) -> idProof == true && (packageType == "Platinum" || packageType == "Gold");

        BiConsumer<String,List<String>> place = (location,spots) -> System.out.println("Location : " + location + " || " + "Spots : " + spots);

        list.forEach(customer ->{
            if(biPredicate.test(customer.isId_proof(), customer.getPackageType()))
            {
                place.accept(customer.getLocation(),customer.getTouristSpots());
            }
        });


    }
}
