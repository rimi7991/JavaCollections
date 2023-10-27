package com.basics.recursions;

public class TowerOfHanoi {
    public static void towerofhanoi(int n, char A, char B,char C)
    {
        if(n == 1) {
            System.out.println("Move disc " + n + " from " + A + "->" + C);
            return;
        }
        towerofhanoi(n-1,A,C,B);
        System.out.println("Move disc "+n+ " from "+ A + "->"+C);
        towerofhanoi(n-1,B,A,C);
    }

    public static void main(String[] args) {
        towerofhanoi(3,'A','B','C');
    }
}
