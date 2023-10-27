package com.basicsstrong.arrays;

public class LeftRotateArrayByCount {
    public static int[] leftRotateByCount(int arr[], int d)
    {
        int t[] = new int[d];
        for(int i = 0; i<d; i++)
            t[i] = arr[i];
        for(int j = d; j< arr.length; j++)
            arr[j-d] = arr[j];
        int c = 0;
        for(int k = arr.length - d; k < arr.length; k++)
        {
            arr[k] = t[c];
            c++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int res[] = leftRotateByCount(arr,2);
        for(int i = 0; i < arr.length; i++)
            System.out.print(res[i]+" ");
    }
}
