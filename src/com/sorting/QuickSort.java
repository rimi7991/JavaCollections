package com.sorting;

public class QuickSort {
    public static void quickSort(int arr[],int si, int ei)
    {
        if(si>=ei)
            return;
        int partitionIndex = partition(arr,si,ei);
        quickSort(arr,si,partitionIndex-1);
        quickSort(arr,partitionIndex+1,ei);
    }
    public static int partition(int arr[],int si,int ei)
    {
        int pivot = arr[ei];
        int i = si-1;
        for(int j = si; j<ei; j++)
        {
            if(arr[j] <= pivot)
            {
                //swap the jth element with i
                i++;
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        //swap pivot element with i
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {3,6,5,1,8,2};
        quickSort(arr,0,arr.length-1);
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
