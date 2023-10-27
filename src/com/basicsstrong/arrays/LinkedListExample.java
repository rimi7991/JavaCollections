package com.basicsstrong.arrays;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<String>();
        System.out.println("Enter the number of values you want to enter");
        int n = in.nextInt();
        System.out.println("Enter the values now");
        for(int k = 0; k<n; k++)
        {
            String val = in.next();
            ll.add(val);
        }
        System.out.println("The values in the LinkedList are :"+ll);
        Iterator iter = ll.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
        System.out.println("Enter the mane to add at first");
        String firstname = in.next();
        ll.addFirst(firstname);
        System.out.println("The list now :"+ll);

        System.out.println("Enter the value to be added at last");
        String lastvalue = in.next();
        ll.addLast(lastvalue);

        Iterator iter1 = ll.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter1.next());
        }
    }
}
