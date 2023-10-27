package com.basics.set;

import java.util.Comparator;

public class ComparatorDemo1 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
         Integer a = (Integer) o1;
        Integer b = (Integer) o2;
         if(a<b)
         {
             return 1;
         }
         else if(a>b)
         {
             return 1;
         }
         else
             return 0;
        //return 0;
    }
}
