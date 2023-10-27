package com.basicsstrong.arrays;

public class DuplicatesRemovalFromSortedArray {
    public static int[] removesDuplicates(int arr[])
    {
        int res = 1;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != arr[res-1])
            {
                arr[res] = arr[i];
                res++;
            }
        }
        //System.out.println("res : "+res);
        if(arr[res-1] == arr[arr.length - 1])
        {
            while(res != arr.length)
            {
                arr[res] = 0;
                res++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {2,5,5,6,8,8,8,11,12};
        int res[] = removesDuplicates(arr);
        System.out.println("The resultant array is : ");
        for(int i = 0; i<res.length; i++)
            System.out.print(res[i]+" ");
    }
}
