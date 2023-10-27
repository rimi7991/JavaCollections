package com.basics.lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.function.Predicate;

public class EvenNumbers {
    public void print_Num(Collection<Integer> c, Predicate<Integer> p){
        for(Integer i : c)
        {
            if (p.test(i))
                System.out.println(i + " ");
        }
    }

    public static void main(String[]  args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter length of List");
        int l = in.nextInt();
        System.out.println("Enter the values in list");
        for(int j = 0; j<l; j++)
        {
            list.add(in.nextInt());
        }
        EvenNumbers en = new EvenNumbers();
        en.print_Num(list, n -> n%2 == 0);
    }
}
