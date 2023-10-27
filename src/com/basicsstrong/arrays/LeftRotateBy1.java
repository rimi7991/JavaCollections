package com.basicsstrong.arrays;

public class LeftRotateBy1 {
    public static int[] leftRotateByOne(int arr[])
    {
        int firstVal = arr[0];
        for(int i = 1; i<arr.length; i++)
            arr[i-1] = arr[i];
        arr[arr.length-1] = firstVal;
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int res[] = leftRotateByOne(arr);
        for(int i = 0;i<res.length; i++)
            System.out.print(res[i]+",");
    }
}
