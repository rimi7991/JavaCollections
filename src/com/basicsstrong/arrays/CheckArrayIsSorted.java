package com.basicsstrong.arrays;

public class CheckArrayIsSorted {
    public static int checkIfSorted(int arr[])
    {
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i] < arr[i-1])
            {
                return -1;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,5,10,9};
        int res = checkIfSorted(arr);
        if (res==-1)
            System.out.println("Unsorted Array");
        else
            System.out.println("Sorted Array");
    }
}
