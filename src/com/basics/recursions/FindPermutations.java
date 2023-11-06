package com.basics.recursions;

public class FindPermutations {
    public static void findPermutations(String str, String result)
    {
        if(str.length() == 0) {
            System.out.println(result);
            return;
        }

        for(int i = 0;i<str.length();i++)
        {
            char curr = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            findPermutations(newStr,result+curr);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        String ans = "";
        findPermutations(str,ans);
    }
}
