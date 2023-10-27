package com.basicsstrong.arrays;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int arr[], int key)
    {
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of array");
        int len = in.nextInt();
        int arr1[] = new int[len];
        System.out.println("Enter the "+ len +" elements in array");
        for(int i = 0; i<len; i++)
            arr1[i] = in.nextInt();
        System.out.println("Enter the key to be searched");
        int key = in.nextInt();
        int res = linearSearch(arr1,key);
        if(res == -1)
        {
            System.out.println("ELEMENT NOT FOUND");
        }
        else
            System.out.println("The index where the element is : "+(res+1));
    }

}
