package com.bh.samyukgu;

public class Game {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;

        while(n>0){
            int divide = n/10;
            int left = n%10;

            if(divide !=0 && divide%3==0 || left !=0 && left%3==0){
                count++;
                System.out.println("짝");
                if(divide%3 != 0 && left !=0 && left%3==0){
                    count++;
                    System.out.println("짝짝");
                }
            }
        n--;
        }
        System.out.println("총 횟수 : " + count);
    }
}
