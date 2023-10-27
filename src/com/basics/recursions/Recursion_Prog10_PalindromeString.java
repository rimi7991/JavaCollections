package com.basics.recursions;

import java.util.Scanner;

public class Recursion_Prog10_PalindromeString {
    //Code to check if a String is Palindrome
    // TC = T(N) = T(N-2) + theta(1) => O(N)
    // SC = O(N) (Auxillary Space Complexity in Worst Case)
    public static boolean checkPalindrome(String str, int start, int end){
        if(start == end)
            return true;
        if(end == 0)
            return false;
        if(str.charAt(start) == str.charAt(end))
            return checkPalindrome(str,start+1,end-1);
        else
            return false;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = in.next();
        int l = str.length();
        System.out.println("Is the string Palindrome?");
        System.out.println(checkPalindrome(str,0,l-1));
    }
}
