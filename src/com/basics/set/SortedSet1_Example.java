package com.basics.set;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1_Example {
    public static void main(String[] args)
    {
        SortedSet s = new TreeSet();
        s.add(5);
        s.add(20);
        s.add(10);
        s.add(39);
        s.add(25);
        System.out.println(s);
        HashSet hs = new HashSet();
        hs.add(s.first());
        hs.add(s.last());
        System.out.println(hs);
        System.out.println(s.headSet(10));
        System.out.println(s.tailSet(10));
        System.out.println(s.subSet(10,25));
        System.out.println(s.comparator());
    }

}
