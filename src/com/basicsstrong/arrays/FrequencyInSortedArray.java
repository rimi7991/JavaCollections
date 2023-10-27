package com.basicsstrong.arrays;

public class FrequencyInSortedArray {
    public static void frequencyCount(int arr[])
    {
        int ele = arr[0], initial_index = 0, final_index = 0, count = 0;
        for(int i = 1; i<arr.length; i++)
        {
            if(arr[i] != arr[i-1])
            {
                final_index = i-1;
                count =  final_index - initial_index + 1;
                System.out.println(ele + " " + count);
                initial_index = i;
                ele = arr[i];
            }

            if(i == arr.length - 1)
            {
                count = i - initial_index + 1;
                System.out.println(arr[i] + " " + count);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,10,10,20,30,30};
        frequencyCount(arr);
    }
}
