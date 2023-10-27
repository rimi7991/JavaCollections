package com.basics.set;

import java.util.TreeSet;

public class ComparatorDemoImplementation_TreeSet {
    public static void main(String[] args)
    {
        TreeSet ts = new TreeSet(new ComparatorDemo1());
        ts.add(5);
        ts.add(50);
        ts.add(2);
        ts.add(35);
        System.out.println(ts);
    }
}
