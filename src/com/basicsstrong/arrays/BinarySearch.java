package com.basicsstrong.arrays;

import java.util.Scanner;

public class BinarySearch {
    public static int SearchVal(int arr[],int key)
    {
        int lb = 0;
        int ub = arr.length-1;
        int mid = 0;
        while(lb<=ub)
        {
            mid = (lb+ub)/2;
            if(key > arr[mid])
                lb = mid + 1;
            if (key < arr[mid])
                ub = mid -1;
            if (key == arr[mid])
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of array");
        int l = in.nextInt();
        int arr1[] = new int[l];
        System.out.println("Enter values in array");
        for(int i = 0;i < l;i++)
            arr1[i] = in.nextInt();
        System.out.println("Enter value to be searched");
        int key = in.nextInt();
        int res = SearchVal(arr1,key);
        if(res == -1)
            System.out.println("ELEMENT NOT FOUND");
        else
            System.out.println("ELEMENT FOUND AT INDEX : "+(res+1));

    }
}
