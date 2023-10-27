package com.basics.recursions;

import java.util.Scanner;

public class Recursion_Prog11_SubsetsofString {
    //Code to find all the subsets of a given string
    public static void subset(String str, String current, int i)
    {
        if(i == str.length())
        {
            System.out.println(current);
            return;
        }
        subset(str,current,i+1);
        subset(str,current+str.charAt(i), i+1);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = in.next();
        System.out.println("The subsets are : ");
        subset(str," ",0);
    }
}
