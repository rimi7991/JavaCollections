package com.basicsstrong.arrays;

public class MajorityElement {
    public static int majorityElement(int arr[],int n)
    {
        int res = 0;
        int count = 1;
        for(int i = 1;i<arr.length; i++)
        {
            if(arr[res] == arr[i])
                count++;
            else
                count--;
            if(count == 0)
            {
                res = i;
                count = 1;
            }
        }
        count = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[res] == arr[i])
                count++;
        }
        if(count <= n/2)
            return -1;
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,6,6,2,2,2,2,1,4};
        int result = majorityElement(arr,10);
        System.out.println("Result index = "+result);
    }
}
