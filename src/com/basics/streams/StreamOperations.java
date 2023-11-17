package com.basics.streams;

import com.basics.lambda.Tourist;
import com.basics.lambda.Tourists;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamOperations {
    public static void main(String[] args) {
        //Using map() and flatMap()
        Set<String> touristSpotSet = Tourists.customersList().stream()
                .map(Tourist::getTouristSpots)
                .flatMap(List::stream)
                .collect(Collectors.toSet());
        System.out.println(touristSpotSet);


        //Using count()
        Integer listTouristSpot = (int) Tourists.customersList().stream()
                .map(Tourist::getTouristSpots)
                .flatMap(List::stream)
                .count();
        System.out.println("No. of Tourist Spots = "+listTouristSpot);

        //Using distinct() and sorted()
        List<String> distinctTouristSpots = Tourists.customersList().stream()
                .map(Tourist::getTouristSpots)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Distinct Tourist Spots :"+distinctTouristSpots);

        Integer distinctCountTouristSpots = (int)Tourists.customersList().stream()
                .map(Tourist::getTouristSpots)
                .flatMap(List::stream)
                .distinct()
                .count();
        System.out.println("Distinct Tourist Spots :"+distinctCountTouristSpots);

        //Using anyMatch()
        boolean checkStartwithD = Tourists.customersList().stream()
                .map(Tourist::getTouristSpots)
                .flatMap(List::stream)
                .anyMatch(s-> s.startsWith("D"));
        System.out.println("Checking if any places starts with D : "+checkStartwithD);

        //Using allMatch()
        boolean checkisAllStartwithD = Tourists.customersList().stream()
                .map(Tourist::getTouristSpots)
                .flatMap(List::stream)
                .allMatch(s-> s.startsWith("D"));
        System.out.println("Checking if all places starts with D : "+checkisAllStartwithD);

        //Using noneMatch()
        boolean checkisNoneStartwithD = Tourists.customersList().stream()
                .map(Tourist::getTouristSpots)
                .flatMap(List::stream)
                .noneMatch(s-> s.startsWith("D"));
        System.out.println("Checking if no places starts with D : "+checkisNoneStartwithD);
    }
}
