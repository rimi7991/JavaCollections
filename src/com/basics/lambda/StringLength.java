package com.basics.lambda;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string of your choice");
        String str = in.nextLine();
        LengthCheck lc = s -> s.length();
        int stringLength = lc.count(str);
        System.out.println("Length of string = "+stringLength);
    }
}
