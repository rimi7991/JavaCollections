package com.basics.recursions;

public class SubSetSum {
    public static int subset_sum(int arr[],int n,int sum)
    {
        if(n == 0)
            return (sum == 0) ? 1:0;
        //System.out.println("n = "+n);
        //System.out.println("Sum = "+sum);
        return subset_sum(arr,n-1,sum)+subset_sum(arr,n-1,sum-arr[n-1]);
    }

    public static void main(String[] args) {
        int arr1[] = {10,20,15};
        int sum = subset_sum(arr1,3,25);
        System.out.println("The ans = "+sum);
    }
}
