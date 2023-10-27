package com.basicsstrong.arrays;

import java.util.Scanner;

public class LargestNumber {
    public static int getLargest(int arr[])
    {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
            if(arr[i] > largest)
                largest = arr[i];
        //System.out.println("largest : "+largest);
        return largest;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of array");
        int len = in.nextInt();
        int arr1[] = new int[len];
        System.out.println("Enter the "+ len +" elements in array");
        for(int i = 0; i<len; i++)
            arr1[i] = in.nextInt();
        int res = getLargest(arr1);
        System.out.println("Largest value is :"+res);
        }
}
