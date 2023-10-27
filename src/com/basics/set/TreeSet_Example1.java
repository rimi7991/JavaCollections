package com.basics.set;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet_Example1 {
    public static void main(String[] args)
    {
        TreeSet ts = new TreeSet();
        SortedSet s = new TreeSet();
        TreeSet ts1 = new TreeSet(s);
        HashSet hs = new HashSet();
        TreeSet ts2 = new TreeSet(hs);

        TreeSet<Integer> ts4 = new TreeSet<Integer>();
    }
}
