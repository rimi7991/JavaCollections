package com.basicsstrong.arrays;

public class SubArrays {
    public static void subarray(int arr[])
    {
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++)
        {
            int start = i;
            for(int j = i; j<arr.length; j++)
            {
                int last = j;
                int sum = 0;
                for(int k = start; k <= last; k++)
                {
                    System.out.print(arr[k]+ " ");
                    System.out.println();
                    sum = sum + arr[k];
                    if(sum>max_sum)
                        max_sum = sum;
                    System.out.println("the sum of the subarray "+sum);
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max Sum = "+max_sum);
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        subarray(numbers);
    }
}
