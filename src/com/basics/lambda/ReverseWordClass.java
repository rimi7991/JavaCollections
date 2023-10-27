package com.basics.lambda;

import java.util.Scanner;

public class ReverseWordClass {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter word of your choice");
        String str = in.nextLine();
        ReverseWord rw = word ->
        {
            int l = word.length();
            String rev_word = "";
            for(int i = l-1; i>=0; i--)
            {
                rev_word = rev_word + word.charAt(i);
            }
            return rev_word;
        };
        String result = rw.reverse(str);
        System.out.println("The reverse word is = "+result);
    }
}
