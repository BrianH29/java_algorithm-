package com.bh.fibonacci;

public class Fibonacci {
    public void fibonacci(int n){
        int a = 0;
        int b = 1;

        for(int i =0; i<n; i++){

            int temp = a;
            a = b;
            b = temp + b;

        }
            System.out.print(a + " ");
    }
}
