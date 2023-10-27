package com.basics.set;

import java.util.NavigableSet;
import java.util.TreeSet;

//subInterface to SortedSet
//have methods related to Navigation functionality
//both SortedSet and NavigableSet have have the same implementation class as TreeSet
public class NavigableSet_Example1 {
    public static void main(String[] args)
    {
        NavigableSet<Integer> ns = new TreeSet<Integer>();
        ns.add(1500);
        ns.add(1700);
        ns.add(1250);
        ns.add(1400);
        ns.add(4500);
        System.out.println(ns);
        System.out.println(ns.floor(1600));
        System.out.println(ns.lower(1300));
        System.out.println(ns.ceiling(4000));
        System.out.println(ns.higher(3000));
        System.out.println(ns.descendingSet());
        System.out.println(ns.pollFirst()); // Retrieves and removes the FirstElement of set
        System.out.println(ns.pollLast()); // Retrieves and removes the LastElement of Set
        System.out.println(ns);
    }
}
