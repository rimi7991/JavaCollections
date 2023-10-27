package com.basics.lambda;

public class RunnableExample {
    public static void main(String[] args) {
            Runnable runnable = new Runnable()
            {
                @Override
                public void run() {
                    int sum = 0;
                    for(int i = 1 ; i <= 10 ; i++)
                        sum = sum + i;
                    System.out.println("Traditional Sum = "+sum);
                }
            };
            new Thread(runnable).start();

            Runnable runnable2 = () -> {
                int sum = 0;
                for(int i =1 ; i <= 10; i++) {
                    sum = sum + i;
                }
                System.out.println("Lambda with Runnable = "+sum);
                };
            new Thread(runnable2).start();

            new Thread(() ->{
                    int sum = 0;
                    for(int i = 1; i <= 10 ; i++)
                        sum = sum + i;
                    System.out.println("Lambda with Thread = "+sum);
             }).start();
        }
  }


