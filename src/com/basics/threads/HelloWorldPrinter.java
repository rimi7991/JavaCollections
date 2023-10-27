package com.basics.threads;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run()
    {
        System.out.println("Hello World! THREAD : "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("HELLO WORLD : THREAD :"+Thread.currentThread().getName());
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread thread = new Thread(helloWorldPrinter);
        thread.start();
    }

}
