package com.basicsstrong.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListExamples {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        System.out.println("Enter the number of elements you want to enter");
        int n = in.nextInt();
        System.out.println("Enter the elements");
        for(int j = 0; j<n; j++)
        {
            String val = in.next();
            arr.add(val);
        }
        System.out.println(arr);
        Iterator iter = arr.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
}
