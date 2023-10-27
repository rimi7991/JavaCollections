package com.basicsstrong.arrays;

public class PrintPairs {
    public static void arrayPairs(int arr[])
    {
        int tp = 0;
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = i + 1; j< arr.length; j++)
            {
                System.out.print("( "+ arr[i] + " , "+ arr[j] +" ) ");
                tp = tp +1;
            }
            System.out.println();
        }
        System.out.println("Total Pairs = "+tp);
    }

    public static void main(String[] args) {
        int numbers[] = { 2,3,4,5,6 };
        arrayPairs(numbers);
    }
}
