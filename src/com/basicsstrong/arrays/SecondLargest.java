package com.basicsstrong.arrays;

public class SecondLargest {
    public static int secondLargest(int arr[])
    {
        int largest = 0;
        int res = -1;
        for(int i = 0; i<arr.length; i++)
        {
            //checking if arr[i] is greater than largest
            if(arr[i] > largest)
            {
                res = largest;
                largest = i;
            }
            //checking when arr[i] is lesser than largest and also not equal to largest
            if(arr[i] != arr[largest])
            {
                if(res == -1 || arr[i]>arr[res]) //arr[i] can be greater than second largest, in that case second largest becpmes arr[i]
                    res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {2,5,8,1,10};
        int result_secondLargestIndex = secondLargest(arr);
        System.out.println("Second Largest Index : "+result_secondLargestIndex);
    }
}
