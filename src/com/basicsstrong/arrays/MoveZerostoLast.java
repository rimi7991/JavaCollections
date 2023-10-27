package com.basicsstrong.arrays;

public class MoveZerostoLast {
    public static void moveZeros(int arr[])
    {
        int count = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] != 0)
            {
                int t = arr[i];
                arr[i] = arr[count];
                arr[count] = t;

                count ++;
            }
        }
        System.out.print("{");
        for(int i = 0; i<arr.length; i++)
            System.out.print(arr[i]+ ",");
        System.out.print("}");
    }

    public static void main(String[] args) {
        int arr[] = {3,6,0,5,0,0,0,7,0};
        moveZeros(arr);
    }
}
