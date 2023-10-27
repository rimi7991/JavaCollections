package com.basics.threads;

public class NumberPrinter implements Runnable{
    int number;

    NumberPrinter(int number)
    {
        this.number = number;
    }
    @Override
    public void run() {
        System.out.println(number + " " + "Thread : "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        for(int i = 1; i<=100; i++)
        {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread = new Thread(numberPrinter);
            thread.start();
        }
    }
}
